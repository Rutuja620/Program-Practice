package com.kn.agecat;

import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take the user input
		System.out.println("Enter the age of the person=");
		int age = scan.nextInt();
		//Create the object of class AgeCatDemo
		AgeCatDemo category = new AgeCatDemo();
		
		//call the function of class
		 category.agecat(age);
		
		 
		 
	}

}
