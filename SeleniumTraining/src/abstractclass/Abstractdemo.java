package abstractclass;

public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Iphone obj=new Iphone();
		 
		 obj.calling();
		 obj.sms();
		 obj.music();
		 obj.cameria();
	}

}


abstract class Nokiaphone {
	
	public  void calling() {
		
		System.out.println("i can make a calls from nokia");
	}
	
	public abstract void sms();
	
	public abstract void cameria();
	
	public abstract void music();
}


abstract class Samsung extends Nokiaphone {
	
	public  void sms() {
		
		System.out.println("i can send sms from samsung");
		
	
		}
	
    public abstract void cameria();
	
	public abstract void music();
	
}
	
 class Iphone extends Samsung {   // concrete class
	  
	  public void cameria() {
		  
		  System.out.println("i can take pics from iphone");
	  }
	  
	  public void music() {
		  
		  System.out.println("i can play music from iphone");
		  
	  }
	  
  
}
  