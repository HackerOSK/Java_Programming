package Programs.PrefixSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary_Subarrays_With_Sum {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        System.out.println(Arrays.toString(nums));
    }
}
