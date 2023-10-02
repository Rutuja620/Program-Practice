package com.kn.countofdigit;

import java.util.Scanner;

public class CountDigit {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num=");
		int num = scan.nextInt();
		
		//Create the object of class CountDemo
		CountDemo c1 = new CountDemo();
		
		//call the method to find the sum
		  int count =c1.count(num);
		
		//print the number
		System.out.println("The sum ="+count);
		
		
			
			
		}
		
	}


