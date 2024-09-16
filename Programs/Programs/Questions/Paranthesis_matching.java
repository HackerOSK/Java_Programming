package Programs.Questions;

import java.util.Stack;

public class Paranthesis_matching {
    public static void main(String[] args) {
        String str = "]";
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{')
            {
                stk.push(str.charAt(i));
            } else if (!stk.empty() && ((stk.peek()=='(' && str.charAt(i)==')') || (stk.peek()=='{' && str.charAt(i)=='}') || (stk.peek()=='[' && str.charAt(i)==']'))) {
                stk.pop();
            }
            else
            {
                stk.push(str.charAt(i));
            }
        }

        if(stk.empty())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
