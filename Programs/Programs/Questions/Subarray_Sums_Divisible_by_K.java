package Programs.Questions;

public class Subarray_Sums_Divisible_by_K {
    public static void main(String[] args) {
        int nums[] = {4,5,0,-2,-3,1};
        int k = 5;
//        {4,9,9,7,4,5}
//        {4,4,4,2,4,0}\
        int sum = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(sum%k==0)
                {
                    count++;
                }
                sum = sum + nums[j];
            }
            if(sum%k==0)
            {
                count++;
            }
        }

        System.out.println(count);





    }
}
