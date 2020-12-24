package javatraining;

public class Numberchecking {

	    static int biggestno;
	
	
	public static void displaybigno(int num1,int num2,int num3) {
		
		
		       if(num1>num2) {    //10,90,80
		    	   
		    	   if(num1>num3) {
		    		   
		    		   biggestno=num1;
		    	   }
		    	   
		    	   else if(num2>num3) {
		    		   
		    		   biggestno=num2;
		    	   }
		    	   
		    	   else {
		    		   
		    		   biggestno=num3;
		    	   }
		       }
		       
		      else if(num3>num2) {
		    	  
		    	  biggestno=num3;
		      }
		       
		      else {
		    	  
		    	  biggestno=num2;
		      }
		       
		       System.out.println("the biggest no is="+biggestno);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   displaybigno(100,90,80);
		   
		   displaybigno(700,900,100);

	}

}
