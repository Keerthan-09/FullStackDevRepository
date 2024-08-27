//second half of 1D short array
package com.gentech.returnassignments;
class ConRet3
{
	short[] return3(short s[])
	{
		short res[] = new short[s.length/2];
		for (int i=s.length/2;i<s.length;i++)
		{
			res[i-s.length/2]=s[i];
		}
		return res;
	}
}

public class AssignReturn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a[]= {1,2,3,4,5,6};
        ConRet3 o=new ConRet3();
		short b[]=o.return3(a);
		
		for (int i=0;i<b.length;i++)
		{
			System.out.print(b[i] +" ");
	    }  
		

	}

}
