import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddSubtractDateDays {
	
	public static void main(String[] args) throws Exception {
		 
	/*regorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -20);
		System.out.println(cal.getTime());*/
		
	
		/*  final String TIME24HOURS_PATTERN =   "([01]?[0-9]|2[0-3]):[0-5][0-9]";
		  
		  Pattern pattern = Pattern.compile(TIME24HOURS_PATTERN);
		  Matcher matcher = pattern.matcher("23:30");
		  System.out.println(matcher.matches());
		  
		  
		  Calendar cal = Calendar.getInstance();  

	        cal.set(Calendar.YEAR, 0);  
	        cal.set(Calendar.MONTH, 0);  
	        cal.set(Calendar.DATE, 0);  
	        
	  
		  
		  System.out.println(cal.getTime());
		  
		  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		  //String dateString = format.format( new Date()   );
		  Date   date       = format.parse ( "0000-00-00 00:00"); 
	
		  
		  System.out.println(date);
		  
		  String str ="IM20170614SE021007899601";
		  
		  String value = str.substring(22,str.length());
		  System.out.println(value);
		
		  Pattern pattern1 = Pattern.compile(".*[^0-9].*");
	       //Pattern pattern = Pattern.compile(".*\\D.*");
	       String [] inputs = {"123", "-123" , "123.12", "abcd123"};
	     
	       for(String input: inputs){
	           System.out.println( "does " + input + " is number : "
	                                + !pattern1.matcher(input).matches());
	       }*/

		
		
		String str ="65560606054";
		System.out.println(str.substring(1));
		
		

		String date1 ="2008-01-04";
		String pattern ="yyyyMMdd";
		Date formatedDate = new SimpleDateFormat("ddMMyyyy").parse(date1);
		String d = new SimpleDateFormat(pattern).format(formatedDate);
		
		System.out.println(d);
		
		  
		  
		  
	}

		 
		 

	      
		 
		 
		
 
    

}
