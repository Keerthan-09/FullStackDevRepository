package com.gentech.javawritten;
class StaticDemo1
{
	static
	{
		
	    System.out.println("Static block of Demo1");
	}
}
class StaticDemo2 extends StaticDemo1
{
	
	static 
	{
		
		System.out.println("static block of Demo2");
	}
}

public class Demo6
{
   public static void main(String args[])
	{
		StaticDemo2 s=new StaticDemo2();
	}
	
}

