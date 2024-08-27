//Diagonal elements
package com.gentech.returnassignments;
class ConRet10
{
	short[] method10(short s[][])
	{
		short row1[]=new short[s.length];
		for(int i=0;i<s.length;i++)
		{
			row1[i]=s[i][i];
		}
		return row1;
	}
}
public class AssignReturn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConRet10 o=new ConRet10();
		short x[][]= {{1,1,1},{2,2,2},{3,3,3}};
		short b[]=o.method10(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.print(b[i] +" ");
		}

	}

}
