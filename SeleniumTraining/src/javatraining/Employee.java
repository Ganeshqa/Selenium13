package javatraining;

public class Employee {
	
	 static long empid=345;

	 static double empsalary=10500.76;
	 
	 static float emptax=(float) 10.5;
	 
	 static int empdaysofwork=24;
	 
	 public static void calculatepf() {
		 
		    float pfrate=(float)9.5;
		    
		    System.out.println("the pfrate of the employee is="+pfrate);
	 }
	 
	 public static void printsmaller() {
		 
		   int num1=50;
		   int num2=90;
		   
		   int res=(num1>num2)?num1:num2;
		   
		   System.out.println("the smaller no is="+res);
	 }


}
