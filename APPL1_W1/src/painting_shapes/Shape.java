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
abstract class Shape {
    private String shapeName;

    public abstract double area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return this.shapeName;
    }
}