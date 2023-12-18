//12. Write a Java program to find sum of first and last digit of a number.
package whileloop;

import java.util.Scanner;

public class SumOfFirstLastDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you Sum of First and Last Digit of the number ");
		int n = sc.nextInt();
		
		int r = 0,r1 =0,r2=0;
		int temp =n;
		
		while(n != 0) {
		r = n%10;
		if(temp == n) {
			r1=r;
			System.out.println("The First digit of number "+temp +" is  :"+r);
			
			}
		
		 n =n/10;
		 if(n==0) {
			 r2=r;
			 System.out.println("The last digit of number "+temp +" is :"+r);
			 
		 }
		
	}
System.out.println("Sum of First and Last digit of number :" +temp +" is "+(r1+r2));
	}

}
