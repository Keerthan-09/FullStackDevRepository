package com.gentech.TestReturn;
class Result
{
	boolean and(int  a,int b1)
	{
		
		return ((a>5) && (b1<5));
	}
}
public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result res=new Result();
		boolean k=res.and(8,3);
		System.out.println(k);

	}

}
