//returns the 1st half of 1D int array

package com.gentech.returnassignments;
class ConRet1
{
	int[] return1(int s[])
	{
		int res[] = new int[s.length/2];
		for (int i=0;i<res.length;i++)
		{
			res[i]=s[i];
		}
		return res;
	}
}

public class AssignReturn1 {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6};
		ConRet1 o=new ConRet1();
		int[] b=o.return1(a);
		for (int i=0;i<b.length;i++)
		{
			System.out.print(b[i] +" ");
		}
		

	}

}
