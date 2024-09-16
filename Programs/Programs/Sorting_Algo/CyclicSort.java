package Programs.Sorting_Algo;

import java.util.ArrayList;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
//        Sorting algorithm for array containing number from 1-N where N will be any integer
        int[] arr = {26,2,9,20,31,7,14,32,37,15,29,6,12,38,48,22,19,45,42,40,1,12,25,36,39,30,35,4,27,12,49,16,47,3,44,41,8,17,21,23,10,43,12,34,24,28,33,13,46,11};
//        Here we take array containing numbers from 1-N
        System.out.println("Array : "+ Arrays.toString(arr));
//        sort(arr);
        sort_HandlingDuplicates(arr);
        System.out.println("Array : "+ Arrays.toString(arr));
    }

//    static void sort(int[] arr) {
//        int i=0;
//        while(i<arr.length)
//        {
//            if((arr[i]-1)!=i)
//            {
//                swap(arr,i,arr[i]-1);
//            }
//            else
//            {
//                i++;
//            }
//        }
//    }

    static void sort_HandlingDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            if((arr[i]-1)!=i && arr[i]!=arr[arr[i]-1])
            {
                swap(arr,i,arr[i]-1);
            }
            else
            {
                i++;
            }
        }
    }

    static void swap(int[] arr,int s,int e)
    {
        arr[s] = arr[s] * arr[e];
        arr[e] = arr[s] / arr[e];
        arr[s] = arr[s] / arr[e];
    }
}
