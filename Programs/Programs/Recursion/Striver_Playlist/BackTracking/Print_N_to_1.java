package Programs.Recursion.Striver_Playlist.BackTracking;

import java.util.Scanner;

public class Print_N_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(1,n);
    }

    private static void printNto1(int i, int n) {
        if(i>n)
        {
            return;
        }
        printNto1(i+1,n);
        System.out.println(i);
    }


}
