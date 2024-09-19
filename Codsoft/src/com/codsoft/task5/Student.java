package com.codsoft.task5;

import java.io.Serializable;

//Class to represent individual students
public class Student implements Serializable {
 private String name;
 private String rollNumber;
 private String grade;

 // Constructor
 public Student(String name, String rollNumber, String grade) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.grade = grade;
 }

 // Getters and Setters
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getRollNumber() {
     return rollNumber;
 }

 public void setRollNumber(String rollNumber) {
     this.rollNumber = rollNumber;
 }

 public String getGrade() {
     return grade;
 }

 public void setGrade(String grade) {
     this.grade = grade;
 }

 // Override toString() to display student details
 @Override
 public String toString() {
     return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
 }
}
