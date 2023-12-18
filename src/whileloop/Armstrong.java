//30. Write a Java program to check whether a number is Armstrong number or not.
package whileloop;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number (Maximum of 3 digit)I will tell you it is Armstrong number or not ");
			int n = sc.nextInt();
			int temp = n;
			int r=0;
			int sum =0;
			while(n!=0) {
				r = n%10;
				sum += (r*r*r);
				n=n/10;
			}
			if(temp == sum) {
				System.out.println("Number "+temp+" is an Armstrong number ");
			}else {
				System.out.println("Number "+temp+" is not an Armstrong number ");
			}
		}
	}

}
