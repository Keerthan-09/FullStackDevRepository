//sum of digits in a number
package com.gentech.methodsassignment;
class Con8
{
	void Method8(int a)
		{
		 String str = Integer.toString(a);
		 int sum=0;
		 for(int j=0;j<str.length();j++)
		 {
			char p=str.charAt(j);
			String s=Character.toString(p);
			 sum=sum+Integer.parseInt(s);
		 }
		 System.out.println(sum);
		}

	
}

public class Assign8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con8 obj=new Con8();
	     
	     obj.Method8(412340);

	}

}
