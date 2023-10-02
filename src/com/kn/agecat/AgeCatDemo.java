package com.kn.agecat;

public class AgeCatDemo {

	public void agecat(int age) {
		if(age<=12&&age>=0) {
			System.out.println("Child");
		}else if(age<=19&&age>=13){
			System.out.println("Teen");
		}else if(age<=59&&age>=20) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior");
		}

	}
}
