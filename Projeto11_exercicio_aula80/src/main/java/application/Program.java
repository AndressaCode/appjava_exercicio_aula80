/*
 * Enter account number: 8532
 * Enter account holder: Alex Green
 * Is there initial deposit? (y/n):  y
 * Enter initial deposito value: 500.00

 * Account data:
 * Account 8532, Holder: Alex Green, Balance: $ 500.00

 * Enter a deposit value: 200.00
 * Updated account data: 
 * Account 8532, Holder: Alex Green, Balance: $ 700.00

 * Enter a withdraw value: 300.00
 * Updated account date:
 * Account 8532, Holder: Alex Grenn, Balance: 395.00
 */
package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andressa-est
 */
public class Program {
    
    public static void main(String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        
        Account account = new Account(accountNumber, name);
        
        System.out.println("Is there initial deposit? (Y/N)");
        char answer = sc.next().charAt(0);
        
        if((answer == 'Y') || (answer == 'y')){
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            account.depositAmount(deposit);
        }
        
        sc.close();
        
        System.out.println("Account data: " + account);
    }
    
    
    
    
}