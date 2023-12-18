//31. Write a Java program to print all Armstrong numbers between 1 to n.
package whileloop;

import java.util.Scanner;

public class ArmstrongTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (Maximum of 3 digit)I will tell you it is Armstrong number or not ");
		int n = sc.nextInt();
		int temp = n;
		int r=0;
		int sum =0;
		for(int i =0;i<=n;i++) {
			n=temp;
		while(n!=0) {
			r = n%10;
			sum += (r*r*r);
			n=n/10;
		}
		
		}

	}

}
