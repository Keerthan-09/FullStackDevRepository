package com.gentech.inheritance;

class Phone {
	String brand;
	String model;

	    Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	    void call(String number) {
		System.out.println(brand + " " + model + " is calling " + number + ".");
	}

	    void turnOn() {
		System.out.println(brand + " " + model + " is now on.");
	}

	    void turnOff() {
		System.out.println(brand + " " + model + " is now off.");
	}
}

class AndroidPhone extends Phone {
	String operatingSystem;

	 AndroidPhone(String brand, String model, String operatingSystem) {
		super(brand, model);
		this.operatingSystem = operatingSystem;
	}

	 void installApp(String appName) {
		System.out.println(
				"Installing " + appName + " on the " + brand + " " + model + " running " + operatingSystem + ".");
	}
}

class SamsungPhone extends AndroidPhone {

	 SamsungPhone(String model, String ver, String type) {
		super(model, ver, type);
	}

	 void useSamsungPay() {
		System.out.println(brand + " " + model + " is using Samsung Pay.");
	}
}

public class SuperClassContainsParaCon {

	public static void main(String[] args) {
		SamsungPhone samsungPhone = new SamsungPhone("Samsung", "Galaxy S21", "Android");
		samsungPhone.turnOn();
		samsungPhone.call("555-555-5555");
		samsungPhone.installApp("Samsung Health");
		samsungPhone.useSamsungPay();
		samsungPhone.turnOff();

	}

}
