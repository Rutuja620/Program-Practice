package com.kn.fibonacci;

public class FibonacciDemo {
	public static int fiboSeries (int num) {
		int n1=0,n2=0,n3=1;
		for(int i=0;i<=num;i++) 
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.print(n1+" ");
			
		}
		return num;
	}

}
