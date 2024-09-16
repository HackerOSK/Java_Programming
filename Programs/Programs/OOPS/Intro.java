package Programs.OOPS;


import java.util.Arrays;

//Class Student
class Student
{
    int roll;
    String name;

    static int counter =0;
    int count=0;

    Student(int roll, String name)
    {
        this.name = name;
        this.roll = roll;
        this.count = counter++;

    }

//  Copy Constructor
    Student(Student x)
    {
        this.name = x.name;
        this.roll = x.roll;
        this.count = x.count;
    }

    Student()
    {
//        empty constructor
//        calling another constructor inside an empty constructor using this keyword
        this(11,"x");
    }

//    Student(int ro,String naam)
//    {
//        name = naam;
//        roll = ro;
//    }

}
public class Intro {
    public static void main(String[] args) {
//        Object
//        Student om;

//        here we declare the array of our Student class but we not initialise the elements or object in it
        Student[] student = new Student[5];
//        System.out.println(Arrays.toString(student));

//        om = new Student();

        Student om = new Student(17,"omkar");
        Student som = new Student(90,"soham");

        Student random = new Student(som);

        System.out.println("som object");
        System.out.println(som.name);
        System.out.println(som.roll);
        System.out.println(som.count);

        System.out.println("Random Object which copy of som");
        System.out.println(random.name);
        System.out.println(random.roll);
        System.out.println(random.count);

//        Calling empty constructor
        Student randomStud = new Student();

        System.out.println("RandomStud Object created using empty constructor");
        System.out.println(randomStud.name);
        System.out.println(randomStud.roll);
        System.out.println(randomStud.count);

        Student one = new Student();
        Student two = one;

        System.out.println("One Student = "+one.name);
        System.out.println("Two Student = "+two.name);

        two.name = "Omkar";
        System.out.println(one.name);



//        System.out.println("Name : "+om.name);
//        System.out.println("Roll no : "+om.roll);

//        System.out.println(om.count);
//        System.out.println(som.count);



//        om.name = "omkar";
//        om.roll = 17;

//        System.out.println("Name : "+om.name);
//        System.out.println("Roll no : "+om.roll);


    }
}
