
public class Amstron {
	public void findAmstrong(int num) {
		
		int digit=0,sum=0;
		int temp,p; temp=num;
		
		while(num>0){
			digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(num==temp) {
			System.out.println("The num is amstrong");
		}else {
			System.out.println("The num is not amstrong");
		}
	}
}
