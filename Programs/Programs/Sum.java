package Programs;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = input.nextInt();
        System.out.println("Enter the Second number : ");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("The Sum of two number "+a+" & "+b+" = "+c);

    }

}
