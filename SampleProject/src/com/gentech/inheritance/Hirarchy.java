package com.gentech.inheritance;

class Vehicle {
	double basePrice;

	Vehicle(double orgprice) {
		basePrice = orgprice;
	}

	public void showPrice() {
		System.out.println("The price of Vehicle is: Rs." + basePrice);
	}
}

class TwoWheeler extends Vehicle {
	double increasePriceBy;

	TwoWheeler(double orgprice, double increase) {
		super(orgprice);
		increasePriceBy = increase;
	}

	void finalPrice() {
		basePrice = basePrice + (basePrice * increasePriceBy);
		System.out.println("After modification, The price of bike is: Rs." + basePrice);
	}
}

class FourWheeler extends Vehicle {
	double increasePriceBy;

	FourWheeler(double orgprice, double increase) {
		super(orgprice);

		increasePriceBy = increase;
	}

	void finalPrice() {
		basePrice = basePrice + (basePrice * increasePriceBy);
		System.out.println("After modification, The price of car is: Rs." + basePrice);
	}
}

public class Hirarchy {

	public static void main(String[] args) {

		TwoWheeler bike = new TwoWheeler(100000, 0.2);
		bike.showPrice();
		bike.finalPrice();

		FourWheeler car = new FourWheeler(150000, 1);
		car.showPrice();
		car.finalPrice();

	}

}
