package Programs.BinarySearch;

import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,5,1};
        int target = in.nextInt();
        int pivot = findPivot(arr);
        System.out.println(arr[pivot]);

        int start =0 ;

        if(arr[pivot]==target)
        {
            System.out.println(pivot);
        }if(pivot==arr.length-1)
        {
            System.out.println(binarysearch(arr,target,start,pivot));
        }
        else
        {
            if(target>=arr[start] && target<arr[pivot])
            {
                System.out.println(binarysearch(arr,target,start,pivot));
            }
            else
            {
                System.out.println(binarysearch(arr,target,pivot+1,arr.length-1));
            }
        }


    }

    static int findPivot(int[] arr)
    {
        int start =0;
        int end = arr.length-1;
        int mid=0;
        if(arr[start]<arr[end])
        {
            return end;
        }
        else {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (mid < end && (arr[mid] > arr[mid + 1])) {
                    return mid;
                }if (mid > start && (arr[mid] < arr[mid - 1])) {
                    return mid-1;
                } if (arr[start] >= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid+1;
                }
            }
        }
        return 0;
    }

    static int binarysearch(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
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
        return -1;
    }



}

