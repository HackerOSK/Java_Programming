package Programs.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Count_Days_Without_Meetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = 5;
        int meetings[][] = {{2,4},{1,3}};

//        1,3   5,7   9,10
//        Time Limit exceed for days = 34384652
//        int daysStat[] = new int[days];
//        for(int i=0;i<meetings.length;i++)
//        {
//
//            if(meetings[i][0]!=1 || meetings[i][1]!=1 ) {
//                for (int j = meetings[i][0]; j <= meetings[i][1]; j++) {
//                    daysStat[j - 1] = 1;
//                }
//            }
//        }
//        int meetingLessDays=0;
//        for(int i : daysStat)
//        {
//            if(i==0)
//            {
//                meetingLessDays++;
//            }
//        }
//        System.out.println(meetingLessDays);


//        Another approch
//        sort 2d array
//        merge range
//        count days

        sort2DArr(meetings);
        for(int[] i : meetings)
        {
            System.out.print(Arrays.toString(i));
        }
        mergeRange(meetings);

        for(int[] i : meetings)
        {
            System.out.print(Arrays.toString(i));
        }
        sort2DArrDes(meetings);
        System.out.println();
        for(int[] i : meetings)
        {
            System.out.print(Arrays.toString(i));
        }
        int daycount = 0;
        for(int[] i : meetings)
        {
            int min = i[0];
            int max = i[1];
            if(min==0)
            {
                break;
            }
            else {
                daycount = daycount + (max - min) + 1;
            }
        }

        System.out.println(days - daycount);






    }

    private static void sort2DArrDes(int[][] meetings) {
        for(int row=0;row<meetings.length;row++)
        {
            for(int row1 = row+1;row1<meetings.length;row1++)
            {
                if(meetings[row][0]<meetings[row1][0])
                {
                    int min = meetings[row][0];
                    int max = meetings[row][1];
                    meetings[row][0] = meetings[row1][0];
                    meetings[row][1] = meetings[row1][1];
                    meetings[row1][0] = min;
                    meetings[row1][1] = max;
                }
            }

        }
    }

    private static void mergeRange(int[][] meetings) {


        int c =0;
        for(int i=0;i<meetings.length;i+=c)
        {
            int min = meetings[i][0];
            int j=i+1;
            c=0;
            int max = meetings[i][1];
            while(j<meetings.length && meetings[j][0]==min)
            {
                if(max<meetings[j][1])
                {
                    max = meetings[j][1];
                }
                meetings[j][0] = 0;
                meetings[j][1] = 0;
                j++;
            }
            c=j;

            meetings[i][1] = max;
        }

        System.out.println();
        for(int[] i : meetings)
        {
            System.out.print(Arrays.toString(i));
        }
        System.out.println();
        sort2DArrDes(meetings);

        c =0;
        for(int i=0;i<meetings.length;i+=c)
        {
            int max = meetings[i][1];
            int j=i+1;
            c=0;
            int min = meetings[i][0];
            while(j<meetings.length && meetings[j][1]==max)
            {
                if(min>meetings[j][0])
                {
                    min = meetings[j][0];
                }
                meetings[j][0] = 0;
                meetings[j][1] = 0;
                j++;
            }
            c=j;

            meetings[i][0] = min;

        }



        for(int i=0;i<meetings.length-1;i++)
        {
            int max = meetings[i][1];
            int min = meetings[i+1][0];
            if(max<min)
            {
                meetings[i][1] = meetings[i+1][1];
                meetings[i+1][0] = 0;
                meetings[i+1][1] = 0;
            }

        }
    }

    private static void sort2DArr(int[][] meetings) {
        for(int row=0;row<meetings.length;row++)
        {
            for(int row1 = row+1;row1<meetings.length;row1++)
            {
                if(meetings[row][0]>meetings[row1][0])
                {
                    int min = meetings[row][0];
                    int max = meetings[row][1];
                    meetings[row][0] = meetings[row1][0];
                    meetings[row][1] = meetings[row1][1];
                    meetings[row1][0] = min;
                    meetings[row1][1] = max;
                }
            }

        }
    }
}
