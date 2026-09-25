public class S5 {
    //print each character of the String
public static void main(String[] args) {
        String str ="Ajay";
        printString(str); 
}
    static  void printString(String str){
        int n = str.length();
        for(int i = 0; i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
    
}