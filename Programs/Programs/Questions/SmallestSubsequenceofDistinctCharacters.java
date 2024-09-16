package Programs.Questions;

import java.util.Arrays;

public class SmallestSubsequenceofDistinctCharacters {
    public static void main(String[] args) {
        String s = "bcabc";
        int freq[] = new int[26];
        Arrays.fill(freq,-1);
        for(int i=0;i<s.length();i++)
        {
            int j;
            for(j=(s.charAt(i)-'a')-1;j>=0;j--)
            {
                if(freq[j]>-1)
                {

                }

            }
        }
    }
}
