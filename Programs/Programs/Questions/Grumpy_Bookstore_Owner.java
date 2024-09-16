package Programs.Questions;

import java.util.Arrays;

public class Grumpy_Bookstore_Owner {
    public static void main(String[] args) {
        int cust[] = {3,2};
        int grumpy[] = {0,0};
        int min = 3;

        int count =0;
        for(int i=0;i<cust.length;i++)
        {
            if(grumpy[i]==0)
            {
                count+=cust[i];
            }
        }
        System.out.println(count);
        int max =0;
        int s =0;
        int e = min-1;
        while(e<cust.length)
        {
            int a = getsum(cust,s,e,grumpy);
            if(a>max)
            {
                max=a;
            }
            e++;
            s++;
        }

        count+=max;
        System.out.println(count);


    }

        private static int getsum(int[] cust,int s,int e,int g[]) {
            int sum=0;
            for(int i=s;i<=e;i++)
            {
                if(g[i]==1) {
                    sum = sum + cust[i];
                }
            }
            return sum;
        }

}
