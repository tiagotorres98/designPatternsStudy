package pattern.structural.decorator;

public class Pants extends ClothesDecorator {

	Pants(IClothes clothes) {
		super(clothes);
	}
	
	@Override
	public void wear() {
		System.out.println("Wearing now Pants");
		clothes.wear();
	}

}
