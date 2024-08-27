package com.gentech.methods;
class Array
{
	void array(String s[])
	{
		
		for (int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
		
	}
}

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"hi","hello","my","name","is","keerthana"};
		Array o=new Array();
		o.array(s);
	}

}
