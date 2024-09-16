package Programs.Sorting_Algo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,7,6,5};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
//        merge(arr,0,(arr.length-1)/2,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int h) {
        if(l>=h)
        {
            return;
        }
        int mid = l +(h-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
    }

    private static void merge(int[] arr, int l, int mid, int h) {
        int newarr[] = new int[h-l+1];
        int ptr1 =l;
        int ptr2 =mid+1;
        int i =0;

        while((ptr1 <= mid) && (ptr2 <= h))
        {
            if(arr[ptr1]>arr[ptr2])
            {
                newarr[i] = arr[ptr2];
                ptr2++;
            }else {
                newarr[i] = arr[ptr1];
                ptr1++;
            }
            i++;
        }

        while(ptr1 <= mid)
        {
            newarr[i] = arr[ptr1];
            ptr1++;
            i++;
        }
        while(ptr2 <= h)
        {
            newarr[i] = arr[ptr2];
            ptr2++;
            i++;
        }
        int k = 0;
        for(int j=l;j<=h;j++)
        {
            arr[j] = newarr[j-l];
        }
//        System.out.println(Arrays.toString(arr));
    }
}
