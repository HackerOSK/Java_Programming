package Programs.Questions;

import java.util.Arrays;

public class CounttheNumberofConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String words[] = {"a","b","c","ab","ac","bc","abc"};
        int counter=0;
        for(String i : words)
        {
            int count=0;
            for(char j : i.toCharArray())
            {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                if(allowed.contains(sb.toString()))
                {
                    count++;
                }
                else {
                    count=0;
                    break;
                }
            }
            if(count==i.length())
            {
                counter++;
            }
        }

        System.out.println(counter);
    }

}
