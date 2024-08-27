//cube of each element in 1D array
package com.gentech.methodsassignment;
class Con10
{
	void Method10(int k[])
	{
		for(int i=0;i<k.length;i++)
		{
			System.out.println("cube of" +k[i] +"is :" +(k[i]*k[i]*k[i]));
			
		}
		
	}
}
public class Assign10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l[]= {5,4,23,8,9,34};
	     Con10 obj=new Con10();
	     obj.Method10(l);

	}

}
