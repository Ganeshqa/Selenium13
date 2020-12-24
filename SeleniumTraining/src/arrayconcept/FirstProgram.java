package arrayconcept;

import javatraining.*;

public class FirstProgram extends Arthimatic_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
/* call the variable and methods implement in Arthimatic_operations class into Firstprogram class under arrayconcept package
 *
 *  step1: we can call the variables & methods from one class to another class by creating instance object.
 *  
 *  step2: we can create instance object by using contructor
 *  
 *  step3: constructor name and class name should be same.
 * 
 
 Note1: if variable and methods are non static then we need to create instance object of class to access from one class to another class */
 

		  Arthimatic_operations obj=new Arthimatic_operations();
		  
		  obj.a=300; // reference variable
		  obj.b=500;
		  
		  obj.add();
		  obj.sub();
		  obj.div();
		  obj.mul(); 
		  
		  
/* if variable and methods are static then no need to create instance object we can access directly with the classname.
 * 
 */
		  Arthimatic_operations.a=900;
		  Arthimatic_operations.b=700;
		  Arthimatic_operations.add();
		  Arthimatic_operations.sub();
		  Arthimatic_operations.mul();
		  Arthimatic_operations.div(); 
		
	}
}
