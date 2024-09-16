package Programs.Codeft;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add = 0;



        while(n>0) {

            int t = sc.nextInt();
            ArrayList<Integer> q1 = new ArrayList<>();
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0;i<t;i++)
            {
                add = sc.nextInt();
                q1.add(add);
            }
            ans.add(q1.size());
            while(t>0) {

                q1.remove(0);
                updateQueue(q1);
                checkpatience(q1);
                ans.add(q1.size());
                if(q1.size()==0)
                {
                    break;
                }
                t--;
            }
            for(int i : ans)
            {
                System.out.print(i+" ");
            }
            System.out.println();

            n--;
        }

    }

    private static void checkpatience(ArrayList<Integer> q1) {
        for(int i=0;i<q1.size();i++)
        {
            if(q1.get(i)==0)
            {
                q1.remove(i);
            }
        }
    }

    private static void updateQueue(ArrayList<Integer> q1) {
        for(int i =0;i<q1.size();i++)
        {
            q1.set(i,q1.get(i)-1);
        }
    }


}
