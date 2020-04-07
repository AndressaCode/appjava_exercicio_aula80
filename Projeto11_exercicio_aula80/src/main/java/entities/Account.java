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
    
    private int number;
    private String name;
    private double saldo;
    
    public Account(){
    }
    
    public Account(int number, String name){
    
        this.number = number;
        this.name = name;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double depositAmount(double value){
        return saldo += value;
    }
   
}
