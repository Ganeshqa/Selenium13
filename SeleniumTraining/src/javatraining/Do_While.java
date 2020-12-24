package javatraining;

public class Do_While extends Arthimatic_operations {
	
	  static int i=20;
	  
	  public static void printmessage() {
		  
		  do {
			  
			  System.out.println("the value of i is="+i);
			  
			  System.out.println("hello world");
		  
			  i++; //21
			  
		  } while(i<20);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 printmessage();
		 
		 add();
		 
	}
	

}
