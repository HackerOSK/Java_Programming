package Programs.OOPS.StaticKeyword;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    char gender;

    static long population = (long) 795e7;

    static void message()
    {
        System.out.println("Hello Everyone!");
//        System.out.println(this.age);  cannot use this keyword since cannot access nonstatic variable inside static method
    }



    public Human(int age, String name, int salary, boolean married, char gender) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.gender = gender;
        Human.population +=1;

    }
}
