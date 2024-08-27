//without using the replace method repalce the old string with new string
package com.gentech.stringassignments;
class Replace
{
	static void replace(String  s,String k,String z)
	{
		int j=0;
		String str="";
		for(int i=0;i<s.length ();i++)
		{
			if(s.charAt(i)==k.charAt(j))
			{
				String l=s.substring(i,i+k.length());
				if (l.equals(k))
				{
					str=str+z;
					i=i+l.length()-1;
				}
				else str+=s.charAt(i);
			}
			else str+=s.charAt(i);
			
		}
		System.out.println(str);
	}
}
public class StringAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replace.replace("Krishna is known for  love", "Krishna", "RadhaKrsihna");
		

	}

}
