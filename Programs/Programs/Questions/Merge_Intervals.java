package Programs.Questions;

import java.util.Arrays;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{0,1}};
        Sort2D(intervals);
        int S = intervals[0][0];
        int E = intervals[0][1];
        int len = intervals.length;
        int[][] ans = new int[len][2];


        ans[0][0] = S;
        ans[0][1] = E;






        if(len==1)
        {
            System.out.println(Arrays.toString(ans[0]));
        }
        int j=0;


        for(int i =1;i<len;i++)
        {

            if(S>intervals[i][0])
            {
                S=intervals[i][0];
            }
            if(E>=intervals[i][0])
            {
                if(E<intervals[i][1]) {
                    E = intervals[i][1];
                }
                if(i==len-1)
                {
                    ans[j][0]=S;
                    ans[j][1]=E;
                    j++;
                }
            }
            else if(E<intervals[i][0])
            {
                ans[j][0] = S;
                ans[j][1] =E;
                j++;
                S=intervals[i][0];
                E = intervals[i][1];

                if(i==intervals.length-1)
                {
                    ans[j][0] = S;
                    ans[j][1] = E;
                    j++;
                }
            }



        }

        int[][] newans = new int[j][2];

        for(int i=0;i<j;i++)
        {
            newans[i][0] = ans[i][0];
            newans[i][1]=ans[i][1];
        }








        for(int[] i : newans)
        {
            System.out.println(Arrays.toString(i));
        }

    }

    static void Sort2D(int[][] arr) {
        for (int row = 0; row < arr.length - 1; row++) {
            for (int row1 = row + 1; row1 < arr.length; row1++) {
                if (arr[row][0] > arr[row1][0]) {
                    int[] temp = arr[row];
                    arr[row] = arr[row1];
                    arr[row1] = temp;
                } else if (arr[row][0] == arr[row1][0]) {
                    if (arr[row][1] > arr[row1][1]) {
                        int[] temp = arr[row];
                        arr[row] = arr[row1];
                        arr[row1] = temp;
                    }
                }
            }
        }
    }
}
