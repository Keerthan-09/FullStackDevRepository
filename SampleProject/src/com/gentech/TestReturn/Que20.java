package com.gentech.TestReturn;
class Element
{
	char lastelement(char c[])
	{
		return c[c.length-1];
	}
}
public class Que20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Element e=new Element();
		char p=e.lastelement( new char[] {'a','r','i','g','k'});
		System.out.println(p);

	}

}
