builds = [:]

println '==== *** PERMUTATIONS RUNS *** ===='
println 'run #1: '
ignore(FAILURE) {
    builds.put("record_true-num_channels_1-local_srtp_false-remote_srtp_cipher_128-remote_srtp_auth_80-remote_srtp_false-hangup_false-remote_dtmf_101-local_dtmf_101", build('tms-edge-load', 'KILL_CLUSTER': 'true', 'BUILD_CLUSTER': 'true', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}

println 'run #2'
ignore(FAILURE) {
    builds.put("record_true-num_channels_2-local_srtp_false-remote_srtp_cipher_128-remote_srtp_auth_80-remote_srtp_true-hangup_true-remote_dtmf_101-local_dtmf_101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #3'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-remote_srtp=false-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #4'
ignore(FAILURE) {
    builds.put("record=true-num_channels=2-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #5'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=false-remote_srtp_cipher=128-remote_srtp=true-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #6'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #7'
ignore(FAILURE) {
    builds.put("record=false-num_channels=1-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #8'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=false-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #9'
ignore(FAILURE) {
    builds.put("record=true-num_channels=2-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #10'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #11'
ignore(FAILURE) {
    builds.put("record=true-num_channels=2-local_srtp=false-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #12'
ignore(FAILURE) {
    builds.put("record=false-num_channels=1-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #13'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #14'
ignore(FAILURE) {
    builds.put("record=true-num_channels=2-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #15'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=false-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #16'
ignore(FAILURE) {
    builds.put("record=false-num_channels=1-local_srtp=false-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #17'
ignore(FAILURE) {
    builds.put("record=false-num_channels=1-local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #18'
ignore(FAILURE) {
    builds.put("record=true-num_channels=2-local_srtp=false-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #19'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=true-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #20'
ignore(FAILURE) {
    builds.put("record=false-num_channels=1-local_srtp=false-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #21'
ignore(FAILURE) {
    builds.put("record=true-num_channels=2-local_srtp=false-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #22'
ignore(FAILURE) {
    builds.put("record=false-num_channels=1-local_srtp=false-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #23'
ignore(FAILURE) {
    builds.put("record=true-num_channels=1-local_srtp=false-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}
println 'run #24'
ignore(FAILURE) {
    builds.put("record=true-num_channels=2-local_srtp=true-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}

println '\n########## OTHER PERMUTATIONS ##########'
println 'run #25'
ignore(FAILURE) {
    builds.put("local_srtp=false-remote_srtp=false-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=false-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #26'
ignore(FAILURE) {
    builds.put("local_srtp=true-local_srtp_cipher=256-local_srtp_auth=80-remote_srtp=true-remote_srtp_cipher=256-remote_srtp_auth=80-hangup=true-remote_dtmf=96-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-256-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-256-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '96', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #27'
ignore(FAILURE) {
    builds.put("local_srtp=true-local_srtp_cipher=256-local_srtp_auth=32-remote_srtp=true-remote_srtp_cipher=256-remote_srtp_auth=32-hangup=true-remote_dtmf=96-local_dtmf=96", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-256-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-32', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-256-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-32', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '96', 'LOCAL_DTMF_PAYLOAD_TYPE': '96'))
}
println 'run #28'
ignore(FAILURE) {
    builds.put("local_srtp=true-local_srtp_cipher=128-local_srtp_auth=80-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=80-hangup=true-remote_dtmf=101-local_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #29'
ignore(FAILURE) {
    builds.put("local_srtp=true-local_srtp_cipher=128-local_srtp_auth=32-remote_srtp=true-remote_srtp_cipher=128-remote_srtp_auth=32-hangup=true-remote_dtmf=101-local_dtmf=96", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-32', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-32', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '96'))
}

println '\n==== *** LONGEVITY CONFIGURATION STARTED *** ===='
println 'run #31'
ignore(FAILURE) {
    builds.put("longevity-num_channels=1", build("tms-edge-load", "BUILD_CLUSTER": "false", "CALLS_RATE": "50", "MAX_SIMULT_CALLS": "600", "RECORD": "true", "LOCAL_CODEC": "PCMU", "REMOTE_CODEC": "PCMU", "LOCAL_SRTP": "true", "LOCAL_SRTP_CIPHER": "aes-128-icm", "LOCAL_SRTP_AUTH": "hmac-sha1-80", "REMOTE_SRTP": "true", "REMOTE_SRTP_CIPHER": "aes-128-icm", "REMOTE_SRTP_AUTH": "hmac-sha1-80", "NUM_LOOPS": "60", "VOICE_TRACE": "3", "MAX_LOSS_PERCENT": "1", "NUM_RUNS": "3", "HANGUP_ON_STAR": "true", "REMOTE_DTMF_PAYLOAD_TYPE": "101", "LOCAL_DTMF_PAYLOAD_TYPE": "101", "NUM_CHANNELS": "1"))
}
println 'run #32'
ignore(FAILURE) {
    builds.put("longevity-num_channels=2", build("tms-edge-load", "BUILD_CLUSTER": "false", "CALLS_RATE": "50", "MAX_SIMULT_CALLS": "600", "RECORD": "true", "LOCAL_CODEC": "PCMU", "REMOTE_CODEC": "PCMU", "LOCAL_SRTP": "true", "LOCAL_SRTP_CIPHER": "aes-128-icm", "LOCAL_SRTP_AUTH": "hmac-sha1-80", "REMOTE_SRTP": "true", "REMOTE_SRTP_CIPHER": "aes-128-icm", "REMOTE_SRTP_AUTH": "hmac-sha1-80", "NUM_LOOPS": "60", "VOICE_TRACE": "3", "MAX_LOSS_PERCENT": "1", "NUM_RUNS": "3", "HANGUP_ON_STAR": "true", "REMOTE_DTMF_PAYLOAD_TYPE": "101", "LOCAL_DTMF_PAYLOAD_TYPE": "101", "NUM_CHANNELS": "2"))
}

println '\n************ TEST RESULTS *************'

for (bld in builds) {
    println "[" + bld.key + "] build " + hudson.console.HyperlinkNote.encodeTo("/" + bld.value.getUrl(),
            String.valueOf(bld.value.getDisplayName())) +
            " status: " + hudson.console.HyperlinkNote.encodeTo('/' + bld.value.getUrl() + "console",
            bld.value.result.toString())

    build.setResult(build.result.combine(bld.value.result))
}