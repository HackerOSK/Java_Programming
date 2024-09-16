package Programs.Polymorphism;

class Shape {

    public void area()
    {
        System.out.println("Area of Shape");
    }

    static void myshape()
    {
        System.out.println("I am a Shape");
    }

}

class Square
{
    double side;
    Square(double side)
    {
        this.side = side;
    }

    public void area()
    {
        System.out.println("Area of Square = "+this.side*this.side);
    }
    static void myshape()
    {
        System.out.println("I am a Square");
    }
}


class Circle
{
    double radius;
    double pi;
    Circle(double radius,double pi)
    {
        this.radius=radius;
        this.pi=pi;
    }

    public void area()
    {
        System.out.println("Area of Circle "+this.radius*this.radius*this.pi);
    }

    static void myshape()
    {
        System.out.println("I am a Circle");
    }

}

