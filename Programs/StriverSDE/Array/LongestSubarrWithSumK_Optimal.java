package StriverSDE.Array;

public class LongestSubarrWithSumK_Optimal {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int target = 13;
        int left=0;
        int right=0;
        long sum=arr[right];
        int max = 0;
        while(right<arr.length)
        {
            if(sum==target)
            {
                max = Math.max(max,right-left+1);
                right++;
                if(right<arr.length) {
                    sum += arr[right];
                }
            }else if(sum>target)
            {
                sum-=arr[left];
                left++;
            }else{
                right++;
                if(right<arr.length) {
                    sum += arr[right];
                }
            }
        }

        System.out.println(max);
    }
}
