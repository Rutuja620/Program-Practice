package com.kn.Control;

import java.util.Scanner;

public class SumOFSqare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num=");
		int num = scan.nextInt();
		int temp=num;
		
		int sum=0;int digit=0;
		while(num>0) {
		 int rem = num%10;
			digit=(digit)+(rem*rem);
			num=num/10;
			//System.out.println("i value="+ i);
		}
		System.out.println("The  value ="+digit);
	}
	

}
