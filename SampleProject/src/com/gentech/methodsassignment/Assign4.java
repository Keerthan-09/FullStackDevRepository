//Transpose of matrix
package com.gentech.methodsassignment;
class Con4
{
	void Method4(int a[][])
	{
		for(int j=0;j<a[0].length;j++)
		{
			for(int k=0;k<a.length;k++)
			{
				System.out.print(a[k][j] +" ");
			}
			System.out.println();
		}
	}
}
public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Con4 obj=new Con4();
     int a[][]= {{1,2,3},{4,5,6}};
     obj.Method4(a);
     
	}

}
