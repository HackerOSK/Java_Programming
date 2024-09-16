package Programs.Sorting_Algo;

import java.util.Arrays;

public class BiDimenstional2DArray_Sorting {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{0,4},{3,6},{8,12},{5,6}};
        Sort2D(arr);
        for(int[] i:arr)
        {
            System.out.println(Arrays.toString(i));
        }
    }

    private static void Sort2D(int[][] arr) {
        for(int row=0;row<arr.length-1;row++)
        {
            for(int row1=row+1;row1< arr.length;row1++)
            {
                if(arr[row][0]>arr[row1][0])
                {
                    int[] temp = arr[row];
                    arr[row]=arr[row1];
                    arr[row1]=temp;
                }
                else if(arr[row][0]==arr[row1][0])
                {
                    if(arr[row][1]>arr[row1][1])
                    {
                        int[] temp = arr[row];
                        arr[row]=arr[row1];
                        arr[row1]=temp;
                    }
                }
            }
        }
    }
}
