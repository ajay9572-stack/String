public class S6 {
    //count length of string without length()
    public static void main(String[] args) {
        String str = "Ajay";
        System.out.println(lengthOfString(str));  
    }
    static int lengthOfString(String str){
        int count  = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        return count;
    }
}
