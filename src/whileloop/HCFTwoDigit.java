//24. Write a Java program to find HCF (GCD) of two numbers.
package whileloop;

import java.util.Scanner;

public class HCFTwoDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two number to get HCF ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int i = 1;
    int hcf =0;
    
    while(i<=a || i<=b) {
    	
    	if (a%i ==0 && b%i==0) {
    		hcf = i;
    		
    	}
    	i++;
    }
    System.out.print(hcf);
	}

}
