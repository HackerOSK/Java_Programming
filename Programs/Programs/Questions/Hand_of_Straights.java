package Programs.Questions;

import java.util.Arrays;

public class Hand_of_Straights {
    public static void main(String[] args) {
        int hand[] = {1,2,2,3,3,3,4,4,5};
        int grpsize = 4;
        Arrays.sort(hand);
//         1 2 2 3 3 4 6 7 8
//         x 2 2 3
//         x x 2 3 3 4
//         x x 2 x 3 4
//         x x x x 3
//         x x x x x x

        boolean ans = true;
        int x = 0;
        while(x< hand.length)
        {
            int i = x;
            int j = x+1;
            int c = 1;
            while(c!=grpsize)
            {
                if(j== hand.length)
                {
                    ans = false;
                    break;
                }
                else
                {
                    if(hand[j]-hand[i]==1)
                    {
                        c++;
                        hand[i] = -1;
                        i = j;
                        if(c==grpsize)
                        {
                            hand[i] = -1;
                        }
                    }
                    j++;
                }

            }
            if(ans==false || j== hand.length)
            {
                break;
            }
            while(hand[x]==-1 && x< hand.length-1)
            {
                x++;
            }
        }
        if(ans==true)
        {
            for(int i : hand)
            {
                if(i!=-1)
                {
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans);

    }
}
