package com.gentech.TestReturn;
class Div
{
	int div()
	{
		int flag =0;
		for(int i=50;i>=30;i--)
		{
			if(i%4==0)
			{
				flag++;
			}
		}
		return flag;
	}
}
public class Que15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div d=new Div();
		int z=d.div();
		System.out.println(z);

	}

}
