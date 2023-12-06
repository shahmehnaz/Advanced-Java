import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Strings{
    public static void main(String[] args) {
      //   creating string by string literal
         String str = "HELLO\n";
        String str1 = new String("HELLO");
        System.out.printf(str);
        System.out.printf(str1);

     //Java code to implement
// equals() method of Boolean class

            Boolean a=new Boolean(true);
            Boolean b = new Boolean(false);

            // compare method
            System.out.println(a + " comparing with " + b
                    + " = " + a.equals (b));
            //eualsIgnoreCaes()
        String myStr1 = "Hello";
        String myStr2 = "HELLO";
        String myStr3 = "Another String";
        System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
        System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
        }
}


