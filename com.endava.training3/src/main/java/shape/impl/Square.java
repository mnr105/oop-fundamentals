package shape.impl;

import shape.Shape2D;

import static java.lang.Math.pow;

/**
 * Created by lluca on 26-Oct-16.
 */
public class Square implements Shape2D {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public void computeArea() {
        System.out.println("Aria patratului cu latura = " + this.sideLength + "  este: " + pow(this.sideLength, 2));

    }

    public void computePerimeter() {
        System.out.println("Perimetrul patratului cu latura = " + this.sideLength + "  este: " + (4 * this.sideLength));
    }
}
