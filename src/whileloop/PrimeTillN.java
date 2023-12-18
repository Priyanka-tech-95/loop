//27. Write a Java program to print all Prime numbers between 1 to n.
package whileloop;

import java.util.Scanner;

public class PrimeTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you all prime number till that number ");
		int n = sc.nextInt();
		System.out.println("Prime Number till Number "+n);
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
				System.out.println(i);}
			
			
				i++;
			
		}
		
		
	}

}
