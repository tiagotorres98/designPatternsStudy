package pattern.creational.abstractFactory;

import java.util.ArrayList;
import java.util.List;

import pattern.creational.abstractFactory.pokemon.factory.PokemonStarterHoennFactory;
import pattern.creational.abstractFactory.pokemon.factory.PokemonStarterJohtoFactory;
import pattern.creational.abstractFactory.pokemon.factory.PokemonStarterKantoFactory;

public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {
		getFactories().stream()
		.filter(p-> p.getLeague().equals(PokemonLeagueName.Hoenn))
		.forEach(f->{
			System.out.println(String.format("Pokemon League: %s", f.getLeague()));
			System.out.println(String.format("Fire Pokemon : %s", f.getFirePokemon().getClass().getSimpleName()));
			System.out.println(String.format("Water Pokemon : %s", f.getWaterPokemon().getClass().getSimpleName()));
			System.out.println(String.format("Grass Pokemon : %s", f.getGrassPokemon().getClass().getSimpleName()));
		});
	}
	
	public static List<PokemonStarterAbstractFactory> getFactories(){
		 List<PokemonStarterAbstractFactory> result = new ArrayList<>();
		 result.add(new PokemonStarterKantoFactory());
		 result.add(new PokemonStarterJohtoFactory());
		 result.add(new PokemonStarterHoennFactory());
		 return result;
	}
	
}
