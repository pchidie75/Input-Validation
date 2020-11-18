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
public class ShapeTestApp {

    /**
     * @param args the command line arguments
     */
    public static boolean equalArea(Shape s1, Shape s2){
        if(s1.getArea() == s2.getArea())
            return true;
        else
            return false;
    }
            
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        
        if(equalArea(c, s))
            System.out.println("Circle c and square s have the same area.");
        else
            System.out.println("Circle c and square s don't have the same area.");
    }
    
}
