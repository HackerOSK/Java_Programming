package Programs.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LetterCombination_Phonenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();


        System.out.println("Enter the string : ");
        String inp = sc.next();
        for(int i=0;i<inp.length();i++)
        {

        }
        System.out.println("Ans : ");
        System.out.println(ans);


    }

    private static ArrayList<String> getCombination(int i, int j) {
        HashMap<Integer,String> letterToNumMap = new HashMap<>();
        letterToNumMap.put(2,"abc");
        letterToNumMap.put(3,"def");
        letterToNumMap.put(4,"ghi");
        letterToNumMap.put(5,"jkl");
        letterToNumMap.put(6,"mno");
        letterToNumMap.put(7,"pqrs");
        letterToNumMap.put(8,"tuv");
        letterToNumMap.put(9,"wxyz");

        ArrayList<String> ans = new ArrayList<>();
        String a = letterToNumMap.get(i);
        String b = letterToNumMap.get(j);
        for(int x=0;x<a.length();x++)
        {
            for(int y=0;y<b.length();y++)
            {
                StringBuilder str = new StringBuilder();
                str.append(a.charAt(x));
                str.append(b.charAt(y));
                ans.add(str.toString());
            }
        }
        return null;
    }
}
