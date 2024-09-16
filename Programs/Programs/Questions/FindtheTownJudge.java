package Programs.Questions;

import java.util.HashSet;

public class FindtheTownJudge {
    public static void main(String[] args) {
        int n = 4;
        int[][] trust = {{1,3},{1,4},{2,3}};
        int freqA[] = new int[n+1];

        for(int i=0;i< trust.length;i++)
        {
            freqA[trust[i][1]]++;
        }
        int ans=0;

        for(int i=1;i<n+1;i++)
        {
            if(freqA[i]==n-1)
            {
                ans = i;
                break;
            }
        }

        for(int i=0;i<trust.length;i++)
        {
            if(trust[i][0]==ans)
            {
                System.out.println(-1);
                break;
            }
        }

        System.out.println(ans);


    }
}
