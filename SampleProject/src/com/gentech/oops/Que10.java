package com.gentech.oops;
class Sports
{
	void display()
	{
		System.out.println("sports will help us to be healthy");
	}
}
class Kabbaddi extends Sports
{
	Kabbaddi()
	{
		super.display();
		display();
	}
	@Override
	void display()
	{
		System.out.println("Kabbaddi is my favourite sports");
	}
}
public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kabbaddi k= new Kabbaddi();
		

	}

}
