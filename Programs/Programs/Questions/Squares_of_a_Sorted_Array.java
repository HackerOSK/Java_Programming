package Programs.Questions;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        for(int i =0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }

        System.out.println(Arrays.toString(nums));
        int[] ans = new int[nums.length];
        int s=0;
        int e=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[s]>nums[e])
            {
                ans[i]=nums[s];
                s++;
            }
            else
            {
                ans[i]=nums[e];
                e--;
            }
        }


        System.out.println(Arrays.toString(ans));


    }
}
