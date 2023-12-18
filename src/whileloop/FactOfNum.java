//22. Write a Java program to find all factors of a number.
package whileloop;

import java.util.Scanner;

public class FactOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell factor of that number ");
		int a = sc.nextInt();
		int i=1;
		int n =0;
		int count =0;
		System.out.print("Factor of "+a +" is ");
		while(i<=a) {
			
			if(a%i==0) {
				
				System.out.print(i +"  ");
				count++;
			}
			
			i++;
		}
		System.out.println();
		if(count == 2) {
			System.out.println("Number "+a+ " is a prime number");
		}else {
			System.out.println("Number "+a+ " is a not prime number");
		}
	}

}
