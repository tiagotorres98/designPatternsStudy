package pattern.creational.prototype;

public abstract class CarnivorousPlant {

	private String color;
	
	public abstract CarnivorousPlant clone();
	
	public void printColor() {
		System.out.println(color);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
