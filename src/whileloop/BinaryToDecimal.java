//40. Write a Java program to convert Binary to Decimal number system.
package whileloop;

import java.util.Scanner;


public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Binary number, I will tell you Decimal value ");
		int a = sc.nextInt();
		int temp=a;
		int rem =0;
		int d =0;
		int i=0;
		while(temp>0) {
			rem = temp%10;
			
				int p = (int)Math.pow(2, i++);
				d =d+(rem * p);
			
			temp =temp/10;
			
		}
		System.out.println("Decimal value of Binary number " +a +" is " +d);
		
	}

}
