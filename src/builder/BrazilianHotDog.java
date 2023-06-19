package builder;

import java.util.ArrayList;
import java.util.List;

public class BrazilianHotDog {

	private  Boolean ketchup;
	private  Boolean mustard;
	private  Boolean mayonnaise;
	private  Boolean mashedPotato;
	private  Boolean shoestringPotatoes;
	private  Boolean specialSauce;
	private  Boolean vinaigrette;
	private  Boolean corn;
	private  Boolean pea;
	private  Boolean barbecueSauce;
	private  Boolean garlicSauce;
	private  Boolean egg;
	private  Boolean houseSauce;
	private  Boolean greenSauce;
	private List<Sausage> sausage = new ArrayList<Sausage>();

	public BrazilianHotDog() {}

	public BrazilianHotDog(Boolean ketchup, Boolean mustard, Boolean mayonnaise, Boolean mashedPotato,
			Boolean shoestringPotatoes, Boolean specialSauce, Boolean vinaigrette, Boolean corn, Boolean pea,
			Boolean barbecueSauce, Boolean garlicSauce, Boolean egg, Boolean houseSauce, Boolean greenSauce,
			List<Sausage> sausage) {
		this.ketchup = ketchup;
		this.mustard = mustard;
		this.mayonnaise = mayonnaise;
		this.mashedPotato = mashedPotato;
		this.shoestringPotatoes = shoestringPotatoes;
		this.specialSauce = specialSauce;
		this.vinaigrette = vinaigrette;
		this.corn = corn;
		this.pea = pea;
		this.barbecueSauce = barbecueSauce;
		this.garlicSauce = garlicSauce;
		this.egg = egg;
		this.houseSauce = houseSauce;
		this.greenSauce = greenSauce;
		this.sausage = sausage;
	}

	@Override
	public String toString() {
		return "BrazilianHotDog [ketchup=" + ketchup + ", mustard=" + mustard + ", mayonnaise=" + mayonnaise
				+ ", mashedPotato=" + mashedPotato + ", shoestringPotatoes=" + shoestringPotatoes + ", specialSauce="
				+ specialSauce + ", vinaigrette=" + vinaigrette + ", corn=" + corn + ", pea=" + pea + ", barbecueSauce="
				+ barbecueSauce + ", garlicSauce=" + garlicSauce + ", egg=" + egg + ", houseSauce=" + houseSauce
				+ ", greenSauce=" + greenSauce + ", sausages=" + sausage.size() + "]";
	}

	public Boolean getKetchup() {
		return ketchup;
	}

	public void setKetchup(Boolean ketchup) {
		this.ketchup = ketchup;
	}

	public Boolean getMustard() {
		return mustard;
	}

	public void setMustard(Boolean mustard) {
		this.mustard = mustard;
	}

	public Boolean getMayonnaise() {
		return mayonnaise;
	}

	public void setMayonnaise(Boolean mayonnaise) {
		this.mayonnaise = mayonnaise;
	}

	public Boolean getMashedPotato() {
		return mashedPotato;
	}

	public void setMashedPotato(Boolean mashedPotato) {
		this.mashedPotato = mashedPotato;
	}

	public Boolean getShoestringPotatoes() {
		return shoestringPotatoes;
	}

	public void setShoestringPotatoes(Boolean shoestringPotatoes) {
		this.shoestringPotatoes = shoestringPotatoes;
	}

	public Boolean getSpecialSauce() {
		return specialSauce;
	}

	public void setSpecialSauce(Boolean specialSauce) {
		this.specialSauce = specialSauce;
	}

	public Boolean getVinaigrette() {
		return vinaigrette;
	}

	public void setVinaigrette(Boolean vinaigrette) {
		this.vinaigrette = vinaigrette;
	}

	public Boolean getCorn() {
		return corn;
	}

	public void setCorn(Boolean corn) {
		this.corn = corn;
	}

	public Boolean getPea() {
		return pea;
	}

	public void setPea(Boolean pea) {
		this.pea = pea;
	}

	public Boolean getBarbecueSauce() {
		return barbecueSauce;
	}

	public void setBarbecueSauce(Boolean barbecueSauce) {
		this.barbecueSauce = barbecueSauce;
	}

	public Boolean getGarlicSauce() {
		return garlicSauce;
	}

	public void setGarlicSauce(Boolean garlicSauce) {
		this.garlicSauce = garlicSauce;
	}

	public Boolean getEgg() {
		return egg;
	}

	public void setEgg(Boolean egg) {
		this.egg = egg;
	}

	public Boolean getHouseSauce() {
		return houseSauce;
	}

	public void setHouseSauce(Boolean houseSauce) {
		this.houseSauce = houseSauce;
	}

	public Boolean getGreenSauce() {
		return greenSauce;
	}

	public void setGreenSauce(Boolean greenSauce) {
		this.greenSauce = greenSauce;
	}

	public List<Sausage> getSausage() {
		return sausage;
	}

	public void setSausage(List<Sausage> sausage) {
		this.sausage = sausage;
	}
	
	
}
