//find the sum of all elements of a given 1D int array
package com.gentech.methodsassignment;
class Con2
{
	void Method2(int k[])
	{
		int sum=0;
		for(int i=0;i<k.length;i++)
		{
			sum=sum+k[i];
		}
		System.out.println("Sum of all elements:" +sum);
	}
}

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int l[]= {5,4,23,8,9,34};
     Con2 obj=new Con2();
     obj.Method2(l);
	}

}
