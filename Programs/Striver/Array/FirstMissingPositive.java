package Striver.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2147483647}; // 2
        int ans=0;


//        Brute Force
//        Time Complexity => O[n]
//        Space Complexity => O[100001]

//        int[] freq = new int[100001];
//        for(int i: arr)
//        {
//            if(i>0 && i<100001)
//            {
//                freq[i]++;
//            }
//        }
//        for(int i=1;i<freq.length;i++)
//        {
//            if(freq[i]==0)
//            {
//                ans=i;
//                break;
//            }
//        }
//        System.out.println(ans);




//        better
//        time complexity => O[nLog(n)] + O[n]
//        Space complexity => O[1]

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int iter = 1;
//        for(int i : arr)
//        {
//            if(i==iter)
//            {
//                iter++;
//            }
//            else if(i>iter)
//            {
//                break;
//            }
//        }
//
//        System.out.println(iter);



//        Optimal





    }
}
