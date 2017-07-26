builds = [:]

println '==== *** PERMUTATIONS RUNS *** ===='
println 'run #1: '
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-rem_srtp=false-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'KILL_CLUSTER': 'true', 'BUILD_CLUSTER': 'true', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}

println 'run #2'
ignore(FAILURE) {
    builds.put("rec=true-chan=2-loc_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-rem_srtp=true-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #3'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-rem_srtp=false-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #4'
ignore(FAILURE) {
    builds.put("rec=true-chan=2-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #5'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=false-rem_srtp_ciph=128-rem_srtp=true-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #6'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #7'
ignore(FAILURE) {
    builds.put("rec=false-chan=1-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #8'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=false-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #9'
ignore(FAILURE) {
    builds.put("rec=true-chan=2-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #10'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #11'
ignore(FAILURE) {
    builds.put("rec=true-chan=2-loc_srtp=false-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #12'
ignore(FAILURE) {
    builds.put("rec=false-chan=1-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #13'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #14'
ignore(FAILURE) {
    builds.put("rec=true-chan=2-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #15'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=false-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #16'
ignore(FAILURE) {
    builds.put("rec=false-chan=1-loc_srtp=false-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #17'
ignore(FAILURE) {
    builds.put("rec=false-chan=1-loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #18'
ignore(FAILURE) {
    builds.put("rec=true-chan=2-loc_srtp=false-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #19'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=true-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #20'
ignore(FAILURE) {
    builds.put("rec=false-chan=1-loc_srtp=false-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #21'
ignore(FAILURE) {
    builds.put("rec=true-chan=2-loc_srtp=false-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #22'
ignore(FAILURE) {
    builds.put("rec=false-chan=1-loc_srtp=false-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #23'
ignore(FAILURE) {
    builds.put("rec=true-chan=1-loc_srtp=false-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #24'
ignore(FAILURE) {
    builds.put("rec=true-chan=2-loc_srtp=true-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}

println '\n########## OTHER PERMUTATIONS ##########'
println 'run #25'
ignore(FAILURE) {
    builds.put("loc_srtp=false-rem_srtp=false-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=false-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #26'
ignore(FAILURE) {
    builds.put("loc_srtp=true-loc_srtp_ciph=256-loc_srtp=80-rem_srtp=true-rem_srtp_ciph=256-rem_srtp_auth=80-hangup=true-rem_dtmf=96-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-256-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-256-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '96', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #27'
ignore(FAILURE) {
    builds.put("loc_srtp=true-loc_srtp_ciph=256-loc_srtp=32-rem_srtp=true-rem_srtp_ciph=256-rem_srtp_auth=32-hangup=true-rem_dtmf=96-loc_dtmf=96", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-256-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-32', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-256-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-32', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '96', 'LOCAL_DTMF_PAYLOAD_TYPE': '96'))
}
println 'run #28'
ignore(FAILURE) {
    builds.put("loc_srtp=true-loc_srtp_ciph=128-loc_srtp=80-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=80-hangup=true-rem_dtmf=101-loc_dtmf=101", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'))
}
println 'run #29'
ignore(FAILURE) {
    builds.put("loc_srtp=true-loc_srtp_ciph=128-loc_srtp=32-rem_srtp=true-rem_srtp_ciph=128-rem_srtp_auth=32-hangup=true-rem_dtmf=101-loc_dtmf=96", build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-32', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-32', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '96'))
}

println '\n==== *** LONGEVITY CONFIGURATION STARTED *** ===='
println 'run #31'
ignore(FAILURE) {
    builds.put("longevity-chan=1", build("tms-edge-load", "BUILD_CLUSTER": "false", "CALLS_RATE": "50", "MAX_SIMULT_CALLS": "600", "RECORD": "true", "LOCAL_CODEC": "PCMU", "REMOTE_CODEC": "PCMU", "LOCAL_SRTP": "true", "LOCAL_SRTP_CIPHER": "aes-128-icm", "LOCAL_SRTP_AUTH": "hmac-sha1-80", "REMOTE_SRTP": "true", "REMOTE_SRTP_CIPHER": "aes-128-icm", "REMOTE_SRTP_AUTH": "hmac-sha1-80", "NUM_LOOPS": "60", "VOICE_TRACE": "3", "MAX_LOSS_PERCENT": "1", "NUM_RUNS": "3", "HANGUP_ON_STAR": "true", "REMOTE_DTMF_PAYLOAD_TYPE": "101", "LOCAL_DTMF_PAYLOAD_TYPE": "101", "NUM_CHANNELS": "1"))
}
println 'run #32'
ignore(FAILURE) {
    builds.put("longevity-chan=2", build("tms-edge-load", "BUILD_CLUSTER": "false", "CALLS_RATE": "50", "MAX_SIMULT_CALLS": "600", "RECORD": "true", "LOCAL_CODEC": "PCMU", "REMOTE_CODEC": "PCMU", "LOCAL_SRTP": "true", "LOCAL_SRTP_CIPHER": "aes-128-icm", "LOCAL_SRTP_AUTH": "hmac-sha1-80", "REMOTE_SRTP": "true", "REMOTE_SRTP_CIPHER": "aes-128-icm", "REMOTE_SRTP_AUTH": "hmac-sha1-80", "NUM_LOOPS": "60", "VOICE_TRACE": "3", "MAX_LOSS_PERCENT": "1", "NUM_RUNS": "3", "HANGUP_ON_STAR": "true", "REMOTE_DTMF_PAYLOAD_TYPE": "101", "LOCAL_DTMF_PAYLOAD_TYPE": "101", "NUM_CHANNELS": "2"))
}

println '\n************ TEST RESULTS *************'

writer = new StringWriter()
builder = new groovy.xml.MarkupBuilder(writer)

builder.testsuite(tests: builds.size()) {
    for (bld in builds) {
        def buildName = bld.key
        def numberOfBuild = hudson.console.HyperlinkNote.encodeTo("/" + bld.value.getUrl(),
                String.valueOf(bld.value.getDisplayName()))
        def statusOfBuild = hudson.console.HyperlinkNote.encodeTo('/' + bld.value.getUrl()
                + "console", bld.value.result.toString())

        if (statusOfBuild.contains("FAILURE")) {
            testcase(name: "$buildName", build_number: "$numberOfBuild") {
                failure()
            }
        } else {
            testcase(name: "$buildName", build_number: "$numberOfBuild")
        }

        build.setResult(build.result.combine(bld.value.result))
    }
}

println writer.toString()

def file = new File("report.xml")
file << result


// ===========

/*for (bld in builds) {
    def buildName = bld.key
    def numberOfBuild = hudson.console.HyperlinkNote.encodeTo("/" + bld.value.getUrl(),
            String.valueOf(bld.value.getDisplayName()))
    def statusOfBuild = hudson.console.HyperlinkNote.encodeTo('/' + bld.value.getUrl()
            + "console", bld.value.result.toString())

//    println "\n[" + buildName + "] build " + numberOfBuild + " status: " + statusOfBuild
    println "\n[$buildName] build $numberOfBuild status: $statusOfBuild"
    // if we have any failed build set whole run to fail
    build.setResult(build.result.combine(bld.value.result))*/
