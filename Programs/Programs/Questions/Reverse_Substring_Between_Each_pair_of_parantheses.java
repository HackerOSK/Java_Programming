package Programs.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse_Substring_Between_Each_pair_of_parantheses {
    public static void main(String[] args) {
        String str = "(u(love)i)";
        Stack<Character> stk = new Stack<>();
        ArrayList<Character> arr = new ArrayList<>();
        for(char i : str.toCharArray())
        {
            if(i!=')')
            {
                stk.push(i);
            }else {
                char ch = stk.pop();

                while(ch!='(')
                {
                    arr.add(ch);
                    ch = stk.pop();
                }
                for(int j=0;j<arr.size();j++) {
                    stk.push(arr.get(j));
                }
                arr = new ArrayList<>();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char i : stk)
        {
            sb.append(i);
        }

        System.out.println(sb.toString());




    }
}
