//Write a Java program to print all natural numbers from 1 to n. - using while loop
package whileloop;

import java.util.Scanner;

public class TillNNum {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number n to print number 1 to n ");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
		System.out.println(i);
		i++ ;
	}
}
}