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
public class SavingsAccount extends Account{
    private double monthlyInterestRate;
    
    public double getInterestRate(){
        return this.monthlyInterestRate;
    }
    public void setInterestRate(double fee){
        this.monthlyInterestRate = fee;
    }
    @Override
    public double getFinalBalance(){
        return getBalance() + this.monthlyInterestRate;
    }
}
