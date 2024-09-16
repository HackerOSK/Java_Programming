package Programs.Questions;

import java.util.Arrays;

public class Most_Profit_Assigning_Work {
    public static void main(String[] args) {
        int difficulty[] = {23,30,35,35,43,46,47,81,83,98};
        int profit[] = {8,11,11,20,33,37,60,72,87,95};
        int worker[] = {95,46,47,97,11,35,99,56,41,92};
        int totalprofit = 0;

        SortArray(profit,difficulty);
        Arrays.sort(worker);

        System.out.println(Arrays.toString(difficulty));
        System.out.println(Arrays.toString(profit));
        int m = 0;
        for(int i=0;i<profit.length;i++)
        {
            if(m<profit[i])
            {
                m=profit[i];
            }else{
                profit[i] = m;
            }
        }
        System.out.println(Arrays.toString(profit));
        for(int i=0;i<worker.length;i++)
        {
            int n = search(worker[i],difficulty,profit);
            if(n>=0)
            {
                totalprofit= totalprofit + profit[n];
            }

        }


//        4 5 6 7
//        2 4 6 8 10
//        for(int )
        System.out.println(totalprofit);
    }

    private static int max(int i[], int n) {
        int max = 0;
        for(int j=0;j<=n;j++)
        {
            if(i[j]>max)
            {
                max = i[j];
            }
        }
        return max;
    }

    private static void SortArray(int[] profit, int[] difficulty) {
        for(int i=0;i<profit.length-1;i++)
        {
            for(int j=i+1;j<profit.length;j++)
            {
                if(difficulty[i]>difficulty[j])
                {
                    int temp = profit[i];
                    profit[i]= profit[j];
                    profit[j] = temp;

                    temp = difficulty[i];
                    difficulty[i] = difficulty[j];
                    difficulty[j] = temp;

                }
            }
        }
    }

    private static int search(int i,int arr[],int pro[]) {
        int s = 0;
        int e = arr.length-1;
        int max = 0;
        int a=0;
        while(s<=e)
        {
            int mid= s + (e-s)/2;
            if(arr[mid]==i){
                if(max < pro[mid])
                {
                    max = 0;
                    a = mid;
                }
                s = mid+1;
            }else if(arr[mid]>i)
            {
                e = mid-1;
            }else {
                s = mid+1;
            }
        }
        if(max!=0)
        {
            e=a;
        }

        return e;

    }
}


// 67,17,1,81,3
// 68,35,52,47,86

// 35 47 52 68 86
// 17  81 1 67 3

// 92,10,85,84,82

// 10 82 84 85 92

// 1 3 17 67 81 <- profit
// 52 86 35 68 47