package Programs.Recursion.Kunal_Playlist;

import Programs.Questions.print;

public class printNum {
    public static void main(String[] args) {
        printNum(5);
    }
    static void printNum(int n)
    {
        if(n<1)
        {
            System.out.println("===========");
            return;
        }
        System.out.println(n);
        printNum(n-1);
        System.out.println(n);
    }
}
