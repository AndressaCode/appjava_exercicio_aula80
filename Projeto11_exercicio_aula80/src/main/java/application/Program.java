/*
 * Enter account number: 8532
 * Enter account holder: Alex Green
 * Is there initial deposit? (y/n):  y
 * Enter initial deposit value: 500.00

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
        
       sc.nextLine();
        
        System.out.print("Enter account holder: ");
        String accountName = sc.nextLine();
        
        System.out.print("Is there an initial deposit? (y/n): ");
        char answer = sc.next().charAt(0);
        
        Account account = new Account(accountNumber, accountName);
        
        if(answer == 'y' || answer == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();
            account.depositValue(value);
            System.out.printf("%nAccount data: %n" + account);
        } else {
            System.out.printf("%nAccount data: %n" + account);
        }
        
        System.out.printf("%n%n");
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.depositValue(value);
        System.out.printf("Updated account data: %n" + account);
        
        System.out.printf("%n%n");
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.printf("Updated account data: %n" + account);
    }
}