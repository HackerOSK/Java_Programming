package Programs.Recursion.Kunal_Playlist;

import Programs.Questions.print;

public class Factorial_of_N {
    public static void main(String[] args) {
        System.out.println(facto(0));
    }
    static int facto(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return facto(n-1)*n;
    }
}
