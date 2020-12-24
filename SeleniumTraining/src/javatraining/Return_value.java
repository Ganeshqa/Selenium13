package javatraining;

public class Return_value {
	
public static int add(int a,int b) {
		
		int res=a+b;
		
		return res;
		

	}
	
	public static double sub(double a,double b) {
		
		 double res=a-b;
		
	      return res;
		
	}
	
	public static String mul(String a,String b) {
		
		String res=a+b;
		
	      return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(90,40));
		
		System.out.println(sub(745858.45,66464.34));
		
		System.out.println(mul("hello","world"));
		
	}

}
