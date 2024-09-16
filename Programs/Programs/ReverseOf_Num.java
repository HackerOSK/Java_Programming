package Programs;

import java.util.Scanner;

public class ReverseOf_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse : ");
        long num = in.nextLong();
        long res = 0;
        long rem=0;
        while(num!=0)
        {
            rem = num%10;
            res = res*10 + rem;
            num = num/10;
        }


        System.out.println("Reverse of given Number : "+res);

    }
}
