package com.gentech.TestReturn;
class Conv
{
	static int conv(String s)
	{
		return Integer.parseInt(s);
	}
}
public class Que17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=Conv.conv("123");
		System.out.println(k);

	}

}
