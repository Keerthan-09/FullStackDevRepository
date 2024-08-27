package com.gentech.selflearning;

class Animal {
	String name;
	String type;
	Animal(String n,String t)
	{
		name=n;
		type=t;
		display();
		
	}
	void display()
	{
		System.out.println(name);
		System.out.println(type);
	}
}

class Dog extends Animal {
	String food;
	Dog(String n,String t,String f)
	{
		super(n,t);
		food=f;
		
	}
	void display()
	{
		System.out.println("++++++++++++++++");
		super.display();
		
		
	}

}

class BullDog extends Dog {
	String petname;
	String gender;
	BullDog(String n,String t,String f,String p,String g)
	{
		super(n,t,f);
		petname=p;
		gender=g;
		
	}
	void display()
	{
		System.out.println("Ananymous");
		System.out.println(petname);
		System.out.println(gender);
		System.out.println("Tedious");
	}
}

public class InheritPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BullDog dog=new BullDog("Dog","Domestic","Pedigaree","Rooby","male");
		//System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//dog.display();
		

	}

}
