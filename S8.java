public class S8 {
    //reverse of string
    public static void main(String[] args) {
        String str = "Ajay";
        System.out.println(reverseOfString(str));  
    }
    static String reverseOfString(String str){
       String reverse ="";
       int n = str.length();
       for (int i = n-1; i>=0; i--) {
        char ch = str.charAt(i);
        reverse = reverse + ch;
       }
        return reverse;
    }
}
