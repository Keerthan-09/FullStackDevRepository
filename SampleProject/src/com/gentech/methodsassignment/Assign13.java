// sum of all the prime numbers in a given range
package com.gentech.methodsassignment;
class Con13
{
	void Method13(int j,int k )
	{
		if (j<2)
		{
			j=2;
		}
		int sum=0;
			
		for(int i=j;i<k+1;i++)
		{
			
			int c=0;
			for(int l=2;l<i;l++)
			{
				if(i%l==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
				{
				  sum=sum+i;
				}
		}
		System.out.println(sum);
		
	}
}

public class Assign13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con13 obj=new Con13();
		obj.Method13(1,100);
		

	}

}
