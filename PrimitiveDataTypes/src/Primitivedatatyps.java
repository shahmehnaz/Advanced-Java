import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class Primitivedatatyps {
    int x; //instance variable
    float y; //instance variable
    double z;//instance variable
    boolean c; //instance variable
    public static void main(String[] args) {

       //// Primitivedatatyps VAL= new Primitivedatatyps();
       // System.out.println(VAL.c);
        //int a; //local variable
        //System.out.println(a);//because a is primitive data type so is showing error
        //conversion of primitive type to object called Autoboxing
        int val=19;
        //contructor method
        Integer i =new Integer  (val);
        int a=i;
        System.out.println(a);

        //by using static factory
       Integer val1 =Integer.valueOf(val);
       //unboxing
       int b=val1.intValue();
       System.out.println(val1);
       //unboxing:converting objects into primitive data types

        //can directly pass the value also
        Integer val2 =Integer.valueOf(19);
        System.out.println(19);
        //convert object into primitive  called unboxing/Integer val2 = val1.intValue();
        //System.out.println(val2);
        //Autoboxing
        int c =2;
       // ArrayList lis=new ArrayList();
       ArrayList<Integer> lis = new ArrayList<Integer>();//it will through error because in collections primitive
        // don't work we need wrapper class or we can say object for it
        lis.add(7);
        lis.add(c);
        System.out.println(lis);
        //Unboxing
        //int c=lis.get(1);
        //System.out.println(c);





    }

}
