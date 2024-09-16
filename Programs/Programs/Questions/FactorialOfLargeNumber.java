package Programs.Questions;

import java.util.Scanner;

public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        int[] ans = new int[5000];
        ans[0]=1;
        int ans_size = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find factorial : ");
        int num = in.nextInt();

        for(int i=2;i<=num;i++) {
            ans_size = factorial(ans, i, ans_size);
        }

        System.out.println("Factorial of : "+num);
        for(int j=ans_size-1;j>=0;j--)
        {
            System.out.print(ans[j]);
        }


    }

    private static int factorial(int[] ans, int i, int ans_size) {
        int carry = 0;
        for(int j=0;j<ans_size;j++)
        {
            int prod = ans[j]*i + carry;
            ans[j] = prod%10;
            carry = prod/10;
        }
        while(carry!=0)
        {
            ans[ans_size]=carry%10;
            carry = carry/10;
            ans_size++;
        }

        return ans_size;
    }
}

