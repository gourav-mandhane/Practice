package hackerrank.strings;


/**
 * A special substring is any substring of a string which meets one of those criteria.
 * Given a string, determine how many special substrings can be formed from it.
 *
 * For example, given the string , we have the following special substrings:
 */
public class SpecialStrings {
    public static void main(String[] args) {
        int result = solution("aaaa");
    }

    private static int solution(String input) {
        if (input == null || input.isEmpty())
            return 0;
        if (input.length() == 1) {
            return 1;
        }
        if (input.length() == 2) {
            if (input.charAt(0) == input.charAt(1)) {
                return 3;
            } else {
                return 2;
            }
        }

        int result = input.length();

        for (int i = 0 ;i<input.length();i++) {

        }
        return 0;
    }

    int solution2() {
        return 0;
    }
}
