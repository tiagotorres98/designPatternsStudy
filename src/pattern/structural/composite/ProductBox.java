package pattern.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductBox extends ProductsComposite {

	private List<ProductsComposite> children = new ArrayList<ProductsComposite>();
	
	public void addProducts(ProductsComposite... product) {
		children.addAll(Arrays.asList(product));
	}
	
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		Double result = new Double(0);
		for(ProductsComposite product: children) {
			result += product.getPrice();
		}
		return result;
	}

}
