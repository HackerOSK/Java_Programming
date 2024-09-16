package Programs.LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {12,31,324,3445,345,7,677,8,89,54,4};
        System.out.println("Enter the Range of Searching : ");
        System.out.print("Start : ");
        int start = in.nextInt();
        System.out.print(" End : ");
        int end = in.nextInt();
        System.out.println();
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        int index = SearchNum(arr,start,end,target);
        if(index>=0)
        {
            System.out.println("Number Lies in Range at index : "+index);
        }
        else
        {
            System.out.println("The Number not lies in this range");
        }
    }

    static int SearchNum(int[] arr, int start, int end, int target) {
        if(arr.length==0 || start>end)
        {
            return -1;
        }
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }

        return -1;
    }
}
