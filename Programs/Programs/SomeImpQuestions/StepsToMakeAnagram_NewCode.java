package Programs.SomeImpQuestions;

public class StepsToMakeAnagram_NewCode {
//    public static void main(String[] args) {
//        String s ="bab";
//        String t ="aba";
//        char[] T = t.toCharArray();
//        int count = 0;
//
//        for(int i=0;i<s.length();i++)
//        {
//            int index = Contains(s.charAt(i),T);
//            if(index==-1)
//            {
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }
//
//    static int Contains(char target,char[] ch)
//    {
//        for(int i=0;i<ch.length;i++)
//        {
//            if(ch[i]==target)
//            {
//                ch[i]='0';
//                return i;
//
//            }
//        }
//
//        return -1;
//    }

    public static void main(String[] args) {
        String s ="bab";
        String t ="aba";


        int[] arr = new int[26];
        for(int ind = 0;ind<s.length();ind++)
        {
            arr[s.charAt(ind) - 'a']++;
            arr[t.charAt(ind) - 'a']--;
        }
        int minSteps = 0;
        for(int idx=0; idx < 26; idx++) {
            minSteps += Math.max(0, arr[idx]);
        }
        System.out.println(minSteps);
    }
}
