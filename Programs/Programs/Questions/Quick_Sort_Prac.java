package Programs.Questions;

import java.util.Arrays;

public class Quick_Sort_Prac {
    public static void main(String[] args) {
        int arr[] = {110,11,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

//        1) take a pivote in my case i am taking first element as pivote element in the array
//        2) putting that pivote on it's actual position
//        3) now on left side of pivote all are smaller numbers and on right side all are larger numbers
//        4) so first consider left part of pivote and after that take right part of pivote and perform 1 - 3 operations on it till low<high


    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int partition = PlacePivot(arr,low,high);
        quickSort(arr,low,partition-1);
        quickSort(arr,partition+1,high);
    }

    private static int PlacePivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j)
        {
            while(i<=high && arr[i]<=pivot)
            {
                i++;
            }while( j>=low && arr[j]>pivot)
        {
            j--;
        }
            if(i<j) {
                swap(arr, i, j);
            }
        }

        swap(arr,low,j);
        System.out.println(Arrays.toString(arr));
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
