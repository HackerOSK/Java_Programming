package Programs.Recursion.Kunal_Playlist;

public class RevNum {
    public static void main(String[] args) {


        System.out.println(revNum(1,0));
    }
    static int revNum(int n,int res)
    {
        if(n==0)
        {
            return res;
        }
        res=(res*10)+(n%10);
        return revNum(n/10,res);

    }
}
