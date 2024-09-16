package Programs.Questions;

import java.util.Arrays;

public class Minimum_Increment_to_Make_Array_Unique {
    public static void main(String[] args) {
        int nums[] = {3,2,1,2,1,7};
//        6
//        1,1,2,2,3,7

//        Wrong Answer for bigger inputs
//        int freqarr[] = new int[1000001];
//        for(int i: nums)
//        {
//            freqarr[i]++;
//        }
//        int c = 0;
//        for(int i=0;i<nums.length;i++)
//        {
//
//                while(freqarr[i]>1) {
//                    int j = i;
//                    while (freqarr[j] != 0) {
//                        j++;
//                    }
//                    c = c + (j - i);
//                    freqarr[j]++;
//                    freqarr[i]--;
//                }
//
//
//        }



//        TLE
//        int c=0;
//        for(int i=0;i<nums.length-1;i++)
//        {
//            for(int j=i+1;j<nums.length;j++)
//            {
//                if(nums[i]>nums[j])
//                {
//                    int temp = nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                }else if(nums[i]==nums[j])
//                {
//                    nums[j]++;
//                    c++;
//                }
//            }
//        }
        int c=0;
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++)
        {
           if(nums[i]<=nums[i-1])
           {
               c = c + (nums[i-1]-nums[i])+1;
               nums[i] = nums[i-1]+1;
           }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(c);
//        System.out.println(Arrays.toString(freqarr));
    }


}
