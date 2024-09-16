package Programs;

import java.util.Scanner;

public class Fibonacci_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =0;
        int b =1;
        int res = 0;
        int count = 1;
        System.out.println("Enter which fibonacci number do you want : ");
        int n = input.nextInt();

//        Using For Loop
//        for(int i=1;i<n;i++)
//        {
//            res = a+b;
//            a = b;
//            b = res;
//        }

//        Using While Loop
//        while(count<n)
//        {
//            res = a+b;
//            a=b;
//            b=res;
//            count++;
//        }


        System.out.println("The "+n+"th Fibonacci Number is : "+ res);


    }

}
