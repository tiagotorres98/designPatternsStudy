package pattern.structural.composite;

import java.math.BigDecimal;

public class Product extends ProductsComposite {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
