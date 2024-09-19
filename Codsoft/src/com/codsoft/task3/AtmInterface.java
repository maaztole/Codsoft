package com.codsoft.task3;

public class AtmInterface {
 public static void main(String[] args) {
     // Create a bank account with an initial balance
     BankAccount userAccount = new BankAccount(500.00); // Initial balance of $500

     // Create an ATM and link it to the user's bank account
     Atm atm = new Atm(userAccount);

     // Display the ATM menu
     atm.displayMenu();
 }
}
