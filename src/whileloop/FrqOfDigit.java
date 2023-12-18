//18. Write a Java program to find frequency of each digit in a given integer.
package whileloop;

import java.util.Scanner;

public class FrqOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you frequency of each Digit of the number ");
		int n = sc.nextInt();
		
		int r = 0,i=0;
		
	for(i=0;i<=9;i++) {
		int temp =n, count=0;
		while(temp!=0) {
			r=temp%10;
			if(r==i) {
				count++;
			}
			temp=temp/10;
			
		}
		if(count>0)
		System.out.println("Frequency of "+i+" is "+count+" times ");		
	}
		
	}
}		


