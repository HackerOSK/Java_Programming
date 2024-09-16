package Programs.Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of numbers 10 & 34 = "+ add(10,34));
        System.out.println("Sum of numbers 10 & 34 & 20 = "+ add(10,34,20));
        System.out.println(add("Raj","Patel"));
        demoVarArg(1,2,3,4,5,6,7); //[1, 2, 3, 4, 5, 6, 7]
        demoVarArg("kar","soh","nand","sun"); //[kar, soh, nand, sun]
        //demoVarArg(); // here when we overload any function with variable length argument then we cannot run that function without putting a argument we cannot make argument null here since Ambiguity created since one line calling multiple functions at a time
    }


    static int add(int a,int b)
    {
        return a+b;
    }

    static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    static String add(String a,String b)
    {
        return a+" "+b;
    }

    static void demoVarArg(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void demoVarArg(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
