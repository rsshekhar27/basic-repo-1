package com.rs.prog;

import java.util.Scanner;

public class FahToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fah;
		double cel;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit --> \n ");
		fah=scan.nextFloat();
		cel = (fah -32)/1.8;
		
		System.out.println("Equivalent Temperature of "+cel+" in Celcius = "+cel);
		
	}

}
