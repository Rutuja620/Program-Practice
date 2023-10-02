package com.kn.Control;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take the user input
		System.out.println("Enter the num=");
		int num = scan.nextInt();
		
		//create the object of class FindPrime
		FindPrime f1 = new FindPrime();
		
		
		//Call the method for finding the prime num
		boolean out =f1.primeNum(num);
		
		//Print the result
		System.out.println(out);
	}

}
