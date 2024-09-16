package Programs.Questions;

public class MinimumLengthOfStringAfterDeleting {


//     MY approach

//    public static void main(String[] args) {
//        String s = "cabaabac";
//        StringBuilder sb = new StringBuilder(s);
//        int st = 0;
//        int ed = s.length()-1;
//
//        while(st<ed)
//        {
//
//            if((sb.charAt(st + 1) == sb.charAt(st) || sb.charAt(ed - 1) == sb.charAt(ed)) && (st+1!=ed || ed-1!=st)) {
//                if (sb.charAt(st + 1) == sb.charAt(st) && st+1!=ed) {
//
//                    st++;
//
//                }
//                if (sb.charAt(ed - 1) == sb.charAt(ed) && ed-1!=st) {
//
//                    ed--;
//
//                }
//            }
//            else if(sb.charAt(st)==sb.charAt(ed))
//            {
//                sb.delete(ed,sb.length());
//                sb.delete(0,st+1);
//                st = 0;
//                ed = sb.length()-1;
//                System.out.println(sb.length());
//            }
//            else
//            {
//                break;
//            }
//
//        }
//
//        return sb.length();
//    }
//
//        System.out.println(sb.length());
//
//
//    }
//
//    private static boolean samechar(StringBuilder sb) {
//        for(int i=0;i<sb.length();i++)
//        {
//            if(sb.charAt(i)!=sb.charAt(0))
//            {
//                return false;
//            }
//        }
//
//        return true;
//    }


    public static void main(String[] args) {
        String s = "cabaabac";
        char[] c = s.toCharArray();
        int st =0;
        int ed = s.length()-1;
        while(st<ed)
        {
            if(c[st]!=c[ed])
                break;
            char ch = c[st];
            while (st<=ed && c[st]==ch) st++;
            while (ed>=st && c[ed]==ch) ed--;

        }

        System.out.println(ed-st+1);
    }
}



