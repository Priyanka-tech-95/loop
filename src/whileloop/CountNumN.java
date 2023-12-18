//10. Write a Java program to count number of digits in a number.
package whileloop;

import java.util.Scanner;

public class CountNumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you digits of that number ");
		int n = sc.nextInt();
		int i = 0;
		int r = 0;
		int temp = n;
		while(n != 0) {
		r = n%10;
		 n =n/10;
		 i++;
			}
		 System.out.println("Number of digit in Given number  " +temp +" is "+i);	
	}
	 	
}
