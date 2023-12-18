package forPattern;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=7;i++) {
	for(int j=1;j<=i; j++) {
		for(int k = 1;k<=i;k++) {
			System.out.print(" ");
			if((i==1 && j==4)) {
				System.out.print('*');
			}
			if((i==2 && i==3)|| (i==2 && i== 5)){
				System.out.print('*');
			}
		}
		
	}
System.out.println();	
}
	}

}
