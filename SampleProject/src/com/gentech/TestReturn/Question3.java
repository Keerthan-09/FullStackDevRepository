package com.gentech.TestReturn;
class Area
{
	static double area(double r)
	{
		return (r*r*3.14);
	}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=Area.area(4);
		System.out.println(a);

	}

}
