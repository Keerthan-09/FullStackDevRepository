package com.gentech.javawritten;
class BanyanTree
{
	void method1()
	{
		System.out.println("Instance method1");
	}
	void method2()
	{
		System.out.println("Instance method2");
	}
}

class MangoTree extends BanyanTree
{
	MangoTree()
	{
		System.out.println(" This is a constructor");
		method1();
		method2();
	}
}
public class Demo2
{
    public static void main(String args[])
	{
		MangoTree m=new MangoTree();
	}
	
}

