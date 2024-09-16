package Programs.OOPS.StaticKeyword;

public class Main {
    public static void main(String[] args) {


//        Human h1 = new Human(20,"Omkar",100000,false,'m');
//        System.out.println(h1.population);
//        Human h2 = new Human(17,"Soham",200000,true,'m');
//        System.out.println(h2.population);
//
//        System.out.println(Human.population);

        Main obj1 = new Main();
        obj1.fun();


    }

    void fun()
    {
        greet();
    }




    void greet()
    {
        System.out.println("Hello Everyone!");

    }
}
