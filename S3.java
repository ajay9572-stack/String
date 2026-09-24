public class S3 {
    //Comparing string
    public static void main(String[] args) {
        String str1 = "Ajay";
        String str2 = "Ajay";
        String str3 = "ajay";

        if(str1 == str2){
          System.out.println("Botth are eqaul");
        }else{
          System.out.println("Both are not equal");
        }

         if(str1.equals(str3)){
          System.out.println("Botth are eqaul");
        }else{
          System.out.println("Both are not equal");
        }

         if(str1.equalsIgnoreCase(str2)){
          System.out.println("Botth are eqaul");
        }else{
          System.out.println("Both are not equal");
        }


         if(str1.equalsIgnoreCase(str3)){
          System.out.println("Botth are eqaul");
        }else{
          System.out.println("Both are not equal");
        }
    }
}
