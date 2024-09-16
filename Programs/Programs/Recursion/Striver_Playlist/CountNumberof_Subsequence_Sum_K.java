package Programs.Recursion.Striver_Playlist;

public class CountNumberof_Subsequence_Sum_K {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(countSubseq(0,0,5,arr));
    }

    private static int countSubseq(int ind,int sum,int target,int arr[]) {
        if(ind>=arr.length)
        {
            if(sum==target)
            {
                return 1;
            }
            return 0;
        }
        sum+=arr[ind];
        int l = countSubseq(ind+1,sum,target,arr);
        sum-=arr[ind];
        int r = countSubseq(ind+1,sum,target,arr);
        return l+r;
    }
}
