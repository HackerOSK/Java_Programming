package Programs.Questions;

import java.util.*;

public class NumberofStudentsUnabletoEatLunch {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};

        int count=0;

//        111
//        011


        ArrayList<Integer> queue = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i:students)
        {
            queue.add(i);
        }
        for(int i=sandwiches.length-1;i>=0;i--)
        {
            stack.push(sandwiches[i]);
        }
        while(!stack.empty())
        {
            if(queue.get(0)==stack.peek())
            {
                stack.pop();
                queue.remove(0);
                count=0;
            }
            else
            {
                int temp = queue.get(0);
                queue.remove(0);
                queue.add(temp);
                count++;
                if(count== queue.size())
                {
                    break;
                }
            }


        }

        System.out.println(queue.size());



    }
}
