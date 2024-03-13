import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     *
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        if (str == null || str.length() == 0){
            return 0;
        }

        int a = 1;
        int b = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                b++;
            } else {
                a = Math.max(a, b);
                b = 1;
            }
        }

        a = Math.max(a, b);

        return a;
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     *
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        StringBuilder s = new StringBuilder();
        char[] k = str.toCharArray();
        for (int i = 0; i <= str.length() - 1; i++) {
            int c = (int) k[i];
            if (i == str.length() - 1) {
                if (c < 48 || c > 57) {
                    s.append(k[i]);

                }

            } else {
                if (c >= 48 && c <= 57) {
                    for (int j = 1; j <= (c - 48); j++) {
                        s.append(k[i + 1]);
                    }
                    if ((int)k[i + 1] < 48 || (int)k[i + 1] > 57) {
                        i++;
                    }
                } else {
                    s.append(k[i]);
                }
            }
        } // YOUR CODE HERE
        return s.toString();
    }


        /**
         * Given 2 strings, consider all the substrings within them
         * of length len. Returns true if there are any such substrings
         * which appear in both strings.
         * Compute this in linear time using a HashSet. Len will be 1 or more.
         */
        public static boolean stringIntersect (String a, String b,int len){
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i <= a.length() - len; i++) {
                set.add(a.substring(i, i + len));
            }

            for (int i = 0; i <= b.length() - len; i++) {
                if (set.contains(b.substring(i, i + len))) {
                    return true;
                }
            }

            return false;
        }
    }
