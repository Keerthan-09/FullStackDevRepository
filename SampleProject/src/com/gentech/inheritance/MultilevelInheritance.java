package com.gentech.inheritance;


class Person {
	void info(String name, int age) {
		System.out.println("person name: " + name);
		System.out.println("person age: " + age);
	}

}


class Student extends Person {
	void stuinfo(int id, String branch) {
		System.out.println("student id: " + id);
		System.out.println("student bach: " + branch);

	}

}


class GraduateStudent extends Student {
	void proinfo(String project, int score) {
		System.out.println("under taken project: " + project);
		System.out.println("Score of project: " + score);

	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraduateStudent g = new GraduateStudent();
		g.info("krishna", 21);
		System.out.println("---------------------");

		g.stuinfo(52, "ECE");
		System.out.println("---------------------");

		g.proinfo("Autoretarder", 89);
		System.out.println("---------------------");

	}

}
