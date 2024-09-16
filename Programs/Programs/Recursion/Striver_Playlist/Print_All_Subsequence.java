package Programs.Recursion.Striver_Playlist;

import java.util.ArrayList;

public class Print_All_Subsequence {
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,2,2};
        ArrayList<Integer> ans = new ArrayList<>();
        printsubseq(0,ans,arr);
    }

    private static void printsubseq(int i, ArrayList<Integer> ans, int[] arr) {
        if(i>=arr.length)
        {
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        printsubseq(i+1,ans,arr);
        ans.remove(ans.size()-1);
        printsubseq(i+1,ans,arr);
    }
}
