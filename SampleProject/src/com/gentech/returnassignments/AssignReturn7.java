//First row of elements from 2D array
package com.gentech.returnassignments;
class ConRet7
{
	char[][] method7(char s[][])
	{
		char row1[][]=new char[s.length][s[0].length];
		for (int i=0;i<s[0].length;i++)
		{
			row1[0][i]=s[0][i];
			
		}
	    return row1;	
	}
}

public class AssignReturn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		ConRet7 o=new ConRet7();
		char p[][]=o.method7(c);
		for (int i=0;i<p[0].length;i++)
		{
			System.out.print(p[0][i] +" ");
		}
		

	}

}
