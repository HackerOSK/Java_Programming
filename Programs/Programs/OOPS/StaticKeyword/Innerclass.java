package Programs.OOPS.StaticKeyword;

public class Innerclass {

    static class TestClass
    {
        String name;
        TestClass(String name)
        {
            this.name=name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void main(String[] args) {

        TestClass t1 = new TestClass("Omkar");
        TestClass t2 = new TestClass("Soham");

//        System.out.println(t1.name);
//        System.out.println(t2.name);

        System.out.println(t1);




    }
}
