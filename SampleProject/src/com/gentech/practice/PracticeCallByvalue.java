package com.gentech.practice;
class Hi
{
	String making(String s)
	{
		s="Krishna";
		return s;
	}
}

public class PracticeCallByvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="radha";
		Hi o=new Hi();
		String k=o.making(s);
		System.out.println("what i get is:" +k);
		System.out.println(s);
		

	}

}
