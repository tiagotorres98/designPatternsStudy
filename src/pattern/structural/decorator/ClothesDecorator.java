package pattern.structural.decorator;

public class ClothesDecorator implements IClothes {

	protected IClothes clothes;
	
	ClothesDecorator(IClothes clothes){
		this.clothes = clothes;
	}
	
	@Override
	public void wear() {
		// TODO Auto-generated method stub
		clothes.wear();
	}

}
