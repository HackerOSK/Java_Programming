package Programs.Questions;

import java.util.Stack;

public class Make_The_String_Great {
    public static void main(String[] args) {

        String s = "abBAcC";
//        leetcode
        Stack<Character> charstack = new Stack<>();
        charstack.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(charstack.empty())
            {
                charstack.push(s.charAt(i));
            }
            else if(charstack.peek()+32==s.charAt(i) || charstack.peek()-32==s.charAt(i))
            {
                charstack.pop();
            }
            else
            {
                charstack.push(s.charAt(i));
            }
        }


        StringBuilder ans = new StringBuilder();
        for(char i:charstack)
        {
            ans.append(i);
        }
        System.out.println(ans);




    }
}
