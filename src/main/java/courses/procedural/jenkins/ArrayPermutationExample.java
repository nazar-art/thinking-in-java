package courses.procedural.jenkins;

import java.util.ArrayList;

public class ArrayPermutationExample {

    private static final String PREFIX = "ignore(FAILURE) { build(\"tsm-edge-load\", ";
    public static final String ENDING = ")}";

    private static String[] arr_1 = new String[] {
            "RECORD: true, NUM_CHANNELS: 1, ",
            "RECORD: true, NUM_CHANNELS: 2, ",
            "RECORD: false, NUM_CHANNELS: 1, "};

    private static String[] arr_2 = new String[] {
            "RECORD: true, NUM_CHANNELS: 1, LOCAL_SRTP: true, LOCAL_SRTP_CIPHER: aes-128-icm, LOCAL_SRTP_AUTH: hmac-sha1-80, ",
            "RECORD: true, NUM_CHANNELS: 1, LOCAL_SRTP: true, LOCAL_SRTP_CIPHER: aes-128-icm, LOCAL_SRTP_AUTH: hmac-sha1-32, ",
            "RECORD: true, NUM_CHANNELS: 1, LOCAL_SRTP: true, LOCAL_SRTP_CIPHER: aes-256-icm, LOCAL_SRTP_AUTH: hmac-sha1-80, ",
            "RECORD: true, NUM_CHANNELS: 1, LOCAL_SRTP: true, LOCAL_SRTP_CIPHER: aes-256-icm, LOCAL_SRTP_AUTH: hmac-sha1-32, ",
            "RECORD: true, NUM_CHANNELS: 1, LOCAL_SRTP: false, REMOTE_SRTP_CIPHER: aes-128-icm, REMOTE_SRTP_AUTH: hmac-sha1-80, "};

    private static String[] arr_3 = new String[] {
            "RECORD: true, NUM_CHANNELS: 1, REMOTE_SRTP: true, REMOTE_SRTP_CIPHER: aes-128-icm, REMOTE_SRTP_AUTH: hmac-sha1-80, ",
            "REMOTE_SRTP: true, REMOTE_SRTP_CIPHER: aes-128-icm, REMOTE_SRTP_AUTH: hmac-sha1-32, ",
            "REMOTE_SRTP: true, REMOTE_SRTP_CIPHER: aes-256-icm, REMOTE_SRTP_AUTH: hmac-sha1-80, ",
            "REMOTE_SRTP: true, REMOTE_SRTP_CIPHER: aes-256-icm, REMOTE_SRTP_AUTH: hmac-sha1-32, ",
            "REMOTE_SRTP: false, REMOTE_SRTP_CIPHER: aes-128-icm, REMOTE_SRTP_AUTH: hmac-sha1-80, "};

    private static String[] arr_4 = new String[] {
            "HANGUP_ON_STAR: true, REMOTE_DTMF_PAYLOAD_TYPE: 101, LOCAL_DTMF_PAYLOAD_TYPE: 101, ",
            "HANGUP_ON_STAR: true, REMOTE_DTMF_PAYLOAD_TYPE: 101, LOCAL_DTMF_PAYLOAD_TYPE: 96, ",
            "HANGUP_ON_STAR: true, REMOTE_DTMF_PAYLOAD_TYPE: 96, LOCAL_DTMF_PAYLOAD_TYPE: 101, ",
            "HANGUP_ON_STAR: true, REMOTE_DTMF_PAYLOAD_TYPE: 96, LOCAL_DTMF_PAYLOAD_TYPE: 96, ",
            "HANGUP_ON_STAR: false, REMOTE_DTMF_PAYLOAD_TYPE: 101, LOCAL_DTMF_PAYLOAD_TYPE: 101, "
    };

    private static void processArrays(String[] ... arrays) {
        ArrayList<String> result = new ArrayList<>();

        for (String[] array : arrays) {
            String[] currentArray = array;
            for (String line : currentArray) {
                // exclude all lines from current array & make concatenation with every line from others

            }
        }
    }

    public static void main(String[] args) {

    }

}
