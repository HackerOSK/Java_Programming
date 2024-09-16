package Programs.Recursion.Striver_Playlist;

import java.util.Scanner;

public class Print_N_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(n);
    }

    private static void printNto1(int n) {
        if(n<1)
        {
            return;
        }
        System.out.println(n);
        printNto1(--n);
    }

}
