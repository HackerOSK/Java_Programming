package Programs.Recursion.Kunal_Playlist;

public class SumofDigit {
    public static void main(String[] args) {
        System.out.println(sumofdigi(123));
    }
    static int sumofdigi(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return sumofdigi(n/10)+n%10;
    }
}
