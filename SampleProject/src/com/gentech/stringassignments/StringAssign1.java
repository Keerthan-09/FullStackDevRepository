//Without using the length method find the number of characters in a given string.
package com.gentech.stringassignments;
class Length
{
	void strlength(String str)
	{
		int count=0;
		for (char c : str.toCharArray()) {
            count++;
        }
		System.out.println(count);

		
	}
}

public class StringAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Length l=new Length();
		l.strlength(" ");

	}

}
