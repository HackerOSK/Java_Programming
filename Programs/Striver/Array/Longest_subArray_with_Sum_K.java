package Striver.Array;

import java.util.Arrays;

public class Longest_subArray_with_Sum_K {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int target = 3 ;
        int max=0;
        int countarr =0;

//        brute force
//        time complexity => O[n^2]

//        for(int i=0;i<arr.length;i++)
//        {
//            int sum =0;
//            int count=0;
//            for(int j=i;j<arr.length;j++)
//            {
//                count++;
//                sum = sum + arr[j];
//                if(sum==target)
//                {
//                    if(count>max)
//                    {
//                        max=count;
//                    }
//                    countarr++;
//                    break;
//
//                }
//                else if(sum>target)
//                {
//                    break;
//                }
//
//            }
//
//        }
//
//        System.out.println(max);
//        System.out.println(countarr);
        int sum=0;
        int[] prefixsum = new int[arr.length];

        int i=0;
        while (i<arr.length)
        {
            sum = sum + arr[i];
            if(sum<=target)
            {
                prefixsum[i] = sum;
                i++;
            }

            else
            {
                if(sum-arr[i]<=target)
                {
                    sum = arr[i];

                }
                else {
                    sum = 0;
                    i++;
                }
            }
        }

        System.out.println(Arrays.toString(prefixsum));
    }
}
