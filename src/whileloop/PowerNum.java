//21. Write a Java program to find power of a number using for loop.
package whileloop;

import java.util.Scanner;

public class PowerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Base number ");
		int e = sc.nextInt();
		System.out.print("Enter Exponent number ");
		int n = sc.nextInt();
		int i=1;
		int temp =1;
		
		while(i<=n) {
			
			temp *= e;
					
			i++;
		}
		System.out.println(+e +" to the power " +n+ " is "+temp);

	}

}
