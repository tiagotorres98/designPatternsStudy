package builder;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrazilianHotDogBuilder builder = new BrazilianHotDogBuilder();
		BrazilianHotDog hotDog = builder
				.mayonnaise()
				.sausage()
				.sausage()
				.mashedPotato()
				.shoestringPotatoes()
				.ketchup()
				.mustard()
				.vinaigrette()
				.build();
		
		System.out.println(hotDog);
	}

}
