package superkeyword;

public class Childclass extends Parentclass {
	
	public  void Test1() {
		
		System.out.println("the value of k is="+3);
		
		System.out.println("hello Java");
		
		super.Test1();
		
		super.Test2();
		
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Childclass obj=new Childclass();
		   
		   obj.Test1();
		   
		  
	}

}
