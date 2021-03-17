/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painting_shapes;

/**
 *
 * @author giust
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super("Rectangle");

        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + this.length + " and width " + this.width;
    }
}