package com.gentech.oops;
abstract class Maths
{
	abstract void role();
}
interface Add
{
	abstract void add(int a,int b);
}
interface Sub
{
	abstract void sub(int a,int b);
}
class SimpleMath extends Maths implements Add ,Sub
{

	SimpleMath(int a,int b)
	{
		role();
		add(a,b);
		sub(a,b);
	}
	@Override
	public void sub(int a, int b) {
		System.out.println("result of addition is:"+(a+b));
		
	}

	@Override
	public void add(int a, int b) {
		System.out.println("result of subtraction is:"+(a-b));

		
	}

	@Override
	void role() {
		System.out.println("Mathematics performs major role in our daily life");

		
	}
	
}
public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleMath s=new SimpleMath(10,5);

	}

}
