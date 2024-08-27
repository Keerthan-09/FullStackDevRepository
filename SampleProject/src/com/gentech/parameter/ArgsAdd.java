package com.gentech.parameter;

class Country
{
    String name;
    String capital;
    Country(String cn,String cap)
    {
    	name=cn;
		capital=cap;
		System.out.println("Country name" +name);
		System.out.println("Country capital" +capital);
	    System.out.println("------------------------");
	    
    }
    
}
class State
{
    String name;
    String capital;
    State(String n,String cap)
    {
    	name=n;
		capital=cap;
		System.out.println("State name" +name);
		System.out.println("State capital" +capital);
	    System.out.println("------------------------");
		
    }
}
class Village
{
	String district;
	String name;
	Village(String dis,String n)
	{
		district=dis;
		name=n;
		System.out.println("District name" +district);
		System.out.println("Village name"+name   );
	    System.out.println("------------------------");
	}
}


public class ArgsAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country=new  Country("India","Delhi");
		State state=new State("Karnataka","Bangalore");
		Village vil=new  Village("Mandya","Chinya");

	}

}
