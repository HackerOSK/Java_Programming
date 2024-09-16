package Programs.Recursion.Kunal_Playlist;

import java.util.ArrayList;

public class Combination {
    public static void main(String[] args) {
        int arr[] = {1,1,3,4,5};
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        int target = 5;
        allCombi(arr,list,0,0,ans,target,0);
        System.out.println(ans);
    }

    private static void allCombi(int[] arr, ArrayList<Integer> list, int i,int start,ArrayList<ArrayList<Integer>> ans,int target,int sum) {
        if(sum==target)
        {
            ans.add(list);
            return;
        } else if(sum>target || i >= arr.length)
        {
            return;
        }
        for(int j=start;j<arr.length;j++)
        {
            sum+=arr[j];
            list.add(arr[j]);
            allCombi(arr,list,j,j,ans,target,sum);
            sum-= list.get(list.size()-1);
            list.remove(list.size()-1);
        }
    }
}
