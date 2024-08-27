package com.gentech.poly;
abstract class Sign
{
	abstract void fun();
}
class ForInteger extends Sign
{
	int a=10, b=9;
	void fun()
	{
		System.out.println(a+b);
	}
}
class ForString extends Sign
{
	String a="Radha....", b="Krishna......";
	void fun()
	{
		System.out.println(a+b);
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sign s=new ForInteger();
		s.fun();
		System.out.println("+++++++++++++++++++++++++");
		
		Sign p=new ForString();
		p.fun();
		System.out.println("+++++++++++++++++++++++++");

	}

}
