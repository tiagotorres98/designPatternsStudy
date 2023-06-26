package pattern.structural.decorator;

public class Tshirt extends ClothesDecorator {

	Tshirt(IClothes clothes) {
		super(clothes);
	}
	
	@Override
	public void wear() {
		System.out.println("Wearing now T-shirt");
		clothes.wear();
	}

}
