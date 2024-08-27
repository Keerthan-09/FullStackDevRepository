package com.gentech.stringassignments;
class Palindrome
{
	static  void pali(String s)
	{
		String str="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			str+=s.charAt(i);
			
		}
		if(str.equals(s)) System.out.println("It is a palindrome");
		else System.out.println("Not a palindrome");
		
	}
}
public class StringAssign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome.pali("MAMAM");

	}

}
