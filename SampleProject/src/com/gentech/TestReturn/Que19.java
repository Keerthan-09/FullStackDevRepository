package com.gentech.TestReturn;
class CharArray
{
	static String con(char c[])
	{
		String s="";
		for(int i=0;i<c.length;i++)
		{
			s=s+c[i];
		}
		return s;
	}
}
public class Que19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x=CharArray.con( new char [] {'r','a','d','h','a'});
		System.out.println(x);

	}

}
