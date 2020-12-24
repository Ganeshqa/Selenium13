package javatraining;

public class Arthimatic_operations {
	
	//declaring the variables in a class
	
	protected static  int a=50; // instance variable or Global variable which is accessiable all the methods in a class and also outside the class based on access modifier
	
	protected static int b=90;
	
	protected static int res;
	
	//implementing the methods in a class
	
	protected static void add() { 
		
		res=a+b;
		
		System.out.println("the addition of two no is="+res);
	
	}
	
	public static  void sub() {
		
		a=80;
		
		res=a-b;
		
		System.out.println("the substraction of two no is="+res);
		
	}
	
	public static void mul() {
		
		res=a*b;
		
		System.out.println("the multiplication of two no is="+res);
	}
	
	public static  void div() {
		
		  // declaring the variable inside the method is called as local variable
		
		int e=60;
		
		int f=6;
		
		int d=e/f;
		
		System.out.println("the division of two no is="+d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   add();
		   
		   sub();
		   
		   mul();
		   
		   div();
	}

}
