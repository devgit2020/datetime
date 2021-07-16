import java.util.Arrays;
import java.util.List;
import java.util.Collections;



public class HashmapTest {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(10),new Employee(25),new Employee(18));
		
		Collections.sort(list);
		
		list.forEach(data -> System.out.println(data.getAge()));
		

	}

}
