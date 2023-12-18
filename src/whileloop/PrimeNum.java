//26. Write a Java program to check whether a number is Prime number or not.
package whileloop;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Number is Prime or not ");
		int a = sc.nextInt();
		int i=1;
		int count =0;
		
		while(i<=a) {
			if(a%i == 0) {
				count++;
			}
			i++;
		}
		if(count==2) {
		System.out.println("Number "+a +" is Prime Number ");
	}else {
		System.out.println("Number "+a+" is not Prime Number ");
	}
	
	
}
}
