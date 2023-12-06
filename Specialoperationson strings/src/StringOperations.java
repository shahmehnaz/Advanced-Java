public class StringOperations {
    public static void main(String[]args){
        //creating string using string literals
        String str="AdvancedJava";
        System.out.println(str);
        //concat strings(simple)
        String str1="Learning";
        String str2=str+str1;
        System.out.println("This is the string "+str2);
        //concat string with other data types
        int a=1;
        String str3=str+str1+a;
        System.out.println(str3);
        //to get length of a string
        System.out.println(str3.length());
        //to convert into uppercase
        System.out.println(str3.toUpperCase());
        //to convert  into lowercase
        System.out.println(str3.toLowerCase());
        //comparing two strings
        if(str1==str2){
            System.out.println("str1 is equal to str2");
        }else{
            System.out.println("str1 not equal to str2");


        }

    }
}
