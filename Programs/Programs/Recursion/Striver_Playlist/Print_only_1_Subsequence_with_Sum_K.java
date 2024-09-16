package Programs.Recursion.Striver_Playlist;

import java.util.ArrayList;

public class Print_only_1_Subsequence_with_Sum_K {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ArrayList<Integer>list = new ArrayList<>();
        printsubseq(0,0,5,list,arr);
    }

    private static boolean printsubseq(int ind, int sum, int target, ArrayList<Integer> list, int[] arr) {
        if(ind>=arr.length)
        {
            if(sum==target)
            {
                System.out.println(list);
                return true;
            }
            else{
                return false;
            }
        }

        sum+=arr[ind];
        list.add(arr[ind]);
        if(printsubseq(ind+1,sum,target,list,arr)==true){return true;}
        sum-=arr[ind];
        list.remove(list.size()-1);
        if(printsubseq(ind+1,sum,target,list,arr)==true){return true;}
        return false;
    }
}
