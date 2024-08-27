package com.gentech.programs;

class Country
{
    String name;
    String capital;
    
}
class State
{
    String name;
    String capital;
}
class Village
{
	String district;
	String name;
}


public class Address {

	public static void main(String[] args) {
		
		Country country=new  Country();
		country.name="India";
		country.capital="Delhi";
		System.out.println("Country name" +country.name);
		System.out.println("Country capital" +country.capital);
	    System.out.println("------------------------");
	    
		
		State state=new State();
		state.name="Karnataka";
		state.capital="Bangalore";
		System.out.println("State name" +state.name);
		System.out.println("State capital" +state.capital);
	    System.out.println("------------------------");
		
		Village vil=new  Village();
		vil.district="Mandya";
		vil.name="Chinya";
		System.out.println("District name" +vil.district);
		System.out.println("Village name"+vil.name   );
	    System.out.println("------------------------");

	}

}
