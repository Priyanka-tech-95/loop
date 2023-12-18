package forPattern;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			
	    	 
	    	  for(int s = 1;s<=(5-i);s++) {
					 System.out.print(" ");
				 }
	    	  for(int j = 1; j<=i;j++) {
	    		  System.out.print('*');
	    	  }
	    	  for(int j = 1; j<=i;j++) {
	    		  System.out.print('*');
	    	  }
	    	 
	    	  System.out.println();
	      }
		for(int i = 1;i<=5;i++) {
			
	    	 
				 
	    	  for(int s = 1;s<=(i-1);s++) {
					 System.out.print(" ");
				 }
	    	  for(int j = 5; j>=i;j--) {
	    		  System.out.print('*');
	    	  }
	    	  for(int j = 5; j>=i;j--) {
	    		  System.out.print('*');
	    	  }
	    	 
	    	  System.out.println();
	      }
		
		
	}

}
