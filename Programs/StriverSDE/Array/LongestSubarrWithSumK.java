package StriverSDE.Array;

public class LongestSubarrWithSumK {
    public static void main(String[] args) {
        int arr [] = {1,2,3,1,1,1,1,4,2,3};

        int target = 14;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            int len =0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                len++;
                if(sum>target)
                {
                    break;
                }
                else if(sum==target)
                {
                    if(max<len)
                    {
                        max=len;
                    }
                }

            }
        }

        System.out.println(max);
    }
}


