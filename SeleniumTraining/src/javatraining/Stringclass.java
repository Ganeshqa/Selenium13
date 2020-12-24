package javatraining;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String Str1="Indian";

		String str2="India";
		
		int x=Str1.compareTo(str2);
		
		System.out.println(x); */
		
		Date obj=new Date();
		
		DateFormat obj1=DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		
		   String x= obj1.format(obj);
		
		   System.out.println(x);
		  
	}

}
