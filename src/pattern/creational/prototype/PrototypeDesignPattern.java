package pattern.creational.prototype;

public class PrototypeDesignPattern {

	public static void main(String[] args) {
	
		CarnivorousPlant plant1 = new Dionaea();
		plant1.setColor("Green");
		
		plant1.printColor();
		
		CarnivorousPlant plant1Clone = plant1.clone();
		plant1Clone.setColor("Blue");
		
		plant1.printColor();
		plant1Clone.printColor();
		

	}
	
}
