package Programs.Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        Car c1 = new Car("BMW",30);
        Scooter s1 = new Scooter("Activa",20);

        System.out.println("Car Name : "+c1.name+" Car Avg : "+c1.avg+" Car Wheels : "+c1.wheel);
        System.out.println("Scooter Name : "+s1.name+" Scooter Avg : "+s1.avg+" Scooter Wheels : "+s1.wheel);
    }
}

class Vehical
{
    String name;
    int avg;

    Vehical(String name,int avg)
    {
        this.name= name;
        this.avg = avg;
    }
}

class Car extends Vehical
{
    int wheel;
    Car(String name,int avg)
    {
        super(name,avg);
        this.wheel=4;
    }
}

class Scooter extends Vehical
{
    int wheel;
    Scooter(String name,int avg)
    {
        super(name,avg);
        this.wheel=2;
    }

}