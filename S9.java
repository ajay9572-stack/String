public class S9 {
    //check a string a palindrome sring or not

    public static void main(String[] args) {
        String str = "mam";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }
    static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}