package Programs.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[temp.length];
        int i=temp.length-1;
        int count=0;
        while(i>=0)
        {
            if(stk.empty())
            {
                ans[i]=0;
                stk.push(i);
                i--;
                count=0;
            }
            else if(temp[stk.peek()]>temp[i])
            {
                ans[i]=stk.peek()-i;
                stk.push(i);
                i--;

            }
            else
            {
                stk.pop();

            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
