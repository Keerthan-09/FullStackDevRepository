package com.gentech.TestReturn;
class Count
{
	int count(short[][] a)
	{
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				flag=flag+1;
			}
		}
		return flag;
	}
}

public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c=new Count();
		short[][] k= {{1},{3,4},{5,6},{3,4}};
		int p=c.count(k);
		System.out.println(p);

	}

}
