package Day9;

import java.util.Scanner;

public class IfStatememntExercice1 {
	public static void main(String[] args) {
		
		System.out.print("Enter the number: ");
		Scanner number = new Scanner(System.in);

		int n = number.nextInt();

		if(n % 2 ==0)
		System.out.println("This Number " + n + " is " + " even");
		if(n % 2 ==1)
	    System.out.println("This number " + n + " is " + " odd");

	
	number.close();
	}
}
