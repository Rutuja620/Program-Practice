package com.kn.Control;

public class LeafYear {

	public static void main(String[] args) {
		int year=2004;
		if(year%4==0) {
			if(year%100==0) {  //century
				if(year%400==0) {
					System.out.println("Leaf year");
				}else {
					System.out.println("Not a leaf year");
				}
			}
			System.out.println("Leaf year");
		}else {
			System.out.println("Not a leaf year");
		}
	}

}
