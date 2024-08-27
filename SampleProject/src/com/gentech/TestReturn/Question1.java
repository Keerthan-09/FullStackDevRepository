
package com.gentech.TestReturn;
class Ary
{
	static boolean[] bolArr(boolean k[]) {
		boolean b[]=new boolean[k.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=k[i];
		}
		return b;
		
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p[]= {true,false,true,false};
		boolean s[]= Ary.bolArr(p);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		

	}

}
