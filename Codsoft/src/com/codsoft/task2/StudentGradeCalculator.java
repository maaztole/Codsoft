package com.codsoft.task2;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Predefined subjects
        String[] subjects = {"English", "Hindi", "Marathi", "Maths", "Science", "Social Studies"};
        int numberOfSubjects = subjects.length;
        
        // Initialize variables for total marks and individual subject marks
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        
        // Input marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the marks obtained in " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        
        // Determine grade based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display total marks, average percentage, and grade
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
