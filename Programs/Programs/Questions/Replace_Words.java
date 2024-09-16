package Programs.Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Trie Class
class TrieNode
{
    TrieNode ch[] = new TrieNode[26];
    boolean flag;
}

public class Replace_Words {
    public static void main(String[] args) {


//        Time Limit Exceed

//        List<String> dict = new ArrayList<>();
//        String d[] = {"a","b","c"};
//        for(String r : d)
//        {
//            dict.add(r);
//        }
//        String sent = "aadsfasf absbs bbab cadsfafs";
//        arrangeDict((ArrayList<String>) dict);
//        System.out.println(dict);
//        StringBuilder newsent = new StringBuilder("");
//        String sentence[] = sent.split(" ");
//        System.out.println(Arrays.toString(sentence));
//        for(int l = 0;l<sentence.length;l++)
//        {
//            String i = sentence[l];
//            int j =0;
//            while(j<dict.size())
//            {
//                if(i.contains(dict.get(j)) && checkprefix(dict.get(j),i))
//                {
//                    sentence[l] = dict.get(j);
//                    break;
//                }
//                j++;
//            }
//        }
//
//        System.out.println(Arrays.toString(sentence));
//        System.out.println(ToString(sentence));


//        _______________________________________________________________________________________________________
//        _______________________________________________________________________________________________________
//        _______________________________________________________________________________________________________



//        Implementing Trie
        TrieNode root = new TrieNode();
        List<String> dict = new ArrayList<>();
        String sentence = "the cattle was rattled by the battery";
        String d[] = {"cat","bat","rat"};
        for(String s : d)
        {
            dict.add(s);
        }
        for(String s : dict)
        {
            insertString(s,root);
        }
        String sent[] = sentence.split(" ");
        System.out.println(Arrays.toString(sent));
        StringBuilder newSent = new StringBuilder("");
        for(String str : sent)
        {
            if(SearchStr(str,root)==-1)
            {
                newSent.append(str);
                newSent.append(' ');
                System.out.println("he");
            }else
            {
                newSent.append(str.substring(0,SearchStr(str,root)+1));
                newSent.append(' ');
            }

        }
        newSent.deleteCharAt(newSent.length()-1);

        System.out.println(newSent.toString());
//        System.out.println(SearchStr("a",root));





















    }



    //    Trie Insert Function
private static void insertString(String s, TrieNode root) {
    TrieNode q = root;
    for(char c : s.toCharArray())
    {
        if(q.ch[c-'a']!=null)
        {
            q = q.ch[c-'a'];
        }
        else
        {
            TrieNode temp = new TrieNode();
            temp.flag = false;
            q.ch[c-'a'] = temp;
            q = q.ch[c-'a'];
        }
    }
    q.flag=true;
}

//  Trie Search Function
private static int SearchStr(String str, TrieNode root) {
        int count = 0;
        TrieNode q = root;
        for(char c : str.toCharArray())
        {
            if(q.ch[c-'a']!=null) {
                if (q.ch[c-'a'].flag) {
                    return count;
                }else {
                    q = q.ch[c - 'a'];
                    count++;
                }
            }else
            {
                return -1;
            }

        }

        return -1;
}

















//    Time Limit Exceed

//    private static boolean checkprefix(String s, String i) {
//        String test = i.substring(0,s.length());
////        System.out.println(test);
////        System.out.println(s);
//        if(test.equals(s))
//        {
//            System.out.println(true);
//            return true;
//        }
//        return false;
//    }
//
//    private static String ToString(String[] sentence) {
//        StringBuilder st = new StringBuilder("");
//        for(String i : sentence)
//        {
//            st.append(i);
//            st.append(' ');
//        }
//        st.deleteCharAt(st.length()-1);
//        return st.toString();
//    }
//
//    private static void arrangeDict(ArrayList<String> dict) {
//        for(int i=0;i<dict.size()-1;i++)
//        {
//            for(int j=i+1;j< dict.size();j++)
//            {
//                if(dict.get(i).length() > dict.get(j).length())
//                {
//                    String temp = dict.get(i);
//                    dict.set(i,dict.get(j));
//                    dict.set(j,temp);
//                }
//            }
//        }
//    }
}
