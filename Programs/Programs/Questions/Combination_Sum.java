package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        getList(new ArrayList<>(), arr, 0, target,ans);
        System.out.println(ans);
    }

    private static void getList(List<Integer> list, int[] arr, int i, int target,List<List<Integer>>ans) {
        if(target<=0)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(list));

            }
            return;
        }

        for(int j=i;j< arr.length;j++)
        {
            if(j>i && arr[j]==arr[j-1]) continue;
            list.add(arr[j]);
            getList(list,arr,j+1,target-arr[j],ans);
            list.remove(list.size()-1);

        }
    }

}

