// Find the summ of a specified row's elements
package com.gentech.methodsassignment;
class Con5
{
	void Method5(double a[][],int p)
		{
			double sum=0;
			for(int j=p;j<p+1;j++)
			{
				for(int k=0;k<a[j].length;k++)
				{
					sum=sum+a[j][k];
				}
				
			}
			System.out.println(sum);
		}
	
}

public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con5 obj=new Con5();
	     double a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	     obj.Method5(a,1);

	}

}
