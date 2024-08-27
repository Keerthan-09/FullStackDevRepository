package com.gentech.poly;
abstract class Law
{
	abstract void ethics();
}
class InCourtRoom extends Law
{
	void ethics()
	{
		System.out.println("Majority people:");
		System.out.println("Behave like sathya harishchandra");
	}

}
class OutsideCourtRoom extends Law
{
	void ethics()
	{
		System.out.println("In Majority Situation:");
		System.out.println("Actually a shakuni");
	}
	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Law l=new InCourtRoom();
		l.ethics();
		
		Law k=new OutsideCourtRoom();
		k.ethics();

	}

}
