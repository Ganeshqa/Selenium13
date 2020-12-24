package javatraining;

public class Return_statement {

static int i=1;
	
	public static void printmessage() {
		
		while(i<100) {
			
			System.out.println("the value of i is="+i);
			
			System.out.println("hello world");
			
			i++;
			
			if(i==10) {
				
				return; // it will exist from the method
			}
			
			  
		}
		
		  System.out.println("hello Java");
		  
		  System.out.println("hello selenium");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printmessage();
		
		System.out.println("hello UFT");

}

	
}

