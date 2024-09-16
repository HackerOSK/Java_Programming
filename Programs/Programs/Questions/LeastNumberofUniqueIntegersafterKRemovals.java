package Programs.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LeastNumberofUniqueIntegersafterKRemovals {
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(freqmap.containsKey(arr[i]))
            {
                freqmap.put(arr[i], freqmap.get(arr[i])+1);
            }
            else
            {
                freqmap.put(arr[i], 1);
            }
        }

        ArrayList<Integer>key =  new ArrayList<>(freqmap.values());
        Collections.sort(key);
        System.out.println(key);
        int j=0;
        while(k!=0 && j<key.size())
        {
            if(key.get(j)<=k)
            {
                k= k-key.get(j);
                key.set(j,0);
                j++;
            }
            else
            {
                key.set(j,key.get(j)-k);
                k=0;
            }
        }
        int count =0;
        for(int n : key)
        {
            if(n!=0)
            {
                count++;
            }
        }
        System.out.println(count);

        
    }
}
