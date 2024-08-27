package com.gentech.stringassignments;
class Delete
{
	static void delete(String s)
	{
		int j=0;
		String k="day";
		String str="";
		for(int i=0;i<s.length ();i++)
		{
			if(s.charAt(i)==k.charAt(j))
			{
				String l=s.substring(i,i+k.length());
				if (l.equals(k))
				{
					
					i=i+2;
					continue;
				}
				else str=str+s.charAt(i);
				
			}
			else str+=s.charAt(i);
			
		}
		System.out.println(str);
	}
}
public class StringAssign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delete.delete("SundayMondayTuesdayWednesdayThursdayFridaySaturdaySunday");

	}

}
