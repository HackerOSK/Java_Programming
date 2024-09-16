package Programs.Codeft;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;



        while(n>0)
        {
            int ans=0;
            int breed = sc.nextInt();
            int[] arr = new int[breed];
            for(int i=0;i<breed;i++)
            {
                arr[i] = sc.nextInt();
            }
            int min = Arrmin(arr);
            while(true)
            {
                if(check(arr,min))
                {

                    for(int i: arr)
                    {
                        ans = ans + (i/min);
                    }
                    break;
                }
                else
                {
                    if(min>1) {
                        min--;
                    }
                    else
                    {
                        break;
                    }
                }

            }
            if(t==n)
            {
                System.out.println();
            }
            System.out.println(ans);
            n--;
        }

    }

    private static boolean check(int[] arr, int min) {
        for(int i: arr)
        {
            if(i%min!=0)
            {
                return false;
            }
        }

        return true;
    }

    private static int Arrmin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i : arr)
        {
            if(i<min)
            {
                min=i;
            }
        }


        return min;
    }
}
