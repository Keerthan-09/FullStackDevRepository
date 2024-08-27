package com.gentech.programs;
class TwoWheelers
{
    String type;
    int id;
    
}
class FourWheelers
{
    String type;
	int id;
}
class HeavyVehicles
{
	int id;
	String type;
}

public class Vehicles {

	public static void main(String[] args) {
		
		 TwoWheelers toww=new TwoWheelers();
		 toww.type="Bike";
		 toww.id=101;
		 System.out.println("Example of two wheels vehicles " + toww.type);
		 System.out.println("id " + toww.id);
		 System.out.println("------------------------");
		  
		  
		 FourWheelers fourw=new  FourWheelers();
		 fourw.type="car";
		 fourw.id=102;
		 System.out.println("Example of four wheels vehicles " + fourw.type);
		 System.out.println("id " + fourw.id);
		 System.out.println("------------------------");
		  
		  
		 HeavyVehicles heavyv=new HeavyVehicles();
		 heavyv.type="truck";
		 heavyv.id=103;
		 System.out.println("Example of heavy  vehicles " + heavyv.type);
		 System.out.println("id " + heavyv.id);
		 System.out.println("------------------------");

	}

}
