package Programs.Recursion;

// Program to write print "hello world!" 5 times
public class Basic {
    public static void main(String[] args) {
        message();
    }

    static void message()
    {
        System.out.println("hello world!");
        message1();
    }static void message1()
    {
        System.out.println("hello world!");
        message2();
    }static void message2()
    {
        System.out.println("hello world!");
        message3();
    }static void message3()
    {
        System.out.println("hello world!");
        message4();
    }static void message4()
    {
        System.out.println("hello world!");
    }
}
