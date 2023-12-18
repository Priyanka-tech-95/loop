//11. Write a Java program to find first and last digit of a number.
package whileloop;

import java.util.Scanner;

public class FirtstLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you First and Last Digit of number ");
		int n = sc.nextInt();
		
		int r = 0;
		int temp =n;
		
		while(n != 0) {
		r = n%10;
		if(temp == n) {
			System.out.println("The First digit of number "+temp +"is  :"+r);		}
		
		 n =n/10;
		 if(n==0) {
			 System.out.println("The last digit of number "+temp +"is :"+r);
		 }
		
			}
			
	}

}
