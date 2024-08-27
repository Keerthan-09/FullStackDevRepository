package com.gentech.outerinnerclass;
class Outer
{
	int input1;
	int input2;
	int res;
	Outer(int a, int b)
	{
		this.input1=a;
		this.input2=b;
		System.out.println("Input1 is:"+input1);
		System.out.println("Input2 is:" +input2);
		Inner inner =new Inner();
		res=inner.method(6,7);
		System.out.println("sum of" +input1 +"and" +input2 +"is: "+res );
		System.out.println(this.input1);
		System.out.println(this.input2);

	}
	private class Inner
	{
		int sum;
		private int method(int a,int b)
		{
			input1=a;
			input2=b;
			this.sum=input1+input2;
			return sum;
		}
	}
	
	
}

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer =new Outer(10,15);

	}

}
