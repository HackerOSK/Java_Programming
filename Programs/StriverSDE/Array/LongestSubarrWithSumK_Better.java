package StriverSDE.Array;

import java.util.HashMap;

public class LongestSubarrWithSumK_Better {
    public static void main(String[] args) {
//        int arr [] = {-1,-1,1};
        int arr [] = {-1,1,0};
        int target = 0;
        //        If there are zeros inside the array then we update the prefixsumkey value if there is any smaller value than previous one
//        [2,0,0,0,3]    target = 3
//        [2,0]  next [2,1] next [2,2] next [2,3] next 5-3= 2 is present but it's index is 3 now which gives us shortest subarray but required one is 0 which gives us longest subarray
//        so we make a small change while updating the map

//        int arr[] = {2,0,0,0,3};
//        int target = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int diff = 0;
        int max = 0;
        int sum =0;
        for(int i =0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==target)
            {
                if(!map.containsKey(sum)) {
                    map.put(sum, i);
                }
                if(max<i+1)
                {
                    max=i+1;
                }
            }
            int getKey = sum-target;
            if(getKey>0)
            {
                if(map.containsKey(getKey))
                {
                    diff=i-map.get(getKey);
                    if(diff>max)
                    {
                        max=diff;
                    }
                }
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(max);


    }
}
