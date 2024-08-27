package com.gentech.TestReturn;
class Voting
{
	static String voting(int age)
	{
		if (age>=18)
			return "eligible";
		else
			return "not eligible";
	}
}
public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=Voting.voting(18);
		System.out.println(s);

	}

}
