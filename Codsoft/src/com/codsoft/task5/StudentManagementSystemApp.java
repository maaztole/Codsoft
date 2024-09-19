package com.codsoft.task5;

import java.util.Scanner;

//Main class for the Student Management System
public class StudentManagementSystemApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     StudentManagementSystem system = new StudentManagementSystem();

     boolean exit = false;
     while (!exit) {
         // Display menu
         System.out.println("\nStudent Management System Menu:");
         System.out.println("1. Add Student");
         System.out.println("2. Remove Student");
         System.out.println("3. Search Student");
         System.out.println("4. Display All Students");
         System.out.println("5. Exit");
         System.out.print("Choose an option: ");
         int option = scanner.nextInt();
         scanner.nextLine(); // consume newline

         switch (option) {
             case 1:
                 // Add student
                 System.out.print("Enter student name: ");
                 String name = scanner.nextLine();
                 System.out.print("Enter roll number: ");
                 String rollNumber = scanner.nextLine();
                 System.out.print("Enter grade: ");
                 String grade = scanner.nextLine();
                 
                 if (validateInput(name, rollNumber, grade)) {
                     Student student = new Student(name, rollNumber, grade);
                     system.addStudent(student);
                 }
                 break;

             case 2:
                 // Remove student
                 System.out.print("Enter roll number of the student to remove: ");
                 String rollToRemove = scanner.nextLine();
                 system.removeStudent(rollToRemove);
                 break;

             case 3:
                 // Search student
                 System.out.print("Enter roll number of the student to search: ");
                 String rollToSearch = scanner.nextLine();
                 Student foundStudent = system.searchStudent(rollToSearch);
                 if (foundStudent != null) {
                     System.out.println("Student found: " + foundStudent);
                 } else {
                     System.out.println("Student not found.");
                 }
                 break;

             case 4:
                 // Display all students
                 system.displayAllStudents();
                 break;

             case 5:
                 // Exit the program
                 System.out.println("Exiting the system.");
                 exit = true;
                 break;

             default:
                 System.out.println("Invalid option. Please choose again.");
         }
     }
     scanner.close();
 }

 // Method to validate student input
 private static boolean validateInput(String name, String rollNumber, String grade) {
     if (name.isEmpty() || rollNumber.isEmpty() || grade.isEmpty()) {
         System.out.println("Error: All fields are required.");
         return false;
     }
     return true;
 }
}
