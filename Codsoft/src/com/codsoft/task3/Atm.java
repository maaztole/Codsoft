package com.codsoft.task3;

import java.util.Scanner;

public class Atm {
 private BankAccount bankAccount;

 // Constructor to link ATM with a BankAccount
 public Atm(BankAccount account) {
     this.bankAccount = account;
 }

 // Method to display the ATM interface menu
 public void displayMenu() {
     Scanner scanner = new Scanner(System.in);
     boolean continueUsingATM = true;

     while (continueUsingATM) {
         System.out.println("\n--- ATM Menu ---");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit");
         System.out.print("Choose an option: ");
         
         int option = scanner.nextInt();
         switch (option) {
             case 1:
                 System.out.print("Enter the amount to deposit: $");
                 double depositAmount = scanner.nextDouble();
                 bankAccount.deposit(depositAmount);
                 break;
             case 2:
                 System.out.print("Enter the amount to withdraw: $");
                 double withdrawAmount = scanner.nextDouble();
                 bankAccount.withdraw(withdrawAmount);
                 break;
             case 3:
                 System.out.println("Your current balance is: $" + bankAccount.checkBalance());
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM. Goodbye!");
                 continueUsingATM = false;
                 break;
             default:
                 System.out.println("Invalid option. Please try again.");
         }
     }

     scanner.close();
 }
}
