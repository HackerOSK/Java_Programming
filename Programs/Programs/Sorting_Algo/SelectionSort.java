package Programs.Sorting_Algo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Before : "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After : "+ Arrays.toString(arr));
    }

    static void selectionSort(int[] arr)
    {
        int end = arr.length-1;
        while (end>1)
        {
            swap(arr,end,maxvalInd(arr,0,end));
            end--;
        }
    }

    static void swap(int[] arr, int end, int i) {
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
    }

    static int maxvalInd(int[] arr, int i, int end) {
        int max = 0;
        for(int j =i;j<=end;j++)
        {
            if(arr[j]>arr[max])
            {
                max = j;

            }
        }

        return max;
    }


}
