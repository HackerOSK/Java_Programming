package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        for(int i = deck.length-1;i>=0;i--)
        {
            if(!q.isEmpty())
            {
                q.add(q.remove());
            }
            q.add(deck[i]);
        }


        for(int i =q.size()-1;i>=0;i--)
        {
            deck[i]=q.remove();
        }

        System.out.println(Arrays.toString(deck));



    }
}
