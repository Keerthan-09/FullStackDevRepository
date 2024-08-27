// count of prime numbers in a given range
package com.gentech.methodsassignment;
class Con12
{
	void Method11(int j,int k )
	{
		if (j<2)
		{
			j=2;
		}
		int count=0;
			
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
			if(c==0)
				{
				  count++;
				}
		}
		System.out.println(count);
		
	}
}
public class Assign12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con12 obj=new Con12();
		obj.Method11(1,10);
	}

}
