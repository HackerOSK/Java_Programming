package Programs.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class NextLargest {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[arr.length];
        int i = arr.length-1;
        while(i>=0)
        {
            if(stk.empty())
            {
                ans[i]=-1;
                stk.push(arr[i]);
                i--;
            }
            else if(stk.peek()>arr[i])
            {
                ans[i]=stk.peek();
                stk.push(arr[i]);
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
