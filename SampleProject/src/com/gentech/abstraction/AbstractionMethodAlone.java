package com.gentech.abstraction;
abstract class WorldWar
{
	abstract String  date();
}

class Date extends WorldWar
{
	int warno;
	String arr[]= {" July 28, 1914 to November 11, 1918","September 1, 1939 to September 2, 1945"};
	
	Date(int k)
	{
		warno=k;
	}
	
	String  date()
	{
		System.out.print("world war " +warno +" date:");
		if (warno==1)
			return arr[0];
		else
			return arr[1];
	}
	
}
public class AbstractionMethodAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date(1);
		String p=d.date();
		System.out.println(p);

	}

}
