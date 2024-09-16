package Programs.Recursion.Kunal_Playlist;

public class SumofN {
    public static void main(String[] args) {
        System.out.println(sumofn(3));
    }
    static int sumofn(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return sumofn(n-1)+n;
    }
}
