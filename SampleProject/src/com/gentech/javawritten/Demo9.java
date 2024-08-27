package com.gentech.javawritten;
class Hospital
{
	void display()
	{
		System.out.println("Manipal hospital is located in Mysore");
	}
	static void show()
	{
		System.out.println("Manipal is one of the famous hospital in Karnatak");
	}
	static
	{
		Hospital h=new Hospital();
		System.out.println("This is a static block");
		h.display();
		show();
	}
	
}
public class Demo9
{
    public static void main(String args[])
	{
		Hospital h=new Hospital();
	}
	
}

