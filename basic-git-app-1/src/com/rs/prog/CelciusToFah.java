package com.rs.prog;

import java.util.Scanner;

public class CelciusToFah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cen;
		double fah;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Celcisus --> \n ");
		cen=scan.nextFloat();
		fah = (cen *1.8)+32;
		
		System.out.println("Equivalent Temperature of "+cen+" in Fahrenheit = "+fah);
	}

}
