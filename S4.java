public class S4 {
    //some important keyword
    public static void main(String[] args) {
        String str = "My name is Ajay Kumar";
        System.out.println(str);
        System.out.println(str.length());
       System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
         System.out.println(str.toUpperCase());
         System.out.println(str.toLowerCase());
         System.out.println(str.contains("Ajay"));
         System.out.println(str.substring(3,6));
    //print the character array
         char[] crr = str.toCharArray();
         for(char ch : crr){
            System.out.println(ch);
         }

         //split the output array
        String name = "My,name,is,Ajay,Kumar";  
        String[] word = name.split(",") ;
        for(String st: word){
            System.out.println(st);
        }
        // replace old character by new character
        name = name.replace('n', 'v');
        System.out.println(name);
    }
}
