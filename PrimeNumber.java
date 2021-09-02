package logicalprogram.com;
import java.util.*;

public class PrimeNumber {
	
	// declare the method
	public static void checkPrime() {
		
		// Get input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
        int temp = 0;
		for (int i = 2; i <= num - 1; i++)
		{
			if (num % i == 0) 
			{
				temp = temp + 1;
			}
		}
		if (temp > 0)
			{
				System.out.println("Number is not prime");
			} 
		else 
			{
				System.out.println("Number is Prime");
			}
		}

	   public static void main(String args[]) {

		//calling the method
		checkPrime();

	}
}
