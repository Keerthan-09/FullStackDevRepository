package com.gentech.oops;
abstract class Greet
{
	{
		System.out.println("this is a instance block");
	}
	static {
		System.out.println("this is a static block");
		
	}
}
class Hi extends Greet
{
	
}
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi h=new Hi();

	}

}
