public class StringOperations {
    public static void main(String[] args) {
        //concat of two strings
        String str1="hello";
        String str2="world";
        System.out.println("The string is "+str1+str2);//concatenates two strings
        //concat string with other data types
         int a=12;
        String str="2";
        System.out.println("This is the number "+a+str);//concatenates string with other data types
        System.out.println(str.length());//returns the length of the string
        System.out.println(a+str+2+2);
        System.out.println(a+3+4);
        System.out.println(str+(2+2));
        //compares two boolean values
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        // method will give the result of equals method on b1,b2 to b3
        if (b1.equals(b2)) {
            System.out.println("equals() method returns true");
        } else {
            System.out.println("equals() method returns false");
            //to change case
            String txt = "Hello World";
            System.out.println(txt.toUpperCase());
            System.out.println(txt.toLowerCase());
            //equalsIgnoreCase
            String myStr1 = "Hello";
            String myStr2 = "HELLO";
            String myStr3 = "Another String";
            System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
            System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
            //return character at specific index
            System.out.println(myStr1.charAt(3));

        }
    }
}
