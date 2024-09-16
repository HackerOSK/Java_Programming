package Programs.Trie;

import java.util.Scanner;

class TrieNode
{
    TrieNode ch[] = new TrieNode[26];
    boolean flag;
}


public class Basic_operation {

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        root.flag = false;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while(loop)
        {
            System.out.println("Choose the operation on the Trie : ");
            System.out.println("1) Insert the Word \n2) Search the word \n3)Finding Shortest Prefix\n");
            int opt = sc.nextInt();
            switch (opt)
            {
                case 1:
                    System.out.println("Enter the word which you want to insert : ");
                    String str = sc.next();
                    InsertWord(str,root);
                    break;
                case 2:
                    System.out.println("Enter the string which you want to search : ");
                    String str1 = sc.next();
                    if(SearchWord(str1,root))
                    {
                        System.out.println("String is Present !");
                    }
                    else
                    {
                        System.out.println("String is not Present !");
                    }
                    break;
                case 3:
                    System.out.println("Enter 2 strings for which you wants to find shortest prefix : ");
                    System.out.print("Enter first String : ");
                    String s1 = sc.next();
                    System.out.print("\nEnter the 2nd string : ");
                    String s2 = sc.next();
//                    FindPrefix(s1,s2);
                    break;
            }
        }
    }

    private static boolean SearchWord(String str1,TrieNode root) {
        TrieNode q = root;
        for(char s : str1.toCharArray())
        {
            if(q.ch[s-'a']!=null)
            {
                q = q.ch[s-'a'];
            }else
            {
                return false;
            }
        }
        if(q.flag==false)
        {
            return false;
        }
        return true;
    }

    private static void InsertWord(String str,TrieNode root) {
        TrieNode q = root;
        for(char s : str.toCharArray())
        {
            TrieNode temp = new TrieNode();
            if(q.ch[s-'a']!=null)
            {
                q = q.ch[s-'a'];

            }
            else
            {
                q.ch[s-'a'] = temp;
                temp.flag=false;
                q = q.ch[s-'a'];
            }
        }
        q.flag=true;
    }
}
