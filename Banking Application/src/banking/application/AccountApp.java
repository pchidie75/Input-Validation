/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.application;
import java.util.Scanner;
/**
 *
 * @author Chidie17
 */
public class AccountApp{
    Scanner sc = new Scanner(System.in);
    CheckingAccount checkingAc = new CheckingAccount();
    SavingsAccount savingsAc = new SavingsAccount();
    
    public void setInfo(){
        checkingAc.setBalance(1000.00);
        checkingAc.setFee(4.5);
        savingsAc.setBalance(1000.00);
        savingsAc.setInterestRate(.01);
    }
    public void startingInfo(){
        System.out.println("Starting Balances");
        System.out.println("Checkings: $" + checkingAc.getBalance());
        System.out.println("Savings: $" + savingsAc.getBalance());
    }
    public void getInfo(){
        System.out.println("Enter the transactions for the month\n");
    
        System.out.println("Amount withdrew from the checking account: ");
        checkingAc.setBalance(checkingAc.getBalance() - sc.nextDouble());

        System.out.println("\nAmount deposited to the savings account: ");
        savingsAc.setBalance(savingsAc.getBalance() + sc.nextDouble());
        
        System.out.println("\nMonthly payments and Fees");
        System.out.println("Checking fee:\t\t\t$" + checkingAc.getFee());
        System.out.println("Savings interest payment:\t$" + savingsAc.getInterestRate());
    }
    public void finalInfo(){
        System.out.println("Final Balance");
        System.out.println("Checkings: $" + checkingAc.getFinalBalance());
        System.out.println("Savings: $" + savingsAc.getFinalBalance());
    }
}
