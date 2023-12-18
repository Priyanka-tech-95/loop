//15. Write a Java program to calculate product of digits of a number.
package whileloop;

import java.util.Scanner;

public class ProdOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you Product of  Digit of the number ");
		int n = sc.nextInt();
		
		int r = 0,prod=1;
		int temp =n;
		
		while(n != 0) {
		r = n%10;
		prod= prod*r;
		n=n/10;
		}
		System.out.println("Product of digit of number "+temp +" is "+prod);
	}

}
