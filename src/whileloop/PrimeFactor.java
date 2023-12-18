//29. Write a Java program to find all prime factors of a number.
package whileloop;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you all prime Factor of that number ");
		int n = sc.nextInt();
		System.out.println("Prime Factor of "+n +" is 1");
		int i=1;
		int temp = n;
		
		while(i<=n) {
			
			int j=1;
			int count = 0;
			while(j<=i) {
				if(i%j==0) {
					count++;
				}
				
				j++;
			}
			if(count==2) {
				if(temp%i==0) {
				System.out.println(i);
				}
			}
				i++;
			
		}
	}

}
