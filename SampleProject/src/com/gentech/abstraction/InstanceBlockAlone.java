package com.gentech.abstraction;
abstract class TravellingMode
{
	{
		System.out.println("Our State has a good travelling facilities");
	}
}
class RoadTransportation extends TravellingMode
{
	RoadTransportation()
	{
		System.out.println("Our Banglore has Metro Service");
	}
}

public class InstanceBlockAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravellingMode r=new RoadTransportation();

	}

}
