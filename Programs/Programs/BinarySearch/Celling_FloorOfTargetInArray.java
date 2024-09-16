package Programs.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Celling_FloorOfTargetInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {12,324,43,11,67,34,87,73,13};
        Arrays.sort(arr);
        int target = in.nextInt();
        System.out.println("Ceil Value " + arr[ceil(arr,target)]);
//        If we want to find ceil value then only return start if actual target is not present if actual target is present then return actual target index
        System.out.println("Floor Value : " + arr[floor(arr,target)]);
//        If we want to find floor value then only return
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        while (start<=end)
        {
            mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (arr[mid]<target) {
                start = mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    if(start<arr.length-1) {
        return start;
    }
    // if target element is not present and it is biggest of all elements in array
    return start-1;

    }

    static int floor(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        while (start<=end)
        {
            mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (arr[mid]<target) {
                start = mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    if(mid>0) {
        return end;
    }

//    if target is lesser of all element in the array & also not present in array
    return end+1;

    }
}
