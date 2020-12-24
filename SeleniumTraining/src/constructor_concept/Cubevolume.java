package constructor_concept;

public class Cubevolume {
	
	   int length;
	   int breadth;
	   int height;
	   
	   public int getcubevolume() {
		   
		   return(length*breadth*height);
	   }
	   
	   // default constructor
	   
	   public Cubevolume() {
		   
		   length=50;
		   breadth=60;
		   height=70;
	   }

	   public Cubevolume(int l,int b,int h) {  // constructor overload
		   
		   this.length=l;
		   this.breadth=b;
		   this.height=h;
		   
	   }
	   
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			Cubevolume obj1=new Cubevolume();
			
			System.out.println(obj1.getcubevolume());
			
			
	       Cubevolume obj2=new Cubevolume(90,90,90);
			
			System.out.println(obj2.getcubevolume());
			
			  Cubevolume obj3=new Cubevolume(90,90,100);
				
				System.out.println(obj3.getcubevolume());
				
				  Cubevolume obj4=new Cubevolume(90,80,900);
					
					System.out.println(obj4.getcubevolume());
		}
}
