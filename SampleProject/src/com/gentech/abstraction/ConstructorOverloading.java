package com.gentech.abstraction;

abstract class Hotel {
	String type;
	String address;

	abstract void details();

	Hotel(String address) {
		this.address = address;
		System.out.println("Hotel shakti near to " + address);
	}

	Hotel(String address, String type) {
		this.address = address;
		this.type = type;
		System.out.println("Type: " + type + " Hotel adithya near to " + address);
	}

}

class Food extends Hotel {
	void details() {
		System.out.println("Hotel details : ");
		System.out.println("Hotel name: Shakthi");
		System.out.println("Type veg and non-veg");
	}

	Food(String address) {
		super(address);
	}

	Food(String address, String type) {
		super(address, type);
	}

}

class Items extends Food {
	Items(String address, String type) {
		super(address, type);
		super.details();
	}

	Items(String address) {
		super(address);
		super.details();
	}

}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Items i = new Items("Mandya", "non veg");
	}
}
