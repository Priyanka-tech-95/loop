//8. Write a Java program to find sum of all odd numbers between 1 to n.
package whileloop;

import java.util.Scanner;

public class SumofOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number n to print number 1 to n ");
		int n = sc.nextInt();
		int i = 1;
		int sum =0;
		while(i<=n){
		System.out.println(i);
		sum+=i;
		i+=2 ;
	}
System.out.println("Sum of Odd number :"+n +" is " +sum);
	}

}
