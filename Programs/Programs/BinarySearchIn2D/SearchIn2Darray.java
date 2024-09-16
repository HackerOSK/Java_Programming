package Programs.BinarySearchIn2D;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] mat = {
                {12,34,11},
                {23,45,76},
                {56,88,22}
        };

//        sorting in 2D array : not complete sorting it is sort the array present in every row
//        for(int[] row : mat)
//        {
//            Arrays.sort(row);
//        }
//        for(int[] row : mat)
//        {
//            System.out.println(Arrays.toString(row));
//        }

//        Linear Searching in 2D array :
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int r= 0;int co=0;
        int c=-1;
        for(int row=0;row<mat.length;row++)
        {
            for(int col=0;col<mat[row].length;col++)
            {
                if(mat[row][col]==target)
                {
                    c=0;
                    r = row;
                    co = col;
                    break;
                }
            }
        }

        if(c==0)
        {
            System.out.println("The target is found at location : "+"["+r+","+co+"]");
        }
        else
        {
            System.out.println("The target is not found in given matrix");
        }
    }

//    This Linear Search of 2D array having time complexity = O[n^2] which is huge
//    So we Prefer Binary Search Here also to search efficiently


}
