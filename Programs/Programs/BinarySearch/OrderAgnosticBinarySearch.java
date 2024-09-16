package Programs.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
//    Here we not know about given array is in ascending sorted order or descending sorted order
public static void main(String[] args) {
    int[] ase = {1,2,3,4,5,6,7,81,231,2312,2333};
    int[] dse = {2131,564,232,122,23,11,2,1};

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Target element which you want to search in given array : ");
    int target = in.nextInt();
    if(binarySearch(dse,target))
    {
        System.out.println("Target Element is present inside given array !!");
    }
    else
    {
        System.out.println("Taget element is not in given array !!");
    }

}

    static boolean binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length-1;
    int mid=0;
    if(arr[0]<arr[arr.length-1])
    {
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
    }
    else
    {
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]>target)
            {
                start = mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    }
    return false;
    }
}
