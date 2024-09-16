package Programs.Questions;

import java.util.HashMap;

public class Isomorphic_Strings {
    public static void main(String[] args) {
//        s = "adbd" t ="erpr";
        String s = "badc";
        String t = "baba";


        HashMap<Character,Character> charmap = new HashMap<>();
        if(s.length()!=t.length())
        {
            System.out.println("Not Isomorphic");
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                if(charmap.containsKey(s.charAt(i)))
                {
                    if(charmap.get(s.charAt(i))!=t.charAt(i))
                    {
                        System.out.println("Not Isomorphic");
                        break;
                    }
                }
                else
                {
                    if(charmap.containsValue(t.charAt(i)))
                    {
                        System.out.println("Not Isomorphic");
                        break;
                    }

                    charmap.put(s.charAt(i),t.charAt(i));
                }
            }

        }

        System.out.println("Isomorphic");
    }
}
