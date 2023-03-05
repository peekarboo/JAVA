import java.util.Arrays;
public class Main {
    public static boolean areAnagrams(String stringOne, String stringTwo) {
        if (stringOne.length() != stringTwo.length()) {
            return false;
        }
        char[] chars1 = stringOne.toCharArray();
        char[] chars2 = stringTwo.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}