package shape.impl;

import shape.Shape2D;

import static java.lang.Math.pow;

/**
 * Created by lluca on 26-Oct-16.
 */
public class Circle implements Shape2D {
    private static final double radius = 3.14159;
    private float unit;

    public static double getRadius() {
        return radius;
    }

    public float getUnit() {
        return unit;
    }

    public void setUnit(float unit) {
        this.unit = unit;
    }

    public Circle(float unit) {
        this.unit = unit;
    }

    public void computeArea() {
        System.out.println("Aria cercului cu raza = " + this.unit + " este: " + (pow(this.unit, 2)) * this.radius);
    }

    public void computePerimeter() {

    }


}
