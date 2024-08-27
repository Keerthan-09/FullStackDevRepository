package com.gentech.TestReturn;
class Concat
{
	String concat(String s[])
	{
		String p="";
		for(int i=0;i<s.length/2;i++)
		{
			p+=s[i];
		}
		return p;
	}
}

public class Que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String z[]= {"radha","krishna","krishna","radha"};
		Concat c=new Concat();
		String v=c.concat(z);
		System.out.println(v);

	}

}
