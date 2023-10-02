package com.kn.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = scan.nextInt();
		
		//create a object of class fibonacciDemo
		FibonacciDemo f1 = new FibonacciDemo();
		
		//Call a method of fiboSeries
		 int out = f1.fiboSeries(num);
		 
		 //System.out.print(out);
	}

}
