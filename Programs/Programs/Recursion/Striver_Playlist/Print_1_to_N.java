package Programs.Recursion.Striver_Playlist;

import Programs.Questions.print;

import java.util.Scanner;

public class Print_1_to_N {
    static int c = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1ToN(n);
    }

    private static void print1ToN(int n) {
        if(c>n)
        {
            return;
        }
        System.out.println(c);
        c++;
        print1ToN(n);
    }
}
