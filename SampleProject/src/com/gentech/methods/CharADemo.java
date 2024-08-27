package com.gentech.methods;

class Array1
{
	void array(char s[][])
	{
		String con=" ";
		
		for (int i=1;i<2;i++)
		{
			for (int j=0;j<s[i].length;j++)
			{
				con=con+s[i][j];
			}
			
		}
		System.out.println(con);
		
	}
}



public class CharADemo {
	public static void main(String[] args) {
	char s[][]= {{'k','r','i','s','h','n','a'},{'d','e'}};
	Array1 o=new Array1();
    o.array(s);

}
}
