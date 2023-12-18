//7. Write a Java program to find sum of all even numbers between 1 to n.
package whileloop;

import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number n to print number 1 to n ");
		int n = sc.nextInt();
		int i = 0;
		int sum =0;
		while(i<=n){
		System.out.println(i);
		sum+=i;
		i+=2 ;
	}
System.out.println("Sum of Even number :"+n +" is " +sum);
}
}