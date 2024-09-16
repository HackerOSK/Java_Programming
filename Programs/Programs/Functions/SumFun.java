package Programs.Functions;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        System.out.println("The Sum of the numbers : "+sum());// Method Calling
    }

    static int sum () // Method initialisation & definition
    {
//        Void return type denotes the function return nothing
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;  // Returning the integer "sum"
    }
}
