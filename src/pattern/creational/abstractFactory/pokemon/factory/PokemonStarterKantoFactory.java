package pattern.creational.abstractFactory.pokemon.factory;

import pattern.creational.abstractFactory.PokemonLeagueName;
import pattern.creational.abstractFactory.PokemonStarterAbstractFactory;
import pattern.creational.abstractFactory.pokemon.Bulbasaur;
import pattern.creational.abstractFactory.pokemon.Charmander;
import pattern.creational.abstractFactory.pokemon.Squirtle;
import pattern.creational.abstractFactory.pokemon.type.FirePokemon;
import pattern.creational.abstractFactory.pokemon.type.GrassPokemon;
import pattern.creational.abstractFactory.pokemon.type.WaterPokemon;

public class PokemonStarterKantoFactory implements PokemonStarterAbstractFactory{

	@Override
	public WaterPokemon getWaterPokemon() {
		// TODO Auto-generated method stub
		return new Squirtle();
	}

	@Override
	public FirePokemon getFirePokemon() {
		// TODO Auto-generated method stub
		return new Charmander();
	}

	@Override
	public GrassPokemon getGrassPokemon() {
		// TODO Auto-generated method stub
		return new Bulbasaur();
	}

	@Override
	public PokemonLeagueName getLeague() {
		// TODO Auto-generated method stub
		return PokemonLeagueName.Kanto;
	}

}
