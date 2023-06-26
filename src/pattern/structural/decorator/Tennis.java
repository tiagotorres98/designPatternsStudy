package pattern.structural.decorator;

public class Tennis extends ClothesDecorator {

	Tennis(IClothes clothes) {
		super(clothes);
	}
	
	@Override
	public void wear() {
		System.out.println("Wearing now Pants");
		clothes.wear();
	}

}
