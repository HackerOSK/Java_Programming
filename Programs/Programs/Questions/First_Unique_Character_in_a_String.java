package Programs.Questions;

import java.util.HashMap;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "leetcode";


//        My APPROACH

//        HashMap<Character,Integer> count = new HashMap<>();
//        for(char i : s.toCharArray())
//        {
//            count.put(i,0);
//        }
//        for(char i : s.toCharArray())
//        {
//            count.put(i,(count.get(i)+1));
//        }
//
//        for(int i=0;i<s.length();i++)
//        {
//            if(count.get(s.charAt(i))==1)
//            {
//                System.out.println(i);
//                break;
//            }
//        }




//        BEST APPROACH
        for(int i=0;i<s.length();i++)
        {
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
            {
                System.out.println(i);
                break;
            }
        }



    }
}
