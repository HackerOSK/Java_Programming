package Programs.Sorting_Algo;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] = {4,7,2,5,1,6,3};
        int high = arr.length-1;
        int  low =0;
        System.out.println(Arrays.toString(arr));
        QuickSort(arr,low,high);
        System.out.println(Arrays.toString(arr));

    }

    private static void QuickSort(int[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int pivotInd = AdjustArr(arr,low,high);
        QuickSort(arr,low,pivotInd-1);
        QuickSort(arr,pivotInd+1,high);
    }

    private static int AdjustArr(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivoteInd = low;
        int pivote = arr[pivoteInd];
        while(i<j) {
            while (i <= high && arr[i] <= pivote) {
                i++;
            }
            while (j >= low && arr[j] >  pivote) {
                j--;
            }

            if(i<j)
            {
                swap(arr,i,j);
            }

        }
        swap(arr,low,j);
        System.out.println("ans");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------------------------");
        return j;
    }

    private static void swap(int[] arr, int pivoteInd, int j) {
        int temp = arr[pivoteInd];
        arr[pivoteInd] = arr[j];
        arr[j] = temp;
    }
}
