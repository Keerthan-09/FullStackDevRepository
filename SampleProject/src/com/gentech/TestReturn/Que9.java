package com.gentech.TestReturn;
class Num
{
	int[] value()
	{
		int res[]=new int[6];
		int k=0;
		for(int i=21;i>=11;i--)
		{
			
			
			if ((i%2)!=0)
			{
				res[k]=i;
				k++;
				
			}
		}
		return res;
		
	}
	
}

public class Que9 {
	public static void main(String args[])
	{
		Num n=new Num();
		int k[]=n.value();
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
	}

}
