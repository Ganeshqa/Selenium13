package encapsulaton;

public class Empclass {
	
	private int empid; // Global variable
	
	private String empname;
	
	//setter method is used for to set the values to private properties
	
	public void setempid(int lempid) {
		
		 this.empid=lempid; // this keyword it will convert the instance variable to local variable
	}
	
	public void setempname(String lempname) {
		
		this.empname=lempname;
	}
	
	// getter method is used to get the values from private properties
	
	public int getempid() {
		
		return empid;
	}
	
	public String getempname() {
		
		return empname;
	}

}
