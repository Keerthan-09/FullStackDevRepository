package com.gentech.outerinnerclass;
class Shape
{
	int sides;
	int ang;
	Square squ=new Square();
	Triangle tri=new Triangle();
	
	Shape(int a,int b)
	{
		
		sides=a;
		ang=b;
		System.out.println(ang);
		System.out.println(sides);
		
		
	}
	void showInnerClassEtails()
	{
		tri.angle();
	    squ.area();
	}
	
	private class Triangle
	{
		void angle()
		{
			System.out.println(ang);
		}
	}
	private class Square
	{
		void area()
		{
			System.out.println(sides*sides);
		}
	}
	
}

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape(4,90);
		shape.showInnerClassEtails();

	}

}
