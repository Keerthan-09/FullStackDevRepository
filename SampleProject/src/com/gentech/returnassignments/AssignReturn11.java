//Concatination of 1D string array
package com.gentech.returnassignments;
class ConRet11
{
	String method11(String a[])
	{
			String s="";
			for (int i=0;i<a.length;i++)
			{
				s=s+a[i]+" ";
			}
			return s;
			
	}
}

public class AssignReturn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Hi","Radha","my","name","is","krishna"};
		ConRet11 o=new ConRet11();
		String p=o.method11(s);
	    System.out.print(p);


	}

}
