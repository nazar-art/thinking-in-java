package net.lelyak.courses.procedural.jenkins;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayPermutationExample {

    public static final String FILE_LOCATION = "src/main/resources/jenkins_dsl_build_flow.groovy";

    private static final String PREFIX = "ignore(FAILURE) { build('tms-edge-load', 'BUILD_CLUSTER': 'false', ";
    public static final String ENDING = ")}";

    public static final String DEFAULT_PART_FOR_PERMUTAION = "'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', ";


    // added record: false & num_channels: 1
    public static final String DEFAULT_PART_FOR_OTHER_PERMUTAION = "'CALLS_RATE': '50', 'MAX_SIMULT_CALLS': '400', 'RECORD':'false', 'NUM_CHANNELS':'1', 'LOCAL_CODEC': 'PCMU', 'REMOTE_CODEC': 'PCMU', 'NUM_LOOPS': '4', 'VOICE_TRACE': '0', 'MAX_LOSS_PERCENT': '1', 'NUM_RUNS': '3', ";


    // PERMUTATIONS
    private static String[] perm_1 = new String[]{
            "'RECORD': 'true', 'NUM_CHANNELS': '1', ",
            "'RECORD': 'true', 'NUM_CHANNELS': '2', ",
            "'RECORD': 'false','NUM_CHANNELS': '1', "
    };

    private static String[] perm_2 = new String[]{
            "'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', ",
            "'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', "
    };


    private static String[] perm_3 = new String[]{
            "'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', ",
            "'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', "
    };


    private static String[] perm_4 = new String[]{
            "'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101', ",
            "'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101', "
    };


    // OTHER PERMUTATIONS
    private static String[] other_perm_1 = new String[]{
            "'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'"
    };

    private static String[] other_perm_2 = new String[]{
            "'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-128-icm', 'LOCAL_SRTP_AUTH': 'groovy.lang.MissingMethodException', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'groovy.lang.MissingMethodException', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '96'"
    };

    private static String[] other_perm_3 = new String[]{
            "'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-256-icm', 'LOCAL_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-256-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '96', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'"
    };

    private static String[] other_perm_4 = new String[]{
            "'LOCAL_SRTP': 'true', 'LOCAL_SRTP_CIPHER': 'aes-256-icm', 'LOCAL_SRTP_AUTH': 'groovy.lang.MissingMethodException', 'REMOTE_SRTP': 'true', 'REMOTE_SRTP_CIPHER': 'aes-256-icm', 'REMOTE_SRTP_AUTH': 'groovy.lang.MissingMethodException', 'HANGUP_ON_STAR': 'true', 'REMOTE_DTMF_PAYLOAD_TYPE': '96', 'LOCAL_DTMF_PAYLOAD_TYPE': '96'"
    };

    private static String[] other_perm_5 = new String[]{
            "'LOCAL_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'REMOTE_SRTP': 'false', 'REMOTE_SRTP_CIPHER': 'aes-128-icm', 'REMOTE_SRTP_AUTH': 'hmac-sha1-80', 'HANGUP_ON_STAR': 'false', 'REMOTE_DTMF_PAYLOAD_TYPE': '101', 'LOCAL_DTMF_PAYLOAD_TYPE': '101'"
    };

    // LONGEVITY


    public static void main(String[] args) throws IOException {

        Path usersFile = Paths.get(".", FILE_LOCATION);

        if (!Files.exists(usersFile)) {
            Files.createFile(usersFile);
        }


        Set<String> permutation = ArrayPermutation
                .getCombinations(PREFIX + DEFAULT_PART_FOR_PERMUTAION, ENDING, perm_1, perm_2, perm_3, perm_4);

//        permutation.stream().limit(1).forEach(System.out::println);
        Set<String> firstOne = permutation.stream().limit(1).collect(Collectors.toSet());

        Set<String> otherPermuts = otherPermutationWriter(PREFIX, DEFAULT_PART_FOR_OTHER_PERMUTAION, ENDING, other_perm_1, other_perm_2, other_perm_3, other_perm_4, other_perm_5);

        Files.write(usersFile, otherPermuts, Charset.defaultCharset());

//        permutation.forEach(System.out::println);
    }

    private static Set<String> otherPermutationWriter(String prefix, String defaultPart, String endings, String[]... arr) {
        HashSet<String> result = new HashSet<>();

        for (String[] ar : arr) {
            StringBuilder builder = new StringBuilder(prefix).append(defaultPart);

            String arrayContent = Arrays.toString(ar);
            String queryWithoutBraces = arrayContent.substring(1, arrayContent.length() - 1);
            builder.append(queryWithoutBraces).append(endings);
            result.add(builder.toString());

            builder.setLength(0);
        }
        return result;
    }

}
