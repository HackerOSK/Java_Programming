package Programs.Questions;

import java.util.Arrays;

public class Sort_Colors {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        int freqArr[] = new int[3];

        for(int i:nums)
        {
            freqArr[i]=freqArr[i]+1;
        }

        System.out.println(Arrays.toString(freqArr));
        int j = 0;
        for(int i=0;i<3;i++)
        {
            while(freqArr[i]>0)
            {
                nums[j]=i;
                j++;
                freqArr[i]--;
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));
    }
}
