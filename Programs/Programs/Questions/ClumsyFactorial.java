package Programs.Questions;



public class ClumsyFactorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(clumsy(n));

    }
    static int clumsy(int N) {
        if (N == 1) return 1;
        if (N == 2) return 2;
        if (N == 3) return 6;
        if (N == 4) return 7;
        if (N % 4 == 1) return N + 2;
        if (N % 4 == 2) return N + 2;
        if (N % 4 == 3) return N - 1;
        return N + 1;
    }


}
