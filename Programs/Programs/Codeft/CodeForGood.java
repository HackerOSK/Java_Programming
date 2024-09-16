package Programs.Codeft;

public class CodeForGood {
//    leetcode 253 Meeting Rooms II
    public static void main(String[] args) {
        int[][] intervals = {{2,8},{3,9},{5,11},{3,4},{11,15},{8,20}};
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i=0;i<intervals.length;i++)
        {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        int n = intervals.length;
        int[] time = new int[2*n];
        for(int i=0;i<n;i++)
        {
            time[i] = start[i];
            time[i+n] = end[i];
        }
        int ans = 0;
        for(int i=0;i<time.length;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(time[i]>=start[j] && time[i]<=end[j])
                {
                    count++;
                }
            }
            ans = Math.max(ans,count);
        }
        System.out.println(ans);
    }
}
