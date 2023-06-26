package pattern.structural.decorator;

public class Gloves extends ClothesDecorator {

	Gloves(IClothes clothes) {
		super(clothes);
	}
	
	@Override
	public void wear() {
		System.out.println("Wearing now Gloves");
		clothes.wear();
	}

}
