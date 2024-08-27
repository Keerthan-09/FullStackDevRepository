package com.gentech.stringassignments;

class Pattern1
{
	static void pattern1(String s)
	{
		for (int k = 0; k < s.length(); k++)
		{
			for (int j = 0; j <= k; j++)
			{
				System.out.print(s.charAt(j) + " ");
			}
			System.out.println();
		}

	}

}

public class StringAssign7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1.pattern1("Program");

	}

}
