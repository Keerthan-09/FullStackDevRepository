package com.gentech.methods;
class Div
{
	void divisible()
	{
		int count=0;
	    for(int i=50;i<=150;i++)
	    {
		
		    if(i%6==0) 
		    {
			   count=count+1;
		    }
	     }
	System.out.println(count);
	}
}

public class DivDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div o=new Div();
		o.divisible();
		

	}

}
