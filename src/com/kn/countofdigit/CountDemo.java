package com.kn.countofdigit;

public class CountDemo {
	public int count(int num) {
		
		//int num=1234;
		int sum=0,digit=0;
		
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
	return sum;
	}

}
