public class Main {
    public static void main(String[] args) {
        //we are creating string using string literals
        //String str = "HELLO";
        //String str1 = "HELLO";
        //comparing hash code of two strings not content
        //if (str == str1) {
        // System.out.println("str == str1");
        ////} else {
        //System.out.println(str != str1);
        // }
        //// }
//}
        String str2 = new String("HELLO");
        String str3 = new String("HELLO");

        if (str2 == str3) {
            System.out.println("str2 == str3");
        } else {
            System.out.println("str2!=str3");
        }
    }
}
        //comparing content of two strings
       // if(str2.equals(str3)) {
           // System.out.println("str2 is equal to str 3");
       //// }else{
          //  System.out.println("str2 is not equal to str3");
      ////  }
        //to compare structure of two strings
        //if (str2.compareTo(str3)==0) {
          //  System.out.println("str2 equal to str3");
        //}else{
        // / /  System.out.println("str2 is not equal to str3");
      // / /}
   // /}
//}
