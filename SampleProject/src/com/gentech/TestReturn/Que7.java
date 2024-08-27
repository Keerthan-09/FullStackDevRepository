package com.gentech.TestReturn;
class Table
{
	int sum()
	{
		int s=0;
		for(int i=1;i<=10;i++)
		{
			s=s+2*i;
		}
		return s;
	}
}

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		int p=t.sum();
		System.out.println(p);

	}

}
