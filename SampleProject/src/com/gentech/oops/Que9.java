package com.gentech.oops;
abstract class Knife
{
	abstract void cutting();
}
class Fruits extends Knife
{

	@Override
	void cutting() {
		System.out.println("Knife can be used to cut the fruits");
		
	}
	
}
class People extends Knife
{

	@Override
	void cutting() {
		System.out.println("Knife can be used to Kill the People");
		
	}
	
}
public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knife k=new Fruits();
		k.cutting();
		Knife p=new People();
		p.cutting();
		

	}

}
