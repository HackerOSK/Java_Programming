package Programs.Recursion.Striver_Playlist;

import Programs.Sum;

import java.util.Scanner;

public class Sum_of_First_N_numbers {
    public static void main(String[] args) {
        System.out.println("Enter the n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Parametrised
        SumofN(n,0);
//        Functional
        System.out.println("Functional Recurssion Sum : "+Sumofn(n));
    }

    private static int Sumofn(int n) {
        if(n<1)
        {
            return 0;
        }
        return Sumofn(n-1)+n;
    }

    private static void SumofN(int n, int sum) {
        if(n<1)
        {
            System.out.println("Parameterised Recurssion Sum : "+sum);
            return;
        }
        SumofN(n-1,sum+n);
    }
}
