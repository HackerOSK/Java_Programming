package Programs.Recursion.Striver_Playlist;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]= {12,3,5,2,4,7};
        Arrays.sort(arr);
        if(binarySearch(arr,2,0,arr.length-1))
        {
            System.out.println("The Target is PRESENT");
        }else {
            System.out.println("The Target is NOT PRESENT");
        }
    }

    private static boolean binarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end-start)/2;
        if(start>=end || arr[mid]==target)
        {
            if(arr[mid]==target) {
                return true;
            }
            return false;
        }
        else if(arr[mid]>target)
        {
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
