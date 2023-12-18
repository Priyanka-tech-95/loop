//9. Write a Java program to print multiplication table of any number.
package whileloop;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you table of that number ");
		int n = sc.nextInt();
		int i = 1;
		
		while(i<=10){
			int multi = 0;
			
			multi=n*i;
			System.out.println(multi);
			i++;
			
	}
	}
}
