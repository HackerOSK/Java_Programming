package ImportantQues;

import java.util.Scanner;

//The function accepts two integers n, m as arguments
// Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n.
// Return difference between sum of integers not divisible by n with sum of numbers divisible by n.
public class DifferenceOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the m : ");
        int m = sc.nextInt();
        int notDivi = 0;
        int Divi = 0;
        for(int i=1;i<=m;i++)
        {
            if(i%n==0)
            {
                Divi+=i;
            }else {
                notDivi+=i;
            }
        }

        System.out.println(Math.abs(notDivi-Divi));
    }
}
