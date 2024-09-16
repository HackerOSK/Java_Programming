package Programs;

import java.util.Scanner;

public class Digit_Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Long number : ");
        long num = in.nextLong();
        System.out.println("Enter the digit which Occurrence do you want to count : ");
        int digit = in.nextInt();
        int Occur = 0;
        long res =0;
        while(num!=0)
        {
            res = num%10;
            if(res==digit)
            {
                Occur++;
            }
            num=num/10;
        }

        System.out.println("Occurrence of "+digit+" is : "+Occur);
    }
}
