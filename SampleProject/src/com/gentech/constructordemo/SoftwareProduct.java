package com.gentech.constructordemo;

class SoftwarePro
{
	SoftwarePro(String name)
	{
		System.out.println("Product name:" + name);
	}

	SoftwarePro(float version)
	{
		System.out.println("Software Version:" + version);
	}

	SoftwarePro(double price)
	{
		System.out.println("Price:" + price);
	}

	SoftwarePro(int releaseyear)
	{
		System.out.println("Product released year:" + releaseyear);
	}

	SoftwarePro(boolean isreleased)
	{
		System.out.println("Is software released to market:" + isreleased);
	}
}



public class SoftwareProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwarePro s1=new SoftwarePro("Microcontroller");
		SoftwarePro s2=new SoftwarePro("5.77.9");
		SoftwarePro s3=new SoftwarePro(30000);
		SoftwarePro s4=new SoftwarePro(2000);
		SoftwarePro s5=new SoftwarePro(true);

	}

}
