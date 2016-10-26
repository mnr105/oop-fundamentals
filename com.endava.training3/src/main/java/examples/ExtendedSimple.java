package examples;

/**
 * Created by lluca on 26-Oct-16.
 */
public class ExtendedSimple extends Simple {
    int extI;


    public ExtendedSimple() {
        System.out.println("Hello from constructor with 0 args");

    }

    public ExtendedSimple(int extI) {
        System.out.println("Hello from constructor with 1 args");
    }

    public ExtendedSimple(int i, int extI) {
        super(i);
        System.out.println("Hello from constructor with 2 args");
    }
}
