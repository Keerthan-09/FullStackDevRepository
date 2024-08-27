//for a given boolean 1D array print the elements in reverse order
package com.gentech.methodsassignment;
class Con3
{
	void Method3(boolean s[])
	{
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}
}
public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con3 obj=new Con3();
		boolean b[]= {true,false,true,false,true};
		obj.Method3(b);

	}

}
