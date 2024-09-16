package Programs.SomeImpQuestions;

import java.util.HashMap;

public class StepsToMakeAnagram_UsingHashMap {
    public static void main(String[] args) {
        String s ="bab";
        String t ="aba";
        int count = 0;
        HashMap<Character,Integer> map_s = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map_s.containsKey(c)) {
                map_s.put(c, map_s.get(c) + 1);
            } else {
                map_s.put(c, 1);
            }
        }

        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(map_s.containsKey(ch))
            {
                if(map_s.get(ch)==0)
                {
                    count++;
                }
                else
                {
                    map_s.put(ch,map_s.get(ch) -1);
                }

            }
            else
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
