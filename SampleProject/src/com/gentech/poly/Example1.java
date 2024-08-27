package com.gentech.poly;
abstract class Files
{
	abstract void type();
}
class Javafile extends Files
{
	void type()
	{
		System.out.println("for java extension is .java");
	}
}
class HTMLfile extends Files
{
	void type()
	{
		System.out.println("for html extension is .html");
	}
}
class Pythonfile extends Files
{
	void type()
	{
		System.out.println("for python extension is .py");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Files f=new Javafile();
		f.type();
		Files k=new HTMLfile();
		k.type();
		Files s=new Pythonfile();
		s.type();

	}

}
