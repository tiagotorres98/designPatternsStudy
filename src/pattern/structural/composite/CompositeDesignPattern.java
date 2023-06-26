package pattern.structural.composite;

public class CompositeDesignPattern {
	
	public static void main(String[] args) {
		
		ProductBox box1 = new ProductBox();
		box1.addProducts(new Product("tshirt",new Double(801)),new Product("shoes",new Double(200)));
		
		ProductBox box2 = new ProductBox();
		box2.addProducts(new Product("tshirt2",new Double(80)),new Product("shoes2",new Double(200)));
		
		ProductBox box3 = new ProductBox();
		box3.addProducts(box1,box2,new Product("tshirt3",new Double(80)),new Product("shoes3",new Double(200)));
		
		System.out.println(box3.getPrice());
	} 

}
