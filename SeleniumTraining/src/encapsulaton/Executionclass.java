package encapsulaton;

public class Executionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Empclass emp1=new Empclass();
		 
		 emp1.setempid(101);
		 emp1.setempname("samuel");
	
		 System.out.println(emp1.getempid());
		 
		 System.out.println(emp1.getempname());
		 
		 
		 
        Empclass emp2=new Empclass();
		 
		 emp2.setempid(102);
		 emp2.setempname("John");
	
		 System.out.println(emp2.getempid());
		 
		 System.out.println(emp2.getempname());
		 
		 
	}

}
