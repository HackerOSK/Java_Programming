package Programs.Questions;

import java.util.Arrays;

public class MissingNum_CyclicSort {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                return i;
            }
        }

        return arr.length;

    }
}
