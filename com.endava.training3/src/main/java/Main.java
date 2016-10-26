import examples.ExtendedSimple;
import shape.impl.Circle;
import shape.impl.Square;
import shape.impl.Triangle;

/**
 * Created by lluca on 26-Oct-16.
 */
public class Main {

    public static void main(String[] args) {
       /* System.out.println("Hello OOP\n");

        Circle circ1 = new Circle(2);
        circ1.computeArea();

        Square sq1 = new Square(5);
        sq1.computeArea();
        sq1.computePerimeter();

        Triangle trig = new Triangle(2, 4, 7);
        trig.computePerimeter();

        ExtendedSimple ex = new ExtendedSimple();
        ExtendedSimple ex1 = new ExtendedSimple(2);
        ExtendedSimple ex2 = new ExtendedSimple(3,4);*/

       examples.A a = new examples.B();
        a.f();
        a.f(2);
        a.f(3,4);
        examples.B b = new examples.C();
        b.f();
        b.f(2);
        b.f(3,4);
        examples.A a2 = new examples.C();
        a2.f();
        a2.f(2);
        a2.f(3,4);


    }
}
