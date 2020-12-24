package javatraining;

public class Continue_statament {
	
	public static void printmessage() {
		
		for(int i=0;i<20;i++) {
			
			if(i==15) {
				
				continue;
			}
			
			System.out.println("the value of i is="+i);
			
			System.out.println("hello world");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 printmessage();
	}
	

}
