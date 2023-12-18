//16. Write a Java program to enter a number and print its reverse.
package whileloop;

import java.util.Scanner;

public class RevOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you Sum of First and Last Digit of the number ");
		int n = sc.nextInt();
		
		int r = 0,revnum=0;
		int temp =n;
		
		while(n != 0) {
		r = n%10;
		revnum=revnum*10+r;
		 n =n/10;
		}
		System.out.println("The reverse of number "+temp +" is " +revnum);
	}

}
