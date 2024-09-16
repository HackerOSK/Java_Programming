package Programs.LinearSearch;

import java.util.Scanner;

public class SearchingIn2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1,2,4,5},
                {46,234,878,0},
                {7,9,452,3},
                {100,8,90}
        };
        System.out.print("Enter the target element which you want to search : ");
        int target = in.nextInt();

        int[] index = new int[2];
        index = searchNum(arr,target);
        if(index[0]>=0)
        {
            System.out.println("The Element is present in Given 2D array At index : "+"("+index[0]+","+index[1]+")");
        }
        else
        {
            System.out.println("The Number is Not present in Given 2D Array");
        }
    }

    static int[] searchNum(int[][] arr, int target) {
        int[] index = new int[2];
        if(arr.length==0)
        {
            index[0]=-1;
            index[1]=-1;

            return index;
        }

        for(int row=0;row<arr.length;row++)
        {
            for(int col = 0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    index[0]=row;
                    index[1]=col;
                    return index;
                }
            }
        }
        index[0]=-1;
        index[1]=-1;

        return index;
    }
}
