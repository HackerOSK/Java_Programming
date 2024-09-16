package Programs.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Largest_cyclic {
    public static void main(String[] args) {
        int arr[] = {73,74,75,71,69,72,76,73};
        Stack<Integer> stk = new Stack<>();
        int len = arr.length;
        int[] ans = new int[arr.length];
        int i=2*(arr.length)-1;
        stk.push(arr[i%len]);

//        Same as simple NextLargest element code one difference is that instead of i = arr.length-1  here i=2*(arr.length)-1 so our array virtually looks like {73,74,75,71,69,72,76,73,73,74,75,71,69,72,76,73}
        while(i>=0)
        {
            if(stk.empty())
            {
                ans[i%len]=-1;
                stk.push(arr[i%len]);
                i--;
            }
            else if(stk.peek()>arr[i%len])
            {
                ans[i%len]=stk.peek();
                stk.push(arr[i%len]);
                i--;
            }
            else
            {
                stk.pop();
//                count++;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
