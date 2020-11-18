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
public class Square extends Shape {
    private double side;
    
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        side = this.side;
    }
    @Override
    public double getArea(){
        return side * 2;
    }
}
