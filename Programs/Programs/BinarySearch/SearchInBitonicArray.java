package Programs.BinarySearch;

import java.util.Scanner;

public class SearchInBitonicArray {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int[] arr ={5,1,3};
        System.out.println("Enter the target : ");
        int target = in.nextInt();
        int peakindex = peakelement(arr);
        int peak = arr[peakindex];
        System.out.println(peak);
        if(target==peak)
        {
            System.out.println("Element present at index : "+peakindex);
        }
        else if(target>peak)
        {
            System.out.println("Target Element not present ");
        }
        else
        {
            int ase =binarySearch(arr,target,0,peakindex);
            if( ase== -1)
            {
                int dse = binarySearch(arr,target,peakindex,arr.length-1);
                if(dse==-1)
                {
                    System.out.println("Target ELement is not present ");
                }
                else
                {
                    System.out.println("Element present at index : "+dse);
                }

            }
            else
            {
                System.out.println("Element present at index : "+ase);
            }
        }


    }

    static int peakelement(int[] arr) {
        int start =0;
        int end=arr.length-1;
        int mid=0;
        while(start<end)
        {
            mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else if(mid!=0 && mid!=arr.length && arr[mid-1]>arr[mid+1])
            {
                end=mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }

    

    static int binarySearch(int[] arr,int target,int start,int end)
    {
        if(arr[start]<arr[end])
        {
            int mid;
            while(start<=end)
            {
                mid = start + (end-start)/2;
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            return -1;
        }
        else
        {
            int mid;
            while(start<=end)
            {
                mid = start + (end-start)/2;
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target)
                {
                 start = mid+1;
                }
                else {
                    end=mid-1;
                }

            }
            return -1;

        }

    }
}
