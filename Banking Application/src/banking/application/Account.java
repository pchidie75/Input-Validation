/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.application;

/**
 *
 * @author Chidie17
 */
public abstract class Account {
    private double balance;
    
    public Account(){
        balance = 0;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void deposit(double amount){
        balance =+ amount;
    }
    
    public void withdraw(double amount){
        balance -= amount;
    }
    
    public abstract double getFinalBalance();
}
