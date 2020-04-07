/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author andressa-est
 */
public class Account {
   
    private int accountNumber;
    private String accountName;
    private double amount;
    
    
    public Account(){
    }
    
    public Account(int accountNumber, String accountName){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public String getAccountName(){
        return accountName;
    }
    
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public void depositValue(double value){
        this.amount += value;
    }
    
    public void withdraw(double value){
        this.amount += value + 5;
    }
    
    public String toString(){
        return "Account "  
                + accountNumber 
                + ", Holder: " 
                + accountName
                + ", Balance: $ "
                + String.format("%.2f", amount);
    }
}