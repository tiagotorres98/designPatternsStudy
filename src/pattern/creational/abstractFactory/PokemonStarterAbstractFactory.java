package pattern.creational.abstractFactory;

import pattern.creational.abstractFactory.pokemon.type.FirePokemon;
import pattern.creational.abstractFactory.pokemon.type.GrassPokemon;
import pattern.creational.abstractFactory.pokemon.type.WaterPokemon;

public interface PokemonStarterAbstractFactory {

	public WaterPokemon getWaterPokemon();
	
	public FirePokemon getFirePokemon();
	
	public GrassPokemon getGrassPokemon();
	
	public PokemonLeagueName getLeague();
}
