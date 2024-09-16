package Programs.Functions;

import java.util.Scanner;

public class SumPassVal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();
        System.out.println("The sum of the numbers = "+sum(num1,num2));
    }

    static int sum(int a,int b)
    {
        return a+b;
    }
}

