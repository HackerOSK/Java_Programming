package Programs.Questions;

public class Fibonacci_Number_Recurssion {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n<2)
        {
            return n;
        }


        return fibo(n-2) + fibo(n-1);

    }

}
