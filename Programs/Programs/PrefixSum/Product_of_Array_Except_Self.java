package Programs.PrefixSum;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
//    public static void main(String[] args) {
//        int[] nums = {-1,1,0,-3,3};
//        int len = nums.length;
//        int[] answer = new int[len];
//        int[] prefixMul = new int[len];
//        int[] suffixMul = new int[len];
//
//        int mul = 1;
//        for(int i=0;i<len;i++)
//        {
//            mul = mul * nums[i];
//            prefixMul[i] = mul;
//        }
//        mul =1;
//        for(int i=len-1;i>=0;i--)
//        {
//            mul = mul * nums[i];
//            suffixMul[i] = mul;
//        }
//
//        System.out.println(Arrays.toString(prefixMul));
//        System.out.println(Arrays.toString(suffixMul));
//
//        int i=0;
//
//        for(i=0;i<len;i++)
//        {
//
//            if(i==0)
//            {
//                answer[i] = suffixMul[i+1];
//            }
//            else if((i+1) >= len)
//            {
//                answer[i] = prefixMul[i-1];
//            }
//            else
//            {
//                answer[i] = prefixMul[i-1]*suffixMul[i+1];
//            }
//        }
//
//        System.out.println(Arrays.toString(answer));
//
//
//
//    }




//    Best Approach

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int len = nums.length;
        int[] ans = new int[len];
        int product = 1;

        for(int i=0;i<len;i++)
        {
            ans[i] = product;
            product = product * nums[i];
        }

        product=1;
        for(int i=len-1;i>=0;i--)
        {
            ans[i] = ans[i] *product;
            product = product*nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
