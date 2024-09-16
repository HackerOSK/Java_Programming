package Programs.Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Continuous_Subarray_Sum {







//    Time Complexity O(n^2) (TLE)

//    public static void main(String[] args) {
//        int nums[] = {21,2,4,6,7};
//
//        int k = 100000000;
////        suffixsum(nums);
//        prefixsum(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(checkGoodSubarray(nums,k));
//
//
//    }
//
//    private static boolean checkGoodSubarray(int[] nums,int k) {
//        if(k==1 && nums.length>=2)
//        {
//            return true;
//        }
//
//
//        for(int j=0;j<= nums.length-2;j++)
//        {
//            int ans = nums[j];
//            int i = j+2;
//            if(i>=nums.length)
//            {
//                if(ans%k==0)
//                {
//                    return true;
//                }
//                return false;
//            }
//            while(i< nums.length)
//            {
//                if(ans%k!=0)
//                {
//
//                    ans = nums[j];
//                    ans = ans - nums[i];
//                    i++;
//                }if(ans%k==0) {
//
//                    return true;
//                }
//                System.out.println(ans);
//
//            }
//
//        }
//
//        return false;
//    }
//
//    private static void suffixsum(int[] nums) {
//        int sum = nums[(nums.length)-1];
//        for(int i= nums.length-2;i>=0;i--)
//        {
//            nums[i] = nums[i]+sum;
//            sum = nums[i];
//        }
//    }
//    private static void prefixsum(int[] nums) {
//        int sum = nums[0];
//        for(int i= 1;i<nums.length;i++)
//        {
//            nums[i] = nums[i]+sum;
//            sum = nums[i];
//        }
//    }




//    Optimal Solution using Hashmap
//    [23, 2, 4, 6 , 7] , 6
//    Hashmap  [ 0 -> -1]
//    0 -> 23 % 6 = 5
//    Hashmap  [ 0 -> -1] ,[5 -> 0]
//    1 -> 25 % 6 = 1
//    Hashmap  [ 0 -> -1] ,[5 -> 0],[1 -> 1]
//    2 -> 29 % 6 = 5
//    now again remainder is 5 when we get repeat remainder when there is a number present inside the sum which is divisible by 6
//    so now we check the difference between the index if it is greater than or equal to 2 then return true else continue


    public static void main(String[] args) {
        int nums[] = {17,7,2,7};
        int k = 5;
        System.out.println(checkArr(nums,k));




    }

    private static boolean checkArr(int[] nums, int k) {
        HashMap<Integer,Integer> arrSum = new HashMap<>();
        arrSum.put(0,-1);
        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
            int a = nums[i];
            sum = sum + a ;
            int rem = sum % k;
            if(arrSum.containsKey(rem))
            {
                if(Math.abs(i-arrSum.get(rem))>=2)
                {
                    return true;
                }
            }else
            {
                arrSum.put(rem,i);
            }
        }
        return false;
    }


}
