package Programs.Questions;

import java.util.Arrays;

public class Minimum_Difference_Between_Largest_and_Smallest_Value_n_Three_Moves {
    public static void main(String[] args) {
        int nums[] = {3,100,20};
        System.out.println(mindiff(nums));

    }

    private static int mindiff(int[] nums) {
        int l = nums.length-1;
        Arrays.sort(nums);
        reverseArr(nums);
        int count = 0;
        int min = Integer.MAX_VALUE;
        int countstart = l-count;
        while(countstart>=0 && count<=3)
        {
            if(countstart<0)
            {
                countstart=0;
                count--;
            }
            for(int i=0;i<=count;i++)
            {
                int diff = nums[i] - nums[countstart];
                if(min > diff)
                {
                    min = diff;
                }
                countstart++;
            }
            count++;
            countstart = l-count;
        }

        return min;
    }

    private static void reverseArr(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
