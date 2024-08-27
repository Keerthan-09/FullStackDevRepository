//Display the second halfelements of given 1D string array


package com.gentech.methodsassignment;
class Con1
{
	void Method1(String s[])
	{
		for(int i=s.length/2;i<=s.length-1;i++)
		{
			System.out.println(s[i]);
		}
	}
		
}

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String p[]={"Radha","Krishna","ek","Sundar","Prema","Kathan"};
    Con1 obj1=new Con1();
    obj1.Method1(p);
    
	}

}
