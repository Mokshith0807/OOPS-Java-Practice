package com.mokshith.oops;

class Product {
	private String name;
	private double price;
	private int quantity;
	
	Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	void displayDetails() {
		System.out.println("Product Name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Quantity: "+ quantity);
		System.out.println("Total Value: "+ getTotalValue());
		System.out.println("-----------------------------------------");
	}

	double getTotalValue() {
		return price * quantity;
	}
	
}
public class ProductManagementSystem {
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 50000.0, 2);
		Product p2 = new Product("TV", 75000.0, 1);
		
		p1.displayDetails();
		p2.displayDetails();
	}
}
