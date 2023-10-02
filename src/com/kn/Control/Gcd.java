package com.kn.Control;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//Take the input from the user
	System.out.println("Enter the num1=");
	int num1 = scan.nextInt();
	System.out.println("Enter the num2");
	int num2 = scan.nextInt();
	//int gcd=0;
	
	//Create the object of class GcdDemo
	GcdDemo g1 = new GcdDemo();
	
	//call the method to find the gcd
	  int common =g1.commondivisior(num1, num2);
	
	//print the number
	System.out.println("The gretest common divisor is="+common);
	
	
	}
  }

