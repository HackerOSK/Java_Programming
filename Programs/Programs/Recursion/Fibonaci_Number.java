package Programs.Recursion;

import java.util.Scanner;

public class Fibonaci_Number {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter which fibonaci number do you want :  ");
//        int n = in.nextInt();
//        System.out.println(fibo(0,1,n-2));
//    }
//    private static int fibo(int i, int i1, int i2) {
//        if(i2==0)
//        {
//            return i+i1;
//        }
//        return fibo(i1,i+i1,--i2);
//
//    }


    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    private static int fibo(int i) {
        if(i<2)
        {
            return i;
        }
        return fibo(i-1) + fibo(i-2);
    }
}
