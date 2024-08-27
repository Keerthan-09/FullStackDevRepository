//square of each number b/w 1 to 10
package com.gentech.returnassignments;
class ConRet6
{
	int[] return6(int s)
	{
		int res[] = new int[s];
		for (int i=0;i<s;i++)
		{
			res[i]=(i+1)*(i+1);
		}
		return res;
	}
}
public class AssignReturn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ConRet6 o=new ConRet6();
		int a[]=o.return6(10);
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i] +" ");
		}
		

	}

}
