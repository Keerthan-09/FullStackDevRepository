//no of digits in a given no
package com.gentech.methodsassignment;
class Con7
{
	void Method7(int a)
		{
		 String str = Integer.toString(a);
		 int k=str.length();
		 System.out.println(k);
		}
	
}
public class Assign7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con7 obj=new Con7();
	     
	     obj.Method7(9000000);

	}

}
