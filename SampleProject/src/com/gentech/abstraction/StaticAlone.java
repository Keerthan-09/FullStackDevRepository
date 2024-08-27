package com.gentech.abstraction;
abstract class Athlets
{
	
	static {
		System.out.println("we are proud to say we of them:");
		System.out.println("Mary Kom - Boxing");
		System.out.println("Neeraj Chopra - Javelin Throw");
		System.out.println("Abhinav Bindra - Shooting");
		System.out.println("Sakshi Malik - Wrestling");
	}
}
class ProudFeeling extends Athlets
{
	ProudFeeling()
	{
		System.out.println("Their contribution to our country is unforgettenable");
	}
}

public class StaticAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProudFeeling p=new ProudFeeling();
		
	}

}
