package com.gentech.noargs;

class TwoWheelers
{
    String type;
    int id;
    TwoWheelers()
    {
	 type="Bike";
	 id=101;
	 System.out.println("Example of two wheels vehicles " + type);
	 System.out.println("id " +id);
	 System.out.println("------------------------");
    }
    
}
class FourWheelers
{
    String type;
	int id;
	FourWheelers(){
	type="car";
    id=102;
	 System.out.println("Example of four wheels vehicles " +type);
	 System.out.println("id " + id);
	 System.out.println("------------------------");
	}
}
class HeavyVehicles
{
	int id;
	String type;
	HeavyVehicles()
	{
	 type="truck";
     id=103;
	 System.out.println("Example of heavy  vehicles " +type);
	 System.out.println("id " +id);
	 System.out.println("------------------------");
	}

}


public class NoArgsVehicle {

	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		TwoWheelers toww=new TwoWheelers();
		FourWheelers fourw=new  FourWheelers();
		HeavyVehicles heavyv=new HeavyVehicles();

	}

}
