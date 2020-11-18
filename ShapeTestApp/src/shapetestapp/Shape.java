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
abstract public class Shape {
    private String color;
    
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    abstract public double getArea();
}
