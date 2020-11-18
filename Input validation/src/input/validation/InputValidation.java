/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input.validation;
import java.util.*;

/**
 *
 * @author Chidie17
 */
public class InputValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double number1 = 0;
        
        while (number1 == 0){
            try{
            System.out.println("Hey enter a number: ");
            double number2 = sc.nextDouble();
            System.out.println("Thank you! Goodbye!");
            number1++;
        }
            catch(Exception e){
                sc.next();
                System.out.println("That's not the correct input! Please enter a number");
                continue;
            }
        }
        
    }
    
}
