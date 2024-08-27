package com.gentech.javawritten;
class Country
{
	Country()
	{
		state();
		capital();
	}
	void state()
	{
		System.out.println("I am from Karnataka");
	}
    static void capital()
	{
		System.out.println("capital of Karnataka is Bangalore");
	}
}	
public class Demo10
{
    public static void main(String args[])
	{
		Country c=new Country();
	}
	
}

