package com.mokshith.oops;

class Calculator2 {
	
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
}
public class SmartCalculator {
	public static void main(String[] args) {
		Calculator2 c = new Calculator2();
		int add2Numbers = c.add(5, 5);
		double addDecimalNumbers = c.add(10.0, 10.0);
		int add3Numbers = c.add(2, 3, 10);
		
		System.out.println("Addition of 2 Numbers: " + add2Numbers);
		System.out.println("Addition of 2 Decimal Numbers: " + addDecimalNumbers);
		System.out.println("Addition of 3 Numbers: " + add3Numbers);
	}
}
