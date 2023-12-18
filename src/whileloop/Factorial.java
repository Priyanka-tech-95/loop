//23. Write a Java program to calculate factorial of a number.

package whileloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get factorial of that number ");
		int n = sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n) {
			fact *=i;
			i++;
		}
		System.out.println("Factorial of number " +n+ " is "+fact);

	}

}
