package Programs.Recursion.Striver_Playlist;

import java.util.ArrayList;

public class Printing_subseq_sum_is_k {
    public static void main(String[] args) {
        int arr[] = {1,0};
        int target = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        printsubseq(0,ans,arr,target,0);
    }

    private static void printsubseq(int i, ArrayList<Integer> ans, int[] arr, int target,int sum) {
        if(i>=arr.length || sum>target )
        {
            if(sum==target)
            {
                System.out.println(ans);
            }
            return;
        }
        ans.add(arr[i]);
        sum = sum + arr[i];
        printsubseq(i+1,ans,arr,target,sum);
        sum = sum -ans.get(ans.size()-1);
        ans.remove(ans.size()-1);
        printsubseq(i+1,ans,arr,target,sum);
    }

}
