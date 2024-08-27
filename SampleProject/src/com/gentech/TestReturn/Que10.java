package com.gentech.TestReturn;
class Fact
{
	int fact(int a)
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f*=i;
		}
		return f;
	}
}
public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact k=new Fact();
		int p=k.fact(5);
		System.out.println(p);

	}

}
