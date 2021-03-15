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
public abstract class Shape {
    protected String name;
    String toString;
    public abstract double area();
    
    public Shape (String eName){
        this.name = eName;
    }
    
    @Override
    public String toString(){
        return "\nShape Name: "+name;
    }
}
