import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        
	       Product max = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
	       
	       System.out.println(max.price);
	       
	       Set<String> pName = productsList.stream().filter(product -> product.getPrice() > 28000).map(product -> product.name).collect(Collectors.toSet());
	       pName.forEach(System.out::println);
	        
	        
	      
	   }
}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}