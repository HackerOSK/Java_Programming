package Programs.Questions;

import java.util.Arrays;

public class Longest_Common_Prefix {
//    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
//        String ans;
//        Arrays.sort(strs);
//        String s1 = strs[0];
//        String s2 = strs[strs.length-1];
//        int i=0;
//        while(i<s1.length() && i<s2.length())
//        {
//            if(s1.charAt(i) != s2.charAt(i))
//            {
//
//                break;
//            }
//            i++;
//        }
//        System.out.println(s1.substring(0,i));
//
//
//    }







//  Most Optimal

    public static void main(String[] args) {
        String[] strs = {"flower","flow","floight"};
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++)
        {

            while(strs[i].indexOf(prefix)!=0)
            {
                System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0,prefix.length()-1);
            }
            System.out.println(strs[i].indexOf(prefix));
        }

        System.out.println(prefix);
    }
}
