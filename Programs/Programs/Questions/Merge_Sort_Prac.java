package Programs.Questions;

import java.util.Arrays;

public class Merge_Sort_Prac {
    public static void main(String[] args) {
        int arr[] = {110,11,0,12,4,90,2};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int mid = low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        int k=0;
        int temp[] = new int[(high-low)+1];
        while(i<=mid && j<=high)
        {
            if(arr[i]<=arr[j])
            {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
                temp[k] = arr[i];
                i++;
                k++;
        }

        while(j<=high)
        {
                temp[k] = arr[j];
                j++;
                k++;
        }

        for(int l = low;l<=high;l++)
        {
            arr[l] = temp[l-low];
        }

    }
}
