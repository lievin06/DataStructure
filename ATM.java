package com.mycompany.atm;
import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
        
       int balance = 1350, withdraw, deposit;
       boolean b = true;
       
       while(b){
            
       
        System.out.println("Welcome User!\n");
         System.out.println("1.Balance");
         System.out.println("2.Deposit");
         System.out.println("3.Withdraw");
         System.out.println("4.Exit\n");
         
         Scanner scanner = new Scanner(System.in);
      System.out.println("Choose Option:");
      int option = scanner.nextInt();      
      
      
              
    
    
        
      if (option <= 1) {
          System.out.println("You have selected Balance\nYour Balance is: "+ balance);
         
       } else if (option <= 2){
          System.out.println("You have selected Deposit");
          System.out.println("Enter the money you will deposit:\n");
          deposit = scanner.nextInt();
          int a = 1350 + deposit;
          System.out.println("Your Money has been successfully deposited");
          System.out.println("Your total money is now: " +a);
          
      } else if (option <= 3){
          System.out.println("You have selected Withdraw\n");
          System.out.println("Enter the money you will withdraw:\n");
          withdraw = scanner.nextInt();
          int a = 1350 + withdraw;
          
      }   else if (option <= 4){
          System.out.println("You have Exited");
          b = false;
          
      } else {
              System.out.println("Invalid");
              
      }
         
       }
         
        
       
        
        
    }
}
