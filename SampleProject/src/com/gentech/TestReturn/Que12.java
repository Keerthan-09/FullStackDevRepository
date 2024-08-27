package com.gentech.TestReturn;

class Check {
	String check(int a, int b) {

		if (a > b)
			return "a is greater";
		else
			return "b is greater";
	}
}

public class Que12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c = new Check();
		String s = c.check(9, 10);
		System.out.println(s);

	}

}
