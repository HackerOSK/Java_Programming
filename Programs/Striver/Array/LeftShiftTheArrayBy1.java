package Striver.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftShiftTheArrayBy1 {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

//    Brute Force
//    Time complexity => O[n] + O[len-n] + O[n] => O[n+len]
//    Space Complexity => O[n]
        int n =2;
        int length = arr.length;
        n = n % length;
//        int[] temp = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            temp[i]=arr[i];
//        }
//        for(int i = n; i< length; i++)
//        {
//            arr[i-n] = arr[i];
//        }
//
//        for(int i = length -n; i< length; i++)
//        {
//            arr[i]=temp[i- (length -n)];
//
//        }
//
//        System.out.println(Arrays.toString(arr));



//        Optimal
//        Time complexity => O[n] + O[length-n] + O[length] = O[2length]
//        Space Complexity => O[1]
        n=n-1;
//        reverseArr(0,n,arr);
//        reverseArr(n+1,length-1,arr);
//        reverseArr(0,length-1,arr);

        BestReverse(0,n,arr);
        BestReverse(n+1,length-1,arr);
        BestReverse(0,length-1,arr);


        System.out.println(Arrays.toString(arr));
    }

    static void reverseArr(int i, int i1, int[] arr) {
        int mid = (i1-i)/2;

        for(int k=0;k<=mid;k++)
        {

            int temp = arr[i+k];
            arr[i+k] = arr[i1-k];
            arr[i1-k] = temp;
        }

    }

    static void BestReverse(int s,int e,int[] arr)
    {
        while(s<e)
        {
            arr[s]=arr[s]*arr[e];
            arr[e]=arr[s]/arr[e];
            arr[s]=arr[s]/arr[e];
            s++;
            e--;
        }
    }


}
