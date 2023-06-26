package pattern.creational.abstractFactory.pokemon.factory;

import pattern.creational.abstractFactory.PokemonLeagueName;
import pattern.creational.abstractFactory.PokemonStarterAbstractFactory;
import pattern.creational.abstractFactory.pokemon.Chikorita;
import pattern.creational.abstractFactory.pokemon.Cyndaquil;
import pattern.creational.abstractFactory.pokemon.Totodile;
import pattern.creational.abstractFactory.pokemon.type.FirePokemon;
import pattern.creational.abstractFactory.pokemon.type.GrassPokemon;
import pattern.creational.abstractFactory.pokemon.type.WaterPokemon;

public class PokemonStarterJohtoFactory implements PokemonStarterAbstractFactory{

	@Override
	public WaterPokemon getWaterPokemon() {
		// TODO Auto-generated method stub
		return new Totodile();
	}

	@Override
	public FirePokemon getFirePokemon() {
		// TODO Auto-generated method stub
		return new Cyndaquil();
	}

	@Override
	public GrassPokemon getGrassPokemon() {
		// TODO Auto-generated method stub
		return new Chikorita();
	}

	@Override
	public PokemonLeagueName getLeague() {
		// TODO Auto-generated method stub
		return PokemonLeagueName.Johto;
	}

}
