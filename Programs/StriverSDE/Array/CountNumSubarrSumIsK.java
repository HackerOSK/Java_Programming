package StriverSDE.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class CountNumSubarrSumIsK {
    public static void main(String[] args) {
        int arr [] = {-1,-1,1};
        int k=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int res = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            int diff = sum - k;
            if(map.containsKey(diff))
            {
                res+=map.get(diff);
            }
            if(map.containsKey(sum))
            {
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }

        System.out.println(res);
    }
}
