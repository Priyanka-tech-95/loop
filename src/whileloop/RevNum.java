//2. Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop
package whileloop;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number n to print number n to 1 ");
		int n = sc.nextInt();
		int i = 1;
		while(n>=i){
		System.out.println(n);
		n-- ;
	}

}
}