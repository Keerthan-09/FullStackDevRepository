package com.gentech.oops;

class Company {

	String name = "Wipro";
	String location = "Bangalore";

	void show() {
		Departments d = new Departments();
		System.out.println("name :" + name);
		System.out.println("location:" + location);
		d.display();

	}

	class Departments {
		String name = "Q&A";

		void display() {
			System.out.println(" Department name:" + name);
		}
	}

}

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		c.show();

	}

}
