package Striver.Array;

import java.util.Arrays;

public class Move_Zeros_to_end {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        int len = arr.length;

//        brute
//        Time complexity = O[n] + O[x] => O[n+x]
//        Space Complexity = O[n]
        int ans[] =  new int[arr.length];
        int j=0;
        for(int i : arr)
        {
            if(i!=0) {
                ans[j] = i;
                j++;
            }

        }
        for(int k =j;k<arr.length;k++)
        {
            ans[k] = 0;
        }


        System.out.println(Arrays.toString(ans));


//        Optimal Solution time complexity => O[n]
//        Space Complexity => O[1]
        int i=0;
        for(int k=i;k<len;k++)
        {
            if(arr[k]!=0)
            {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
