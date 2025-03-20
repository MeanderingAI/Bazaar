package ai.meandering.bazaar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Utils {
    private static char[] AlphabetSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z'};
    private static Random rng = new Random(12313);


    public static String generateRandomString(int count) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < count) {
            int tmp = rng.nextInt(AlphabetSet.length);
            sb.append(AlphabetSet[tmp]);
            i++;
        }
        return sb.toString();
    }

    public static String nextLexicographicalString(String str) {
        char[] chars = str.toCharArray();
        if (chars.length == 0) {
            return "a";
        }
        if (chars[chars.length-1] == 'z') {
            return str + 'a';
        } else {
            char newChar = (char) (chars[chars.length -1] + 1);
            return str.substring(0, str.length()-1) + newChar;
        }
    }

    public static String getLastSegment(String str) {
        int last_token_start = str.lastIndexOf('/');
        if (last_token_start == -1) {
            throw new RuntimeException("Expected a '/' in the string; recieved " + str);
        }
        String last_token = str.substring(last_token_start+1);
        return last_token;
    }
}