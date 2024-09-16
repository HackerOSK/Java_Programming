package Programs.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr)
    {
        for(int i=0;i<(arr.length)/2;i++)
        {
            swap(arr,i,arr.length-1-i);
        }
    }

    static void swap(int[] arr,int a,int b)
    {
        arr[a] = arr[a]*arr[b];
        arr[b] = arr[a]/arr[b];
        arr[a] = arr[a]/arr[b];
    }
}
