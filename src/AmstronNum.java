import java.util.Scanner;

public class AmstronNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Taking the user input
		System.out.println("Enter the num=");
		int num = scan.nextInt();
		
		//Create the object of class Amstron
		Amstron a1 = new Amstron();
		
		//call the method for finding the amstrong num
		   a1.findAmstrong(num); 
		
		//Print the num
		
	}

}
