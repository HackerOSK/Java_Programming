package Programs.Questions;

public class Average_Waiting_Time {
    public static void main(String[] args) {
//        [[5,2],[5,4],[10,3],[20,1]]
//        [[2,3],[6,3],[7,5],[11,3],[15,2],[18,1]]
        int arr[][] = {{2,3},{6,3},{7,5},{11,3},{15,2},{18,1}};

        int prev_dish = arr[0][0]+arr[0][1];
        float sum =arr[0][1];
        int i = 1;
        while(i<arr.length)
        {
//            if(arr[i][0] > crTime)
//            {
//                sum+=arr[i][1];
//                crTime = arr[i][1] + arr[i][0];
//            }else{
//                crTime+=arr[i][1];
//                sum+= (crTime - arr[i][0]);
//            }
            int startTime = Math.max(arr[i][0],prev_dish);
            int endTime = startTime + arr[i][1];
            sum+=(endTime-arr[i][0]);
            prev_dish = endTime;

            i++;
        }

        double ans = (sum/arr.length);

        System.out.println(ans);
    }
}
