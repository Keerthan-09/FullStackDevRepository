package com.gentech.methods;
class Sum
{
	void sum(int num)
	{
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum Result is:"+sum);
	}
}

public class SumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum su=new Sum();
		su.sum(3);

	}

}
