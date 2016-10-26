package shape.impl;

import shape.Shape2D;

import static java.lang.Math.pow;

/**
 * Created by lluca on 26-Oct-16.
 */
public class Triangle implements Shape2D {
    private int sideLengthA;
    private int sideLengthb;
    private int sideLengthc;

    public Triangle(int sideLengthA, int sideLengthb, int sideLengthc) {
        this.sideLengthA = sideLengthA;
        this.sideLengthb = sideLengthb;
        this.sideLengthc = sideLengthc;
    }

    public void computeArea() {

    }

    public void computePerimeter() {
        System.out.println("Perimetrul triunghiului cu laturile: " + this.sideLengthA + ", " + this.sideLengthb + ", " + this.sideLengthc + " este: " + (this.sideLengthA + this.sideLengthb + this.sideLengthc));
    }
}
