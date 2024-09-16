package Programs.Questions;

import java.util.Scanner;



public class powerOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double ans = Math.log(a)/Math.log(2);
        System.out.println(ans);
        if(Math.pow(2,31)%a==0)
        {
            System.out.println("Yes!! power of 2 for Index : "+ans);
        }
        else
        {
            System.out.println("No!! Not a power of 2");
        }

    }
}
