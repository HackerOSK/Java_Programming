package Programs.LinearSearch;

import java.util.Scanner;

public class BasicLinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,21,23,123,2,153};
        System.out.print("Enter the number which you wants to search : ");
        int searchKey = in.nextInt();
        int index = linearSearch(arr,searchKey);
        if(index>=0)
        {
            System.out.println("SearchKey Present at index : "+index);
        }
        else
        {
            System.out.println("SearchKey is Not Present in Given Array ");
        }


    }

    static int linearSearch(int[] arr, int searchKey) {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]==searchKey)
            {
                return index;
            }
        }
        return -1;
    }
}
