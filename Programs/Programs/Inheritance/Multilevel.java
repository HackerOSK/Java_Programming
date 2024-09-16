package Programs.Inheritance;

public class Multilevel {
    public static void main(String[] args) {
    Child2 ch21 = new Child2("Black","Blue","Omkar",20);
        System.out.println("haircolor : "+ch21.haircolor+"\neyecolor : "+ch21.eyecolor+"\nname : "+ch21.name+"\nage : "+ch21.age);

    }
}

class Parent
{
    String name;
    int age;

    Parent(String name,int age)
    {
        this.name= name;
        this.age=age;
    }
}

class Child1 extends Parent
{
    String eyecolor;
    Child1(String eyecolor,String name,int age)
    {
        super(name,age);
        this.eyecolor=eyecolor;
    }


}

class Child2 extends Child1
{
    String haircolor;
    Child2(String haircolor,String eyecolor,String name,int age)
    {
        super(eyecolor,name,age);
        this.haircolor=haircolor;
    }
}