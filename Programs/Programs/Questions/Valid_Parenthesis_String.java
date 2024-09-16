package Programs.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class Valid_Parenthesis_String {
    public static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        Stack<Integer>stk = new Stack<>();
        ArrayList<Integer> star = new ArrayList<>();
        boolean ans = true;

        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                star.add(i);
            }
        }

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stk.push(i);
            }
            else if(s.charAt(i)==')')
            {
                if(stk.empty())
                {
                    if(star.get(0)<=i)
                    {
                        star.remove(0);
                    }
                    else
                    {
                        ans = false;
                        break;
                    }
                }
                else
                {
                    stk.pop();
                }
            }
        }

        if(!stk.empty())
        {
            while(!stk.empty())
            {
                if(star.get(0)>=stk.peek())
                {
                    stk.pop();
                }
                else
                {
                    ans = false;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
