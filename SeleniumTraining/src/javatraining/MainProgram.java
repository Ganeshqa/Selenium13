package javatraining;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   System.out.println("the id of the employee is="+Employee.empid);
		   
		   System.out.println("the salary of the employee is="+Employee.empsalary);
		   
		   System.out.println("the total no of working days is="+Employee.empdaysofwork);
		   
		   System.out.println("the percentage of the tax is="+Employee.emptax);
		   
		   Employee.calculatepf();
		   
		   Employee.printsmaller();
	}

}
