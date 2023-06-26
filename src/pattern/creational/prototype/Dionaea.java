package pattern.creational.prototype;

public class Dionaea extends CarnivorousPlant {

	@Override
	public CarnivorousPlant clone() {
		Dionaea clone = new Dionaea();
		clone.setColor(this.getColor());
		return clone;
	}

}
