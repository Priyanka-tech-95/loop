//12. Write a Java program to find sum of first and last digit of a number.
package whileloop;

import java.util.Scanner;

public class SwapFstLastDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number I will tell you Swap of First and Last Digit of the number ");
		int n = sc.nextInt();
		
		int r = 0,r1 =0,r2=0,r3=0,swapnum = 0;
		int temp =n;
		int i=1,count=0;
		
		while(n != 0) {
		r = n%10;
		
		if(temp == n) {
			r1=r;
			System.out.println("The First digit of number "+temp +" is  :"+r);
			//n=n/10;
		
			}
		
		 n =n/10;
		  count++;
		 r1= r1 * 10 ;
		 if(n==0) {
			 r2=r;
			 r3=r2;
					 
			 System.out.println("The last digit of number "+temp +" is :"+r);
			 //swapnum = swapnum * 10 + r2;
			 while(i<=count-2) {
				 r2=r2*10;
				 
				 i++;
			 }
		 }
		 
		}
		temp=temp/10;
		
		int m =temp-r2;
		swapnum = (r1/10) +(m*10)+r3;
	
		//System.out.println(r1/10);
		//System.out.println(m);
		//System.out.println(r2);
		
		

System.out.println("Swap of First digit and last digit of number  is "+swapnum);

	

}
}
