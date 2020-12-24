package javatraining;

public class While_statement {

	
	static int i=1;
	
	public static void printmessage() {
		
		while(i<100) {
			
			System.out.println("the value of i is="+i);
			
			System.out.println("hello world");
			
			i++;
			
			if(i==10) {
				
				break;
			}
			
			  
		}
		
		  System.out.println("hello Java");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printmessage();

}

	
}