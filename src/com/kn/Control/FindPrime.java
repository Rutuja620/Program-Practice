package com.kn.Control;

public class FindPrime {
	public boolean primeNum(int num) 
	{
		int count=0;
		for(int i=1;i<=count;i++)
		
			if(num%i==0) 
			{
				System.out.println(i);
				count++;
			}
			
				if(count==2) 
				{ 
					System.out.println("is prime");
					return true;
				}
				else 
				{
					System.out.println("not prime");
					return false;
				}
		    
		
	  } 
	}


