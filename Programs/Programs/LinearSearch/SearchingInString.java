package Programs.LinearSearch;

import java.util.Scanner;

public class SearchingInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "JavaProgramming";
        System.out.print("Enter which character do you want to search in given string : ");
        char target = in.next().trim().charAt(0);
        int index = SearchChar(str,target);
        if(index>=0)
        {
            System.out.println("The Character Found at index : "+index);
        }
        else
        {
            System.out.println("The Character Not Found");
        }


    }

    static int SearchChar(String str, char target) {
        if(str.length()==0)
        {
            return -1;
        }
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)==target)
            {
                return i;
            }
        }

        return -1;

    }
}
