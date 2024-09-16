package Programs.OOPS.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.setInstance("Omkar");
        System.out.println(s1.name);

        SingletonClass s2 = SingletonClass.setInstance("Soham");
        System.out.println(s1.name);

    }
}
