package pattern.creational.prototype;

class Nepenthes extends CarnivorousPlant {

	@Override
	public CarnivorousPlant clone() {
		Nepenthes clone = new Nepenthes();
		clone.setColor(this.getColor());
		return clone;
	}

}
