package Programs.Questions;

import java.util.ArrayList;

public class Lucky_Numbers {
    public static void main(String[] args) {
        int matrix[][] = {{3,7,8}, {9, 11, 13}, {15, 16, 17}};
        ArrayList<Integer> CheckingList = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int arr[] : matrix)
        {
            CheckingList.add(FindMin(arr));
        }



        for(int c=0;c<matrix[0].length;c++)
        {
            int max = Integer.MIN_VALUE;
            for(int r = 0;r<matrix.length;r++)
            {
                int n = matrix[r][c];
                if(n>max)
                {
                    max = n;
                }
            }

            if(CheckingList.contains(max))
            {
                ans.add(max);
            }
        }




        System.out.println(ans);


    }

    private static int FindMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i : arr)
        {
            if(min>i)
            {
                min = i;
            }
        }

        return min;
    }
}
