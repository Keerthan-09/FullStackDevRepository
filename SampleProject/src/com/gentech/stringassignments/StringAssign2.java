//Reversing of string without using the reverse method
package com.gentech.stringassignments;
class Reverse
{
	static  void charAtMethod(String s)
	{
		String str="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			str+=s.charAt(i);
			
		}
		System.out.println(str);
		
	}
	static  void tocharArrayMethod(String s)
	{
	    char ch[]=s.toCharArray();
	    String str="";
		
		for(int i=ch.length-1;i>=0;i--)
		{
			str+=ch[i];
			
		}
		System.out.println(str);
		
	}
	static  void substringMethod(String s)
	{
	    char ch[]=s.toCharArray();
	    String str="";
		
		for(int i=ch.length-1;i>=0;i--)
		{
			str+=s.subSequence(i, i+1);
			
		}
		System.out.println(str);
		
	}
	 
	
	
}

public class StringAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Reverse.charAtMethod("hello");
		Reverse.tocharArrayMethod("hello");
		Reverse.substringMethod("hello");

	}

}
