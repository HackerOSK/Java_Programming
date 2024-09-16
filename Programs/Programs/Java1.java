package Programs;

import java.util.Scanner;

public class Java1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Add(a,b);
        System.out.println(c);
    }

    private static int Add(int a, int b) {
        int c = a+b;
        return c;
    }
}