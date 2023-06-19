package builder;

import java.util.ArrayList;
import java.util.List;

public class BrazilianHotDogBuilder {

	private Boolean putKetchup = Boolean.FALSE;
	private Boolean putMustard = Boolean.FALSE;
	private Boolean putMayonnaise = Boolean.FALSE;
	private Boolean putMashedPotato = Boolean.FALSE;
	private Boolean putShoestringPotatoes = Boolean.FALSE;
	private Boolean putSpecialSauce = Boolean.FALSE;
	private Boolean putVinaigrette = Boolean.FALSE;
	private Boolean putCorn = Boolean.FALSE;
	private Boolean putPea = Boolean.FALSE;
	private Boolean putBarbecueSauce = Boolean.FALSE;
	private Boolean putGarlicSauce = Boolean.FALSE;
	private Boolean putEgg = Boolean.FALSE;
	private Boolean putHouseSauce = Boolean.FALSE;
	private Boolean putGreenSauce = Boolean.FALSE;
	private List<Sausage> putSausage = new ArrayList<Sausage>();

	public BrazilianHotDogBuilder sausage() {
		this.putSausage.add(new Sausage());
		return this;
	}
	
	public BrazilianHotDogBuilder ketchup() {
		this.putKetchup = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder mustard() {
		this.putMustard = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder mayonnaise() {
		this.putMayonnaise = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder mashedPotato() {
		this.putMashedPotato = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder shoestringPotatoes() {
		this.putShoestringPotatoes = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder specialSauce() {
		this.putSpecialSauce = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder vinaigrette() {
		this.putVinaigrette = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder corn() {
		this.putCorn = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder pea() {
		this.putPea = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder barbecueSauce() {
		this.putBarbecueSauce = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder garlicSauce() {
		this.putGarlicSauce = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder egg() {
		this.putEgg = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder houseSauce() {
		this.putHouseSauce = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDogBuilder greenSauce() {
		this.putGreenSauce = Boolean.TRUE;
		return this;
	}

	public BrazilianHotDog build() {
		BrazilianHotDog hotDog = new BrazilianHotDog();
		hotDog.setMayonnaise(putMayonnaise);
		hotDog.getSausage().addAll(putSausage);
		hotDog.setMashedPotato(putMashedPotato);
		hotDog.setKetchup(putKetchup);
		hotDog.setMustard(putMustard);
		hotDog.setShoestringPotatoes(putShoestringPotatoes);
		hotDog.setSpecialSauce(putSpecialSauce);
		hotDog.setVinaigrette(putVinaigrette);
		hotDog.setCorn(putCorn);
		hotDog.setPea(putPea);
		hotDog.setBarbecueSauce(putBarbecueSauce);
		hotDog.setGarlicSauce(putGarlicSauce);
		hotDog.setEgg(putEgg);
		hotDog.setHouseSauce(putHouseSauce);
		hotDog.setGreenSauce(putGreenSauce);
		return hotDog;
	}

}
