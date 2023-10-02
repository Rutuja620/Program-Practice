package com.kn.Control;

import java.util.Scanner;

public class BinDecConve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a binary num=");
		int input= scan.nextInt();
		//create the object of class binary
		Binary b1 = new Binary();
		
		//call the method 
		int output=b1.conv(input);
			
		//print the result
		System.out.println("The num is ="+output);
		
		
	}
	
}
