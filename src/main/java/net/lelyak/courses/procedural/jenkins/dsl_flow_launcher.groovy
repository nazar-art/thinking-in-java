package net.lelyak.courses.procedural.jenkins


ignore(FAILURE) { build("tms-edge-load", "KILL_CLUSTER": "true", "BUILD_CLUSTER": "true",

        "CALLS_RATE": "50",
        "MAX_SIMULT_CALLS": "400",
        "LOCAL_CODEC": "PCMU",
        "REMOTE_CODEC": "PCMU",
        "NUM_LOOPS": "4",
        "VOICE_TRACE": "0",
        "MAX_LOSS_PERCENT": "1",
        "NUM_RUNS": "3",

        "RECORD": "true",
        "NUM_CHANNELS": "1"
) }

// PERMUTATIONS RUNS
// #1 - Build cluster

ignore(FAILURE) {
    build("tms-edge-load",
            "KILL_CLUSTER": "true",
            "BUILD_CLUSTER": "true",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "RECORD": "true",
            "NUM_CHANNELS": "1"
    )
}
// #2
ignore(FAILURE) {
    build('tms-edge-load',
            'BUILD_CLUSTER': 'false',

            'CALLS_RATE': '50',
            'MAX_SIMULT_CALLS': '400',
            'LOCAL_CODEC': 'PCMU',
            'REMOTE_CODEC': 'PCMU',
            'NUM_LOOPS': '4',
            'VOICE_TRACE': '0',
            'MAX_LOSS_PERCENT': '1',
            'NUM_RUNS': '3',

            'RECORD': 'true',
            'NUM_CHANNELS': '2'
    )
}
// #3
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "RECORD": "false",
            "NUM_CHANNELS": "1"
    )
}

// #4
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "LOCAL_SRTP": "true",
            "LOCAL_SRTP_CIPHER": "aes-128-icm",
            "LOCAL_SRTP_AUTH": "hmac-sha1-80"
    )
}
// #5
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "LOCAL_SRTP": "true",
            "LOCAL_SRTP_CIPHER": "aes-128-icm",
            "LOCAL_SRTP_AUTH": "hmac-sha1-32"
    )
}
// #6
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "LOCAL_SRTP": "true",
            "LOCAL_SRTP_CIPHER": "aes-256-icm",
            "LOCAL_SRTP_AUTH": "hmac-sha1-80"
    )
}
// #7
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "LOCAL_SRTP": "true",
            "LOCAL_SRTP_CIPHER": "aes-256-icm",
            "LOCAL_SRTP_AUTH": "hmac-sha1-32"
    )
}
// #8
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "LOCAL_SRTP": "false",
            "REMOTE_SRTP_CIPHER": "aes-128-icm",
            "REMOTE_SRTP_AUTH": "hmac-sha1-80"
    )
}

// #9 X
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "REMOTE_SRTP": "true",
            "REMOTE_SRTP_CIPHER": "aes-128-icm",
            "REMOTE_SRTP_AUTH": "hmac-sha1-80"
    )
}
// #10
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "REMOTE_SRTP": "true",
            "REMOTE_SRTP_CIPHER": "aes-128-icm",
            "REMOTE_SRTP_AUTH": "hmac-sha1-32"
    )
}
// #11
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "REMOTE_SRTP": "true",
            "REMOTE_SRTP_CIPHER": "aes-256-icm",
            "REMOTE_SRTP_AUTH": "hmac-sha1-80"
    )
}
// #12
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "REMOTE_SRTP": "true",
            "REMOTE_SRTP_CIPHER": "aes-256-icm",
            "REMOTE_SRTP_AUTH": "hmac-sha1-32"
    )
}
// #13
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "REMOTE_SRTP": "false",
            "REMOTE_SRTP_CIPHER": "aes-128-icm",
            "REMOTE_SRTP_AUTH": "hmac-sha1-80"
    )
}

// #14 X
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "HANGUP_ON_STAR": "true",
            "REMOTE_DTMF_PAYLOAD_TYPE": "101",
            "LOCAL_DTMF_PAYLOAD_TYPE": "101"
    )
}
// #15
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "HANGUP_ON_STAR": "true",
            "REMOTE_DTMF_PAYLOAD_TYPE": "101",
            "LOCAL_DTMF_PAYLOAD_TYPE": "96"
    )
}
// #16
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "HANGUP_ON_STAR": "true",
            "REMOTE_DTMF_PAYLOAD_TYPE": "96",
            "LOCAL_DTMF_PAYLOAD_TYPE": "101"
    )
}
// #17
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "HANGUP_ON_STAR": "true",
            "REMOTE_DTMF_PAYLOAD_TYPE": "96",
            "LOCAL_DTMF_PAYLOAD_TYPE": "96"
    )
}
// #18
ignore(FAILURE) {
    build("tms-edge-load",
            "BUILD_CLUSTER": "false",

            "CALLS_RATE": "50",
            "MAX_SIMULT_CALLS": "400",
            "LOCAL_CODEC": "PCMU",
            "REMOTE_CODEC": "PCMU",
            "NUM_LOOPS": "4",
            "VOICE_TRACE": "0",
            "MAX_LOSS_PERCENT": "1",
            "NUM_RUNS": "3",

            "HANGUP_ON_STAR": "false",
            "REMOTE_DTMF_PAYLOAD_TYPE": "101",
            "LOCAL_DTMF_PAYLOAD_TYPE": "101"
    )
}

// LONGEVITY
out.println 'LONGEVITY CONFIGURATION STARTED'
// #19
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


// =============


// good
ignore(FAILURE) {
    b = build('tms-edge-load',
        'BUILD_CLUSTER': 'false',
        'CALLS_RATE': '50',
        'MAX_SIMULT_CALLS': '400',
        'LOCAL_CODEC': 'PCMU',
        'REMOTE_CODEC': 'PCMU',
        'NUM_LOOPS': '4',
        'VOICE_TRACE': '0',
        'MAX_LOSS_PERCENT': '1',
        'NUM_RUNS': '3',
        'RECORD': 'true',
        'NUM_CHANNELS': '2',
)}
println "Build number: $b.build.number"
println "Result: $b.build.status"
println "Result: $b.build.result"


// failed
ignore(FAILURE) { build('tms-edge-load',
        'BUILD_CLUSTER': 'false',

        'CALLS_RATE': '50',
        'MAX_SIMULT_CALLS': '400',
        'LOCAL_CODEC': 'PCMU',
        'REMOTE_CODEC': 'PCMU',
        'NUM_LOOPS': '4',
        'VOICE_TRACE': '0',
        'MAX_LOSS_PERCENT': '1',
        'NUM_RUNS': '3',

        'RECORD': 'true',
        'NUM_CHANNELS': '2',

        'LOCAL_SRTP': 'true',
        'LOCAL_SRTP_CIPHER': 'aes-128-icm',
        'LOCAL_SRTP_AUTH': 'hmac-sha1-80',

        'REMOTE_SRTP': 'true',
        'REMOTE_SRTP_CIPHER': 'aes-128-icm',
        'REMOTE_SRTP_AUTH': 'hmac-sha1-80',

        'HANGUP_ON_STAR': 'false',
        'REMOTE_DTMF_PAYLOAD_TYPE': '101',
        'LOCAL_DTMF_PAYLOAD_TYPE': '101'
)}