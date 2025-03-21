package bazaar;

import java.util.Random;

/**
 * Utils class for various helper methods.
 */
public class Utils {
    private static char[] AlphabetSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z'};
    private static Random rng = new Random(12313);

    /**
     * Generate a random string of lowercase letters.
     * 
     * @param count the length of the string to generate
     * @return a random string of lowercase letters
     */
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

    /**
     * Generate the next lexicographical string.
     * 
     * @param str a string to increment
     * @return the next lexicographical string
     */
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

    /**
     * Generate the next lexicographical string.
     * 
     * @param str a string which has a '/' in it
     * @return the string after the latest '/'
     * 
     * @throws RuntimeException if there is no '/' in the string
     */
    public static String getLastSegment(String str) {
        int last_token_start = str.lastIndexOf('/');
        if (last_token_start == -1) {
            throw new RuntimeException("Expected a '/' in the string; recieved " + str);
        }
        String last_token = str.substring(last_token_start+1);
        return last_token;
    }
}