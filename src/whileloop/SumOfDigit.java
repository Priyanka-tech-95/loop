//14. Write a Java program to calculate sum of digits of a number.
package whileloop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you Sum of  Digit of the number ");
		int n = sc.nextInt();
		
		int r = 0,sum=0;
		int temp =n;
		
		while(n != 0) {
		r = n%10;
		sum = sum+r;
		n=n/10;
		}
		System.out.println("Sum of digit of number "+temp +" is "+sum);
	}

}
