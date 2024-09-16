package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] h2 = height.clone();
        int[] h1 = height.clone();

        int len= height.length;
        int trap=0;
        int[] left = new int[len];
        int[] right = new int[len];
        left = getLargestOfLeft(height);
        right = getLargestOfright(h1);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for(int i=0;i<h2.length;i++)
        {
            if(h2[i]<left[i] && h2[i]<right[i])
            {
                trap = trap + (Math.min(left[i],right[i])-h2[i]);
            }

        }

        System.out.println(trap);
    }

    private static int[] getLargestOfright(int[] height) {
        Stack<Integer> stk = new Stack<>();
        int i=height.length-1;
        while (i>=0)
        {
            if(stk.isEmpty())
            {
                stk.push(height[i]);
                height[i]=-1;
                i--;
            }
            else
            {
                if(stk.peek()>height[i])
                {
                    height[i]=stk.peek();
                    i--;
                }
                else
                {
                    if(stk.isEmpty())
                    {
                        int temp = height[i];
                        height[i]=-1;
                        stk.push(temp);
                        i--;
                    }
                    else
                    {
                        stk.pop();
                    }
                }
            }
        }
        return height;
    }

    private static int[] getLargestOfLeft(int[] height) {
        Stack<Integer> stk = new Stack<>();
        int i=0;
        while (i<height.length)
        {
            if(stk.isEmpty())
            {
                stk.push(height[i]);
                height[i]=-1;
                i++;
            }
            else
            {
                if(stk.peek()>height[i])
                {
                    height[i]=stk.peek();
                    i++;
                }
                else
                {
                    if(stk.isEmpty())
                    {
                        int temp = height[i];
                        height[i]=-1;
                        stk.push(temp);
                        i++;
                    }
                    else
                    {
                        stk.pop();
                    }
                }
            }
        }
        return height;
    }
}
