package com.gentech.practice;
class Demo1
{
	int num;
	Demo1(int a)
	{
		this.num=a;
	}
	
	void method()
	{
		if(num<=30)
		{
			System.out.println(num);
			num++;
			method();
				
		}
	}
}

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 o=new Demo1(10);
		o.method();
		

	}

}
