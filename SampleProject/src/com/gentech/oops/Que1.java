package com.gentech.oops;
interface Noon
{
	abstract void noon();
}
interface Morning
{
	abstract void morning();
}
interface Evening
{
	abstract void evening();
}
class Greetings implements Noon,Morning,Evening
{
	
	Greetings(String s)
	{
		
		if (s.contentEquals("noon")) noon();
		if (s.contentEquals("morning")) morning();
		if (s.contentEquals("evening")) evening();
	}
	public void morning()
	{
		System.out.println("Good Morning");
	}
	public void noon()
	{
		System.out.println("Good Afternoon");
	}
	
	@Override
	public void evening() {System.out.println("Good evening");
		
	}
}


public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings mor=new Greetings("morning");
		Greetings noo=new Greetings("Noon");
		Greetings eve=new Greetings("evening");
		

	}

}
