package Programs.Recursion.Striver_Playlist;

import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = getNthFibo(n);
        System.out.println(ans);
    }

    private static int getNthFibo(int n) {
        if(n<=0)
        {
            return 0;
        }else if(n==1)
        {
            return 1;
        }
        return getNthFibo(n-1)+getNthFibo(n-2);

    }
}
