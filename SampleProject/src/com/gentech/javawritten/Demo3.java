package com.gentech.javawritten;
class Emp
{
	String emp1="Santosh";
	String emp2="Anvik";
	static String manager1="Krishna";
	static String manager2="Muruli";
}
class Dept extends Emp
{
	Dept()
	{
		System.out.println("this is dept constructor");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(manager1);
		System.out.println(manager2);
	}	
}
public class Demo3
{
    public static void main(String args[])
	{
		Dept d=new Dept();
		
	}
	
}	


