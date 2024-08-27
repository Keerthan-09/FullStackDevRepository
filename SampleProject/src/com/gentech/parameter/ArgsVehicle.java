package com.gentech.parameter;
class TwoWheelers
{
    String type;
    int id;
    TwoWheelers(String Vehtype,int Vehid)
    {
	 type=Vehtype;
	 id=Vehid;
	 System.out.println("Example of two wheels vehicles " + type);
	 System.out.println("id " +id);
	 System.out.println("------------------------");
    }
    
}
class FourWheelers
{
    String type;
	int id;
	FourWheelers(String Vehtype,int Vehid){
	type=Vehtype;
    id=Vehid;
	 System.out.println("Example of four wheels vehicles " +type);
	 System.out.println("id " + id);
	 System.out.println("------------------------");
	}
}
class HeavyVehicles
{
	int id;
	String type;
	HeavyVehicles(int Vehid,String Vehtype)
	{
	 type=Vehtype;
     id=Vehid;
	 System.out.println("Example of heavy  vehicles " +type);
	 System.out.println("id " +id);
	 System.out.println("------------------------");
	}

}
public class ArgsVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheelers toww=new TwoWheelers("Splender",765);
		FourWheelers fourw=new  FourWheelers("Ferrari",785);
		HeavyVehicles heavyv=new HeavyVehicles(123,"JCB");

	}

}
