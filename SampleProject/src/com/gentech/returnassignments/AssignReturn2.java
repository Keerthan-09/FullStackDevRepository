//Returns sum of all elements of 1D int array
package com.gentech.returnassignments;
class ConRet2
{
	int return2(int s[])
	{
		int sum=0;
		for (int i=0;i<s.length;i++)
		{
			sum=sum+s[i];
		}
		return sum;
	}
}
public class AssignReturn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		ConRet2 o=new ConRet2();
        int k=o.return2(a);
        System.out.print("Sum of all the elements is:" +k );
	}

}
