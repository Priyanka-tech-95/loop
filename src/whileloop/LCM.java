//25. Write a Java program to find LCM of two numbers.
package whileloop;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter two number to get LCM ");
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int i = 1;
		    int hcf =0;
		    int lcm =0;
		    
		    while(i<=a || i<=b) {
		    	
		    	if (a%i ==0 && b%i==0) {
		    		hcf = i;
		    		
		    	}
		    	i++;
		    }
		  lcm = (a*b)/hcf;
		  System.out.println("LCM of number "+a +" and "+b+" is "+lcm);	
		  }

}
