package Programs.Questions;

import java.util.HashSet;
import java.util.Set;

public class Pallindrome_Substring {
//    public static void main(String[] args) {
//        String str = "abccbc";
//        int count = str.length();
//        for(int s = 0;s<str.length();s++)
//        {
//            for(int e = s+2;e<=str.length();e++)
//            {
//                String substr = str.substring(s,e);
//                if(isPallindrome(substr))
//                {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//
//    private static boolean isPallindrome(String substr) {
//        int s = 0;
//        int e = substr.length()-1;
//        while(s!=substr.length()/2)
//        {
//            if(substr.charAt(s)!=substr.charAt(e))
//            {
//                return false;
//            }
//            s++;
//            e--;
//        }
//
//        return true;
//    }





//    best approach
public static void main(String[] args) {
    {
        String str = "aaa";
        Set<String> set = new HashSet<>();
        int count = 0;
        int left =0;
        int right = 0;
        int i=0;
        while(i<str.length())
        {
            left = i;
            right = i;

            while(left>=0 && right<str.length())
            {
                if(str.charAt(left)==str.charAt(right))
                {
                    System.out.println(str.substring(left,right+1));

                }
                if(left!=0 && right!=str.length()-1)
                {
                    left--;
                    right++;
                }
                else if(left==0 && right<str.length())
                {
                    right++;
                }
                else if(left>0 && right==str.length()-1)
                {
                    left--;
                }
            }
            i++;
        }

        System.out.println(count);

    }
}
}
