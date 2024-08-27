//Reverse of elements from 1D double array

package com.gentech.returnassignments;
class ConRet4
{
	double[] return1(double s[])
	{
		double res[] = new double[s.length];
		for (int i=s.length-1;i>=0;i--)
		{
			res[s.length-1-i]=s[i];
		}
		return res;
	}
}
public class AssignReturn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]= {100,200,300,400,500,600};
		ConRet4 o=new ConRet4();
		double b[]=o.return1(a);
		for (int i=0;i<b.length;i++)
		{
			System.out.print(b[i] +" ");
		}

	}

}
