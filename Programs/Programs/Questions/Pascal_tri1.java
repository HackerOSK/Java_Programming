package Programs.Questions;

// pascal triangle return the value at particular (row,col)

public class Pascal_tri1 {
    public static void main(String[] args) {
        int row = 6;
        int col =2;
        int ans;
        ans = Combination(row-1,col-1);
        System.out.println(ans);
    }

    static int Combination(int n, int r) {
        int res0=1;
        int res1=1;
        for(int i=1;i<=r;i++)
        {
            res0 = res0 * n;
            n--;
            res1 = res1 * i;
        }
        System.out.println(res0);
        System.out.println(res1);

        return res0/res1;
    }
}
