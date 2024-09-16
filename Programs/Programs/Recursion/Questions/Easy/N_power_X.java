package Programs.Recursion.Questions.Easy;

public class N_power_X {
    public static void main(String[] args) {
        int n = 8,x = 2;
        System.out.println(getpow(n,x));
    }

    private static int getpow(int n, int x) {
        if(x==0)
        {
            return 1;
        }
        return getpow(n,x-1)*n;
    }
}
