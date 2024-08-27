package com.gentech.inheritance;

class Employee {
	int Eid;
	String Ename;

	Employee(int id, String name) {
		Eid = id;
		Ename = name;
	}

	void display() {
		System.out.println("Employee id:" + Eid);
		System.out.println("Employee name: "+Ename);
	}
}

class Manager extends Employee {
	int mid;

	Manager(int id, String name, String dep, int managerid) {
		super(id, name);
		mid = managerid;

	}

	void displayrole() {
		System.out.println("Manager id: "+mid);
	}

}

class Engineer extends Employee {
	String Etype;

	Engineer(int id1, String na, String type) {
		super(id1, na);
		Etype = type;

	}

	void displaytype() {
		System.out.println("Type of Engineer :"+Etype);
	}

}

class TechLead extends Engineer {

	String tech;

	TechLead(int id1, String na, String type, String technology) {
		super(id1, na, type);
		tech = technology;
		// TODO Auto-generated constructor stub
	}

	void displaytech() {
		System.out.println("Tech lead in: "+tech);
	}

}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager(28, "krishna", "Design", 5);
		m.display();
		m.displayrole();
		System.out.println("-----------------------------------");
		TechLead t = new TechLead(20, "Mohan", "designer", "java");
		t.display();
		t.displaytype();
		t.displaytech();
		System.out.println("-----------------------------------");

	}

}
