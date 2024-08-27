package com.gentech.selflearning;
class DDoubt
{
	 int k;
	DDoubt(int s)
	{
		k=s;
	}
	
    static int display(DDoubt d)
	{
		if(d.k%4==0) return 1;
		else return 2;
	}
}
public class Doubt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DDoubt o= new DDoubt(2000);

	}

}
