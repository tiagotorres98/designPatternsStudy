package pattern.structural.decorator;

public class DecoratorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		Tshirt tshirt = new Tshirt(p);
		Pants pants = new Pants(tshirt);
		Gloves glove = new Gloves(pants);
		Tennis tennis = new Tennis(glove);
		
		tennis.wear();
	}

}
