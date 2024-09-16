package Programs.OOPS.StaticKeyword;


public class StaticClass {

    static int a =10;
    static int b;


    static
    {
        System.out.println("🙋‍♂️🙋‍♂️ I am the static block!");
        b = a * 2;
    }




    public static void main(String[] args) {

        StaticClass s1 = new StaticClass();
        System.out.println(StaticClass.a);
        System.out.println(StaticClass.b);

        StaticClass.b+=4;
        StaticClass s2 = new StaticClass();
        System.out.println(StaticClass.a);
        System.out.println(StaticClass.b);


    }
}
