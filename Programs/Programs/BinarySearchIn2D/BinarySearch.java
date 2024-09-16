package Programs.BinarySearchIn2D;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
        };

        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println("Element At Index : "+ Arrays.toString(binarySearch(mat,target)));
    }

    static int[] binarySearch(int[][] mat,int target)
    {
        int row = 0;
        int col = mat[row].length-1;
        while(row< mat.length && col >=0)
        {
            if(mat[row][col] == target)
            {
               return new int[]{row,col};
            }
            else if(mat[row][col]>target)
            {
                col--;
            }
            else
            {
                row++;
            }
        }

        return new int[]{-1,-1};

    }
}

