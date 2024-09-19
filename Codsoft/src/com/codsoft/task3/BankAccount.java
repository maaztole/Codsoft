package com.codsoft.task3;

public class BankAccount {
     private double balance;

 // Constructor to initialize account with a starting balance
 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Method to deposit money into the account
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Successfully deposited: $" + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Method to withdraw money from the account
 public void withdraw(double amount) {
     if (amount > 0) {
         if (amount <= balance) {
             balance -= amount;
             System.out.println("Successfully withdrew: $" + amount);
         } else {
             System.out.println("Insufficient balance. You only have: $" + balance);
         }
     } else {
         System.out.println("Withdrawal amount must be positive.");
     }
 }

 // Method to check the account balance
 public double checkBalance() {
     return balance;
 }
}
