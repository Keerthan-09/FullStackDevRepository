// prime number in a given range
package com.gentech.methodsassignment;
class Con11
{
	void Method11(int j,int k )
	{
		if (j<2)
		{
			j=2;
		}
			
		for(int i=j;i<=k;i++)
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
			if(c==0) System.out.println(i);
		}
		
	}
}

public class Assign11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con11 obj=new Con11();
		obj.Method11(10,50);

	}

}
