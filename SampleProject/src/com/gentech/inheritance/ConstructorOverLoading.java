package com.gentech.inheritance;
class Person1 {
 String name;
 int age;

     Person1() {
     this.name = "Unknown";
     this.age = 0;
     
 }

     Person1(String name, int age) {
     this.name = name;
     this.age = age;
     
 }

 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age);
 }
}

class Student1 extends Person1 {
 String studentID;


     Student1() {
     super();
     this.studentID = "Unknown";
     
 }

 
     Student1(String name, int age, String studentID) {
     super(name, age);
     this.studentID = studentID;
     
 }

     void displayStudentInfo() {
     displayInfo();
     System.out.println("Student ID: " + studentID);
 }
}


class GraduateStudent1 extends Student1 {
 String thesisTopic;

 
     GraduateStudent1() {
     super();
     this.thesisTopic = "Unknown";
     
 }

 
     GraduateStudent1(String name, int age, String studentID, String thesisTopic) {
     super(name, age, studentID);
     this.thesisTopic = thesisTopic;
     
 }

     void displayGraduateStudentInfo() {
     displayStudentInfo();
     System.out.println("Thesis Topic: " + thesisTopic);
 }
}

public class ConstructorOverLoading {
 public static void main(String[] args) {
     
     GraduateStudent1 graduateStudentDefault = new GraduateStudent1();
     graduateStudentDefault.displayGraduateStudentInfo();
     graduateStudentDefault.displayStudentInfo();
     graduateStudentDefault.displayGraduateStudentInfo();
     System.out.println();
     System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
     GraduateStudent1 graduateStudentParam = new GraduateStudent1("Keerthi", 21, "4PS20EC052", "ECE");
     graduateStudentParam.displayInfo();
     graduateStudentParam.displayStudentInfo();
     graduateStudentParam.displayGraduateStudentInfo();

     
 }
}

