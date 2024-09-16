package Programs.OOPS;


class A
{
    int roll;
    A()
    {
        this.roll=10;
        System.out.println("Object created successfully");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The Object is deleted Successfully");
    }
}
public class Wrapper {
    public static void main(String[] args) {
//        Wrapper classes are nothing but classes for Primitives in java

//        Boolean a = false;
//        now type of a is Object
//        System.out.println(((Object)a).getClass().getSimpleName());

//        int a =10;
//        int b =20;
//
//        swap(a,b);
//
//        System.out.println(a);
//        System.out.println(b);

        A a = new A();
        for(int i=0;i<=10000;i++)
        {
            a = new A();
        }

    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
