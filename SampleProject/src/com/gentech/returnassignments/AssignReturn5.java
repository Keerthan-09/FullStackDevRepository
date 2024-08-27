//Factorialof a given number
package com.gentech.returnassignments;
class ConRet5
{
	int return5(int a)
	{
		int fact=1;
		for (int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		
		return fact;
}
	
}
public class AssignReturn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConRet5 o=new ConRet5();
		int p=o.return5(5);
		System.out.println("factorial of the given number is:" +p);
		

	}

}
