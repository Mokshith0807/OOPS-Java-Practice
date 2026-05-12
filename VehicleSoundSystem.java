package com.mokshith.oops;

class Vehicle1 {
	public void sound() {
		System.out.println("Vehicle horn sound");
	}
}

class Car1 extends Vehicle1{
	public void sound() {
		System.out.println("Car horn sound");
	}
}

class Bike1 extends Vehicle1{
	public void sound() {
		System.out.println("Bike horn sound");
	}
}
public class VehicleSoundSystem {
	public static void main(String[] args) {
		Vehicle1 v;
		
		v = new Car1();
		v.sound();
		
		System.out.println("------------------------------------------");
		
		v = new Bike1();
		v.sound();
	}
}
