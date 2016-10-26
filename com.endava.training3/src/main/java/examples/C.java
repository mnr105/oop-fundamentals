package examples;

/**
 * Created by lluca on 26-Oct-16.
 */
public class C extends B {
    @Override
    public void f(){
        System.out.println("Hello from B");
    }

    public void f(int ceva){
        System.out.println("Hello from C-1 arg");
    }

    public void f(int ceva, int altcv){
        System.out.println("Hello from C-2 arg");

    }

}
