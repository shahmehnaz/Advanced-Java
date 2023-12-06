public class charcterextraction {
    public static void main(String[] args) {
        //to return character at specific index
        String str = "AdvancedJava";
        char ch = str.charAt(5);
        System.out.println("The character at index 5 is "+ch);
        //to return substring
        String str1 = "Advancedjava";
        String subStr = str1.substring(8, 12);
        System.out.println("The substring is "+ subStr);
        //returns an array of characters for entire string
        String str3 = "Programming";
        char[] charArray = str3.toCharArray();
        System.out.println(charArray);
        System.out.println(charArray[6]);
        //to extract more than one character
        char[] array=new char[11];
        str3.getChars(0,11,array,0);
        System.out.println(array);

    }
}
