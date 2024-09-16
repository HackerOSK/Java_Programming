package Programs.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotateBy_K {


//  BRUTE FORCE APPROACH


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] arr = {1,2,3,4,5,6};
//        System.out.println("Enter how many times you want to rotate array");
//        int k = in.nextInt();
//        k=k % arr.length;
//        int[] temp = new int[k];
//
//        for(int i=0;i<k;i++)
//        {
//            temp[i] = arr[i];
//        }
//
//        for(int i = k;i< arr.length;i++)
//        {
//            arr[i-k] = arr[i];
//        }
//
//        for(int i=arr.length-k;i< arr.length;i++)
//        {
//            arr[i] = temp[i-(arr.length-k)];
//
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//    }







//    MOST OPTIMAL
//    ALGO
//    1. TAKE NUMBER TO WHICH WE WANT TO ROTATE (K)
//    2. MAKE ARR[K] AS PIVOT AND REVERSE THE SET OF NUMBERS ON LEFT & RIGHT SIDE
//    3. AND THEN SWAP THEM


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter K : ");
        int k = in.nextInt();
        k = k % arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        for(int i=0;i< k;i++)
        {
            if(i==k)
            {
                continue;
            }
            arr[i]=arr[i]*arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i] / arr[arr.length-1-i];
            arr[i]=arr[i]/arr[arr.length-1-i];
        }

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end) {
        while(start<end)
        {
            arr[start]=arr[start]*arr[end];
            arr[end]=arr[start]/arr[end];
            arr[start]=arr[start]/arr[end];
            start++;
            end--;
        }

    }
}

