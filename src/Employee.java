import java.text.DecimalFormat;

public class Employee implements Comparable<Employee> {
  private String name;
  private Integer age;
  private Double salary;
  public Employee(String name, Integer age, Double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
  
  
  public Employee( Integer age) {
	    this.age = age;

	  }
  
  @Override
  public int compareTo(Employee e) {
	  if( this.getAge() > e.getAge())
		  return 1;
	  else if(e.getAge() == this.getAge())
		  return 0;
	  else return 1;
  }
  public int getAge() {
	  return this.age;
  }
  public String toString(){
    DecimalFormat dformat = new DecimalFormat(".##");
    return "Employee Name:"+this.name
        +"  Age:"+this.age
        +"  Salary:"+dformat.format(this.salary);
  }
//getters and setters for name, age and salary go here
//standard equals() and hashcode() code go here
}