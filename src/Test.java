import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static boolean isAlphaNumeric(String s) {
		return s != null && s.matches("^\\+(?:[0-9] ?){6,14}[0-9]$");
	}

	public static void main(String[] args)
	{
	
		
		try {
			Map<Integer, List<Employee>> employeeDOJMap = new HashMap<>();
			   
			
			List<Employee> list2014 = Arrays.asList(new Employee("Deborah Sprightly", 29, 9000.00));
			employeeDOJMap.put(2014, list2014);
			
			List<Employee> list2015 = Arrays.asList(new Employee("Tom Jones", 45, 7000.00),new Employee("Harry Major", 25, 10000.00));
			employeeDOJMap.put(2015, list2015);

			List<Employee> list2016 = Arrays.asList(new Employee("Ethan Hardy", 65, 8000.00),new Employee("Nancy Smith", 22, 12000.00));
			employeeDOJMap.put(2016, list2016);
			
			
			
			
		//	employeeDOJMap.computeIfAbsent(2014,empList -> new ArrayList<>()).add(new Employee("Dick Newman", 35, 10000.00));
			
			Map<Employee, String> test = new HashMap<>();

			test.put(new Employee("Dick Newman", 35, 10000.00), "X");
			test.put(new Employee("Dick Newman", 35, 10000.00), "X");
	
			
			test.forEach((key,value) -> System.out.println(key));
			
			
			Map<String,String> hasMap = new HashMap<>();
			String key ="xyz";
			
			int has = key.hashCode();
			System.out.println(has);
			int indx = has & (16-1);
			System.out.println(indx);
			
			System.out.println(has % 15);
			
			hasMap.put(key, "xyz");
			
			
			//employeeDOJMap.forEach((year,list) -> System.out.println("Year "+year +"--"+ list));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
