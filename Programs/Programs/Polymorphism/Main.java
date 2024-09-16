package Programs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shp1 = new Shape();
        Square sq1 = new Square(10);
        Circle cr1 = new Circle(10,3.14);

        shp1.area();
        sq1.area();
        cr1.area();

        Shape.myshape();
        Square.myshape();
        Circle.myshape();
    }
}
