package com.gentech.inheritance;

class Branch1 {
	void displayAddress() {
		System.out.println("Address of branch 1 : white field");
	}

	void Employeecount(int count) {
		System.out.println("Count of employee in branch 1 :" + count);
	}
}

class Branch2 extends Branch1 {
	Branch2(int a, int b) {
		super.Employeecount(a);
		super.displayAddress();
	}

	void displayAddress() {
		System.out.println("Address of branch 2 : majestic");
	}

	void Employeecount(int count1) {
		System.out.println("Count of employee in branch 2 :" + count1);

	}
}

class Branch3 extends Branch2 {
	Branch3(int a, int b) {
		super(a, b);
		super.displayAddress();
		super.Employeecount(b);
	}

	void displayAddress() {
		System.out.println("Address of branch 3 : vijaynagar");
	}

	void Employeecount(int count2) {
		System.out.println("Count of employee in branch 3 :" + count2);
	}

}

public class InheritanceWithSameMethod {
	public static void main(String[] args) {
		Branch3 ob = new Branch3(1, 2);
		ob.displayAddress();
		ob.Employeecount(15);

	}
}
