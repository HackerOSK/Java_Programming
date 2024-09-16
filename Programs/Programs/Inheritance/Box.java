package Programs.Inheritance;

public class Box {
    double h;
    double l;
    double w;

    double weight=10;

//    Default
    Box()
    {
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

//    Cube
    Box(double side)
    {
//        super(); call the object class constructor
        this.l=side;
        this.h=side;
        this.w=side;
    }

//    Cuboid
    Box(double l,double w,double h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }

    void info()
    {
        System.out.println("This object is of Default Box class");
    }

    public static void main(String[] args) {
//        Box box = new Box();
//        Box box1 = new Box(4.5);
//        Box box2 = new Box(4.5,3.5,5.5);
//
//        System.out.println("Box = H : "+box.h+" L : "+box.l+" W : "+box.w);
//        System.out.println("Box1 = H : "+box1.h+" L : "+box1.l+" W : "+box1.w);
//        System.out.println("Box2 = H : "+box2.h+" L : "+box2.l+" W : "+box2.w);

//        Cube c1 = new Cube(10,20);
//        System.out.println("Box = H : "+c1.h+" L : "+c1.l+" W : "+c1.w+" weight : "+c1.weight);
//        c1.info();

//        Cuboid c2 = new Cuboid(10.3,23.1,10,20,"Red");
//        System.out.println("Box = H : "+c2.h+" L : "+c2.l+" W : "+c2.w+" weight : "+c2.weight+" color : "+c2.color);
//        c2.info();

//        Reference of superclass for a subclass object
//        Box b1 = new Cube(10,5);
//        System.out.println(b1.l);
//        System.out.println(b1.w);
//        System.out.println(b1.h);
//        System.out.println(b1.weight);

//        Cube c3 = new Box(10,2,3); //error

//        use of super keyword
        Cube c4 = new Cube();
        System.out.println("Box = H : "+c4.h+" L : "+c4.l+" W : "+c4.w+" weight : "+c4.weight);







    }
}

class Cube extends Box
{
    double weight;

//    Cube(double side,double we)
//    {
//        this.l=side;
//        this.h=side;
//        this.w=side;
//        this.weight=we;
//    }

//    Using Super keyword
    Cube(double side,double weight)
    {
        super(side);
        this.weight=weight;
    }

    Cube()
    {
        super(10);
        this.weight=super.weight;
    }


    void info()
    {
        System.out.println("This object is of Cube class");
    }

}

class Cuboid extends Box
{
    double weight;
    String color;

//    Cuboid(double l,double w,double h,double we,String col)
//    {
//        this.l=l;
//        this.w=w;
//        this.h=h;
//        this.weight=we;
//        this.color = col;
//    }
        Cuboid(double l,double w,double h,double we,String color)
        {
            super(l,w,h);
            this.weight=we;
            this.color=color;
        }

    void info()
    {
        System.out.println("This object is of Cuboid class");
    }
}



