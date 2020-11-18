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
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccountApp acc = new AccountApp();
        System.out.println("Welcome to the Account application\n");
        acc.setInfo();
        acc.startingInfo();
        acc.getInfo();
        acc.finalInfo();
    }
    
}
