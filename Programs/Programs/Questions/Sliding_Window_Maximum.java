package Programs.Questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int i=0;
        int itr=k;
        int ans[] = new int[nums.length-k+1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int max=Integer.MIN_VALUE;
        for(int j=0;j<k;j++) {
            if (nums[j] > max) {
                max = nums[j];
                if(deque.isEmpty())
                {
                    deque.add(nums[j]);
                }else{
                    while (!deque.isEmpty())
                    {
                        deque.pop();
                    }
                    deque.add(nums[j]);
                }
            }else {
                deque.add(nums[j]);
            }
        }
        ans[i] = max;
        i++;
        while(itr<nums.length)
        {
            System.out.println(deque);
            if(nums[itr]>deque.peek())
            {
                while(!deque.isEmpty())
                {
                    deque.pop();
                }
                deque.add(nums[itr]);
            }
            else {
                if(deque.size()>1) {
                    deque.removeLast();
                }
                deque.add(nums[itr]);
            }
            ans[i] = deque.peek();
            i++;
            itr++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
