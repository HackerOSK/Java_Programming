package Programs.Questions;

public class test {
    static void swap (Integer x, Integer y) {
        Integer t = x;
        x = y;
        y = t;
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        swap(a, b);
        System.out.println("a=" + a + " b=" + b);
    }
}
