//result of 7th table in reverse order
package com.gentech.returnassignments;
class ConRet8
{
	int method8(int a,int b)
	{
		return a*b;
	}
}

public class AssignReturn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConRet8 o=new ConRet8();
		int b=7;
		int s;
		for(int i=10;i>=1;i--)
		{
			s=o.method8(i, b);
			System.out.println(s);
		
		}
		

	}

}
