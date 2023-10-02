package com.kn.Control;

public class Binary {
	public int conv(int input) {
		int sum=0,digit=0,e=0;
		
		while(input>0) {
			
			digit=input%10;
			sum=sum+(int)Math.pow(2,e)*digit;
			input=input/10;
			e++;
		}
		return sum;
		//System.out.println(sum);
	}
	
}
