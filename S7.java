public class S7 {
    //count no of vowel in string 
    public static void main(String[] args) {
        String str = "Ajay kumar";
        System.out.println(vowelcount(str));
        
    }
    static int vowelcount(String str){
        int count  = 0;
       for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
          if(ch == 'a'|| ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ||
            ch == 'A'|| ch == 'E' || ch =='I' || ch == 'O' || ch == 'U'){
                count++;
            }
       }
        return count;
    }
}
