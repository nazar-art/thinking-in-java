println 'PERMUTATIONS RUNS'

ignore(FAILURE) {
    build('tms-edge-load', 'KILL_CLUSTER': 'true', 'BUILD_CLUSTER': 'true', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'RECORD': 'true', 'NUM_CHANNELS': '2', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',)
}

println 'OTHER PERMUTATIONS'

ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101')
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-256-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-256-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '96', 'LOCAL_DTMF_PAYLOAD_TYPE': '101')
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-256-icm', 'LOCAL_SRTP_AUTH': hmac - sha1 - 32, 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-256-icm', 'REMOTE_SRTP_AUTH': hmac - sha1 - 32, 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '96', 'LOCAL_DTMF_PAYLOAD_TYPE': '96')
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101')
}
ignore(FAILURE) {
    build('tms-edge-load', 'BUILD_CLUSTER': 'false', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD': 'false', 'NUM_CHANNELS': '1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', 'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': hmac - sha1 - 32, 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': hmac - sha1 - 32, 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '96')
}

println 'THE END OF THE RUN'

println 'LONGEVITY'








ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "600",
            "RECORD": "true",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "LOCAL_SRTP": "true",
            "LOCAL_SRTP_CIPHER": "aes-128-icm",
            "LOCAL_SRTP_AUTH": "hmac-sha1-80",
            "REMOTE_SRTP": "true",
            "REMOTE_SRTP_CIPHER": "aes-128-icm",
            "REMOTE_SRTP_AUTH": "hmac-sha1-80",

            "NUM_LOOPS": "60",
            "VOICE_TRACE": "3",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "HANGUP_ON_STAR": "true",
            "REMOTE_DTMF_PAYLOAD_TYPE": "101",
            "LOCAL_DTMF_PAYLOAD_TYPE": "101",

            "NUM_CHANNELS": "1"
    )
}
// #20
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "600",
            "RECORD": "true",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "LOCAL_SRTP": "true",
            "LOCAL_SRTP_CIPHER": "aes-128-icm",
            "LOCAL_SRTP_AUTH": "hmac-sha1-80",
            "REMOTE_SRTP": "true",
            "REMOTE_SRTP_CIPHER": "aes-128-icm",
            "REMOTE_SRTP_AUTH": "hmac-sha1-80",

            "NUM_LOOPS": "60",
            "VOICE_TRACE": "3",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "HANGUP_ON_STAR": "true",
            "REMOTE_DTMF_PAYLOAD_TYPE": "101",
            "LOCAL_DTMF_PAYLOAD_TYPE": "101",

            "NUM_CHANNELS": "2"
    )
}



builds = [:]
ignore(FAILURE) {
    builds.put('test_job_name', build('tms-edge-load', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '1', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '1', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}

for (bld in builds) {
    println "\nFinished execution for: " + bld.key +
            "Build " + hudson.console.HyperlinkNote.encodeTo("/" + bld.value.getUrl(),
                    String.valueOf(bld.value.getDisplayName())) +
            " status:" + hudson.console.HyperlinkNote.encodeTo('/' + bld.value.getUrl() + "console",
                    bld.value.result.toString())
}

// ====================

builds = []

ignore(FAILURE) {
    builds.add(build('tms-edge-load', 'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '1', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '1', 'RECORD': 'true', 'NUM_CHANNELS': '1', 'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101',))
}

for (b in builds) {
    out.println "Build #" + hudson.console.HyperlinkNote.encodeTo("/" + b.getUrl(),
                    String.valueOf(b.getDisplayName())) +
            " with status: " + hudson.console.HyperlinkNote.encodeTo('/' + b.getUrl() + "console",
                    b.getResult().toString())

    build.setResult(build.getResult().combine(b.getResult()))
}

