package ImportantQues;

import java.util.Scanner;



public class Game_Of_Clicks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lowest channel : ");
        int lowChannel = sc.nextInt();
        System.out.println("Enter the highest channel : ");
        int highChannel = sc.nextInt();
        System.out.println("Blocked Channels : ");
        int b = sc.nextInt();
        int blocked[] = new int[b];
        for(int i = 0;i<b;i++)
        {
            blocked[i]=sc.nextInt();
        }
        System.out.println("View Channel : ");
        int v = sc.nextInt();
        int viewChannel[] = new int[v];
        for(int i=0;i<v;i++)
        {
            viewChannel[i]=sc.nextInt();
        }
        int visited = 0;
        int ans=0;
//        15 14 17 11 17
        for(int i : viewChannel)
        {
            int countDigi = count(i);
            System.out.println("count = "+countDigi);
            int diffChannel = Math.abs(visited-i);
            System.out.println("diff = "+diffChannel);
            if(countDigi<diffChannel)
            {
                ans+=countDigi;
            }else{
                ans+=diffChannel;
            }
            System.out.println("ans = "+ans);
            visited=i;
            System.out.println("visited = "+visited);
        }

        System.out.println(ans);

    }

    private static int count(int i) {
        int c=0;
        while(i>0)
        {
            c++;
            i/=10;
        }
        return c;
    }
}
