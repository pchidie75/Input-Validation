/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapetestapp;

/**
 *
 * @author Chidie17
 */
public class Circle extends Shape {
    private double radius;
    
    public double getSide(){
        return this.radius;
    }
    public void setSide(double radius){
        radius = this.radius;
    }
    @Override
    public double getArea(){
        return (3.14 * this.radius)*(3.14 * this.radius);
    }
}
