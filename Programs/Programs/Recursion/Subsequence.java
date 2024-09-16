package Programs.Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        printSubseq(0,list,arr);
        printSubseq_sum_k(0,list,arr,0,5);
    }

    private static void printSubseq(int ind,ArrayList<Integer> list,int[] arr) {
        if(ind>=arr.length)
        {

                System.out.println(list);

            return;
        }
        list.add(arr[ind]);
        printSubseq(ind+1,list,arr);
        list.remove(list.size()-1);
        printSubseq(ind+1,list,arr);
    }

    private static void printSubseq_sum_k(int ind,ArrayList<Integer> list,int[] arr,int sum,int target) {
        if(ind>=arr.length)
        {
            if(sum==target) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
        printSubseq_sum_k(ind+1,list,arr,sum,target);
        sum-=list.get(list.size()-1);
        list.remove(list.size()-1);
        printSubseq_sum_k(ind+1,list,arr,sum,target);
    }
}
