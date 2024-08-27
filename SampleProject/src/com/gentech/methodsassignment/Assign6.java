//display of a complete table (2 to 20)

package com.gentech.methodsassignment;
class Con6
{
	void Method6(int a,int b)
		{
			for(int j=a;j<=b;j++)
			{
				for(int k=1;k<=10;k++)
				{
					System.out.println(j +"*" +k +"=" +(j*k));
				}
				System.out.println("+++++++++++++++++++++++");
				
			}
			
		}
	
}

public class Assign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con6 obj=new Con6();
	     
	     obj.Method6(2,20);

	}

}
