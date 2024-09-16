package Programs.Sorting_Algo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {

        for(int i = 1;i<arr.length;i++)
        {
            for(int j =i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int end, int i) {
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
    }
}
