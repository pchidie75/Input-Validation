package tempconversion;

import java.util.Scanner;

public class TempConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Enter a fahrenheit temperature: ");
            double fah = sc.nextDouble();
        
            double cels;
            cels = (5.0/9.0)*(fah-32.0);
        
            System.out.println("The temperature in celsius is " + cels);
            
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
