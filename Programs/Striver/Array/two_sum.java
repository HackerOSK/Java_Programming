package Striver.Array;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int arr[] = {1,2,5,2,7,9};
        int target = 9;
        int b = 0;
        int ans[] = new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ans[0] = i;
                    ans[1] = j;
                    b=1;
                    break;
                }
            }
            if(b==1)
            {
                break;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
