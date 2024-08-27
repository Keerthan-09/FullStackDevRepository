package com.gentech.noargs;
class Country
{
    String name;
    String capital;
    Country()
    {
    	name="India";
		capital="Delhi";
		System.out.println("Country name" +name);
		System.out.println("Country capital" +capital);
	    System.out.println("------------------------");
	    
    }
    
}
class State
{
    String name;
    String capital;
    State()
    {
    	name="Karnataka";
		capital="Bangalore";
		System.out.println("State name" +name);
		System.out.println("State capital" +capital);
	    System.out.println("------------------------");
		
    }
}
class Village
{
	String district;
	String name;
	Village()
	{
		district="Mandya";
		name="Chinya";
		System.out.println("District name" +district);
		System.out.println("Village name"+name   );
	    System.out.println("------------------------");
	}
}



public class NoArgsAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country=new  Country();
		State state=new State();
		Village vil=new  Village();
	}

}
