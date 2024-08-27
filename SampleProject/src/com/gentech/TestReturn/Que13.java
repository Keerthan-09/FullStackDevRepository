package com.gentech.TestReturn;
class Avg
{
	double avg (int a,int b,int c)
	{
		return ((a+b+c)/3);
	}
}

public class Que13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avg a=new Avg();
		double d=a.avg(3, 4, 5);
		System.out.println(d);
	

	}

}
