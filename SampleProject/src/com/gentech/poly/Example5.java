package com.gentech.poly;
class Politics
{
	void power()
	{
		System.out.println("Lost trust in politics");
	}
}
class CorrouptPeople extends Politics
{
	void power()
	{
		System.out.println("power in the hands of CorrouptPeople");
		System.out.println("World becomes Kallara sante");
	}
}
class RighteousPerson extends Politics
{
	void power()
	{
		System.out.println("power in the hands of RighteousPerson");
		System.out.println("Chance for development");
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Politics p=new CorrouptPeople();
		p.power();
		
		Politics r=new RighteousPerson();
		r.power();
		
		

	}

}
