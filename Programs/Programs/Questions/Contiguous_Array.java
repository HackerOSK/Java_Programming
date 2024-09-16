package Programs.Questions;

import java.util.Arrays;
import java.util.HashMap;

import static java.util.Collections.max;

public class Contiguous_Array {
    public static void main(String[] args) {
        int status = 0;
        int count = 0;
        int max=0;
        int[] nums ={1,0,0,0,1,1,0,0,1};
        int len = nums.length;
        int[] prefix = new int[len];
        int sum =0;
        for(int i=0;i< len;i++)
        {
            sum = sum + nums[i];
            prefix[i] = sum;
        }

        HashMap<Integer,Integer>freq = new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(freq.containsKey(prefix[i]))
            {
                freq.put(prefix[i],freq.get(prefix[i])+1);
            }
            else
            {
                freq.put(prefix[i],0);
            }
        }

        System.out.println(freq);

        int repeat=0;

        for(int i : freq.keySet())
        {
            repeat=repeat+freq.get(i);
        }
        int maxKey = max(freq.keySet());

        int min = Math.min(repeat,maxKey);

        System.out.println(Arrays.toString(prefix));
        System.out.println(min*2);
    }
}
