//complete mul table
package com.gentech.returnassignments;
class ConRet9
{
	int method9(int a,int b)
	{
		return a*b;
	}
}
public class AssignReturn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConRet9 o=new ConRet9();
		int b=7;
		int s;
		for(int i=1;i<11;i++)
		{
			s=o.method9(i, b);
			System.out.println(b +"*" +i +"=" +s);
		
		}

	}

}
