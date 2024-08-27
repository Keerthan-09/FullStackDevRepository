package com.gentech.TestReturn;
class Birds
{
	String[] birds()
	{
		String s[]= {"parrot","duck","peigeon"};
		return s;
		
	}
}
public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b=new Birds();
		String p[]=b.birds();
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}

	}

}
