package javatraining;

public class Method_overload {

public static int Test(int a,int b) {
		
		int res=a+b;
		
		return res;
		

	}

public static int Test(int a,int b,int c) {
	
	int res=a+b+c;
	
	return res;
	

}
	
	public static double Test(double a,double b) {
		
		 double res=a-b;
		
	      return res;
		
	}
	
	public static String Test(String a,String b) {
		
		String res=a+b;
		
	      return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Test(90,40));
		
		System.out.println(Test(745858.45,66464.34));
		
		System.out.println(Test("hello","world"));
		
	}

}
