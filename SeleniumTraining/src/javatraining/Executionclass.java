package javatraining;

public class Executionclass implements Sampleprogram {
	
	    double radius=4.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   Executionclass obj=new Executionclass();
		   
		   System.out.println(obj.calculatearea());
		   
		   System.out.println(obj.calculatevolume());
	}
	
	    

	@Override
	public double calculatearea() {
		// TODO Auto-generated method stub
		 
		 double val1=radius*radius;
		 
		     return val1;
	}

	@Override
	public double calculatevolume() {
		// TODO Auto-generated method stub
		
		 double val2=radius*radius*radius;
				 
				 return val2;
	}



}
