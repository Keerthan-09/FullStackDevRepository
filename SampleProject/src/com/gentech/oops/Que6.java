package com.gentech.oops;
interface Add2
{
	abstract void add2(int a, int b);
}
interface Add3 extends Add2
{
	abstract void add3(int a,int b,int c);
}
interface Add4  extends Add3
{
	abstract void add4(int a,int b,int c,int d);

}
class Addition implements Add4
{

	Addition(int a,int b,int c,int d){
		add2(a,b);
		add3(a,b,c);
		add4(a,b,c,d);	
		
	}
	@Override
	
	public void add2(int a, int b) {
		System.out.println("Result of addition of "+a+"," +b +"=" +(a+b));
		
	}

	@Override
	public void add4(int a, int b, int c, int d) {
		System.out.println("Result of addition of "+a+"," +b +","+c +"," +d +"=" +(a+b+c+d));
		
	}
	public void add3(int a,int b,int c)
	{
		System.out.println("Result of addition of "+a+"," +b+"," +c  +"=" +(a+b+c));
	}
	
}
public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition(1,2,3,4);

	}

}
