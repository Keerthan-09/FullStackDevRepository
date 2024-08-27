package com.gentech.abstraction;

abstract class Ashrama {
	abstract void donation();

	static void displayinfo(String location, String name) {
		System.out.println("name of the ashrama:" + name);
		System.out.println("locatin:" + location);
		System.out.println();

	}

	static void facilities(String activities) {

		System.out.println("facilities:" + activities);
		System.out.println();

	}

}

class Donators extends Ashrama {
	String donarname;

	Donators(String name) {
		donarname = name;
		
	}

	void donation() {
		System.out.println("Charity Person:"+donarname);
	}

	
	
}

public class WithMultipleStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Donators d = new Donators(" Sudha Murthy");
		Ashrama.displayinfo("Hyderabad, India", "Sri Ramana Maharshi Old Age Home");
		Ashrama.facilities("Provides shelter, food, medical care, and companionship to elderly individuals.");
		//d.donation();

	}

}
