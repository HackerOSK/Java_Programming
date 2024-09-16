package Programs.BinarySearch;

import java.util.Arrays;

public class RecursiveApproach {
    public static void main(String[] args) {
        int arr[] = {1,34,5,12,9,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ind = search(9,arr,0,arr.length-1);
        System.out.println(ind);
    }

    private static int search(int target, int[] arr, int s, int e) {
        if(e<s)
        {
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]==target)
        {
            return mid;
        }else if(arr[mid]>target)
        {
            return search(target,arr,s,mid-1);
        }
            return search(target,arr,mid+1,e);

    }
}
