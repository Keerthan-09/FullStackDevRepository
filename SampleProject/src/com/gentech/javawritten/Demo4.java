package com.gentech.javawritten;
class Matrix
{
	static
	{
	    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[0].length;k++)
			{
				System.out.print(a[k][i]);
			}
			System.out.println();
		}
	}
}

class Transpose extends Matrix
{
}

public class Demo4
{
    public static void main(String args[])
	{
		Transpose t=new Transpose();
	}
	
}	

