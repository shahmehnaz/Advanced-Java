import java.sql.SQLOutput;

public class StringComparison {
    public static void main(String[]args){
        //equals() :compares contents of the string
        String s1 ="HELLO";
        String s2 ="HELLO";
        String s3 ="JAVA";
        String s4 ="ADVANCED JAVA";
        String s5 =new String("HELLO");
        System.out.println(s1+" equals "+s2+"="+s1.equals(s2));
        System.out.println(s1+" equals "+s3+"="+s1.equals(s3));
        System.out.println(s1+" equals "+s5+"="+s1.equals(s5));
        //equalsIgnoreCase:compares two strings while ignoring case
        String s6 ="HELLO";
        String s7 ="hello";
        System.out.println(s6+" equals "+s7+"="+s6.equalsIgnoreCase(s7));
        //== compares hash code of two strings
        String s8 =new String("HELLO");
        System.out.println(s1+" == "+s8+"="+ (s1 == s8));
        //compareTo() checks whether string is greater or less than other string
        //according to dictionary order
                System.out.println(s1.compareTo(s2));//0 because both are equal
                System.out.println(s1.compareTo(s3));//-2 because "h" is 2 times greater than "j"
                System.out.println(s1.compareTo(s4));//7 because "h" is 1 times lower than "j"
                System.out.println(s1.compareTo(s5));//0 because both are equal
        // Java Program to find if substrings
        // or regions of two strings are equal
        //by default it is casesensitive
        System.out.println(s1.regionMatches(2,s2,2,3));
        String s11="I love Java";
        String s12="Java";
        boolean value=s11.endsWith(s12);
        System.out.println(value);
        String s13="Love";
        boolean value1=s11.endsWith(s13);
        System.out.println(value1);
        boolean value3=s11.startsWith(s13);
        System.out.println(value3);

    }
        }









