package whileloop;

import java.util.Scanner;

public class OnesComplementOfBinary {
public static void printOneComp(String bn) {
	int one[] = new int[8];
	for(int i=0;i<=bn.length()-1;i++) {
		if(bn.charAt(i) == 1) {
			one[i]=0;
		}else if(bn.charAt(i)== 0) {
			one[i]=1;
		}
		System.out.print(one[i]);
	}
	
	//System.out.println("Ones complement is "+one);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a binary number to get one's complement ");
		String bn=sc.next();
		printOneComp(bn);
	}

}
