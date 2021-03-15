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
public class Cylinder extends Shape{
    private double radius;
    private double height;
    
    public Cylinder(double rad,double h){
        super("Cylinder");
        radius = rad;
        height = h;
    }
    
    @Override
    public double area(){
        return Math.PI * (radius * radius) * height;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "of radius " +radius + " and of height "+height;
    }
}