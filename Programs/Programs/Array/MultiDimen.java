package Programs.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimen {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] Arr2D = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arr2D.length); // 3

        int[][] ArrMulTi = {{1,2,3,4,5},{6},{7,8,9},{10}};

        int[][] MulArr = new int[3][3];
//        Input
        for (int row=0;row<MulArr.length;row++)
        {
            System.out.println("Enter the elements in row "+row);
            for(int col =0;col<MulArr[row].length;col++)
            {
                MulArr[row][col] = in.nextInt();
            }
        }

//        Output
        for (int row=0;row<MulArr.length;row++)
        {

            for(int col =0;col<MulArr[row].length;col++)
            {
                System.out.print(MulArr[row][col]+" ");
            }
            System.out.println();
        }

//          1 2 3
//          4 5 6
//          7 8 9






//        Output Using toString function
        for(int i=0;i<MulArr.length;i++)
        {
            System.out.println(Arrays.toString(MulArr[i]));
        }

//        [1, 2, 3]
//        [4, 5, 6]
//        [7, 8, 9]




//        Output Using foreach loop
        for(int[] arr : MulArr)
        {
            System.out.println(Arrays.toString(arr));
        }


//        [1, 2, 3]
//        [4, 5, 6]
//        [7, 8, 9]






        System.out.println(Arrays.toString(MulArr)); // This gives you string of reference variables
//     [[I@3f91beef, [I@1a6c5a9e, [I@37bba400]



    }
}
