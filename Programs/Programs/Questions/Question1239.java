package Programs.Questions;

import java.util.*;

//Maximum Length of a Concatenated String with Unique Characters
public class Question1239 {
    public static void main(String[] args) {
        String[]  arr = {"s","sa","m","e","mu","ei"};
        Stack<String> res = new Stack<>();

        String temp;
        int max=0;


        for(int i=0;i<arr.length;i++)
        {

            res.push(arr[i]);
            if(findDuplicates(res.peek()))
            {
                if(res.peek().length()>max)
                {
                    max=res.peek().length();
                }
            }
            int j=1;

            while(j<arr.length)
            {
                temp = res.peek();
                temp = temp.concat(arr[j]);
                System.out.println(res.peek());
                res.push(temp);
                System.out.println(res.peek());

                if(findDuplicates(temp))
                {
                    if(res.peek().length()>max)
                    {
                        max=res.peek().length();
                    }
                    res.push(temp);
                    j++;

                }
                else
                {
                    res.pop();
                }
                if(res.size()==1)
                {
                    j++;
                }
                System.out.println(max);



            }
        }

        System.out.println(max);
    }

    static boolean findDuplicates(String str)
    {
        Set<Character> freq = new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            freq.add(str.charAt(i));
        }
        if(freq.size() == str.length()) {
            return true;
        }
        return false;
    }

}
