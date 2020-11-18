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
public class CheckingAccount extends Account{
    private double monthlyFee;
    
    public double getFee(){
        return this.monthlyFee;
    }
    public void setFee(double fee){
        this.monthlyFee = fee;
    }
    @Override
    public double getFinalBalance(){
        return getBalance() - this.monthlyFee;
    }
}
