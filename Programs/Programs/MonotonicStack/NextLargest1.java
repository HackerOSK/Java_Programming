package Programs.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class NextLargest1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Arrays.toString(arr));
        int[] carr = arr.clone();
        Stack<Integer> stk = new Stack<>();
        int i =arr.length-1;
        while(i>=0)
        {
            if(stk.isEmpty())
            {
                stk.push(arr[i]);
                arr[i]=-1;
                i--;
            }else
            {
                if(stk.peek()>arr[i])
                {
                    int temp = arr[i];
                    arr[i]=stk.peek();
//                    stk.push(temp);
                    i--;
                }
                else
                {
                    if(stk.isEmpty())
                    {
                        stk.push(arr[i]);
                        arr[i]=-1;
                    }
                    else
                    {
                        stk.pop();
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        arr = carr.clone();

        stk.removeAll(stk);


        i =0;
        while(i<arr.length)
        {
            if(stk.isEmpty())
            {
                stk.push(arr[i]);
                arr[i]=-1;
                i++;
            }else
            {
                if(stk.peek()>arr[i])
                {
                    int temp = arr[i];
                    arr[i]=stk.peek();
//                    stk.push(temp);
                    i++;
                }
                else
                {
                    if(stk.isEmpty())
                    {
                        stk.push(arr[i]);
                        arr[i]=-1;
                    }
                    else
                    {
                        stk.pop();
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
