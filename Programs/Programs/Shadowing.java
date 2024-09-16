package Programs;

public class Shadowing {

    static int x = 21; // this variable have global scope inside the class means it can be use anywhere inside the class
//    Shadowing : It is technique of overlapping a variable and overloading with some other value all of this is depending upon scope
    public static void main(String[] args) {
        System.out.println("value of x = "+x);

        int x ; // here we declare a variable x inside the main function at this time variable with higher scope get shadowed due to shadowing means now this variable rules since this block have its scope
        x = 30;

        System.out.println("value of x = "+x); // use x = 30
        fun();
    }

    static void fun()
    {
        System.out.println("value of x = "+x); //use x=21 since x=30 is out of scope here
    }
}
