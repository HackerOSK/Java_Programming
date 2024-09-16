package Programs.Questions;

import java.util.Arrays;

public class Find_Polygon_With_the_Largest_Perimeter {
    public static void main(String[] args) {
        int[] nums = {1, 12, 1, 2, 5, 50, 3};
        Arrays.sort(nums);

        int[] prefix = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            prefix[i] = sum;
        }

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(nums));
        int count = nums.length;
        for(int i=nums.length-1;i>0;i--)
        {
            if(prefix[i-1]>nums[i] && count>=3)
            {
                System.out.println(prefix[i-1]+nums[i]);
                break;
            }
            count--;
        }

        System.out.println(-1);

    }
}
