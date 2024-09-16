package Programs.Recursion.Questions.Easy;

public class factorialOfNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial : "+facto(n));
    }

    private static int facto(int n) {
        if(n==1)
        {
            return n;
        }
        return facto(n-1)*n;
    }
}
