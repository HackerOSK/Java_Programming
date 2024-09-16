package Programs.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class Minimum_Remove_to_Make_Valid_Parentheses {
    public static void main(String[] args) {
        String s ="))((";
        Stack<Integer> ind = new Stack<>();
        ArrayList<Integer> invalide = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                ind.push(i);
            }
            else if(s.charAt(i)==')')
            {
                if(ind.empty())
                {
                    invalide.add(i);
                }
                else
                {
                    ind.pop();
                }

            }
        }

        while(!ind.empty())
        {
            invalide.add(ind.pop());
        }

//        System.out.println(invalide);
        StringBuilder ans = new StringBuilder(s);
        StringBuilder ans2 = new StringBuilder();
        for(int i:invalide)
        {
                ans.setCharAt(i,'#');
        }
        for(int i = 0 ; i <s.length();i++)
        {
            if(ans.charAt(i)!='#')
            {
                ans2.append(ans.charAt(i));
            }
        }

        System.out.println(ans2.toString());
    }

}
