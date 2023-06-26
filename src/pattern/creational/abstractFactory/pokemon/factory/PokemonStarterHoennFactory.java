package pattern.creational.abstractFactory.pokemon.factory;

import pattern.creational.abstractFactory.PokemonLeagueName;
import pattern.creational.abstractFactory.PokemonStarterAbstractFactory;
import pattern.creational.abstractFactory.pokemon.Mudkip;
import pattern.creational.abstractFactory.pokemon.Torchic;
import pattern.creational.abstractFactory.pokemon.Treecko;
import pattern.creational.abstractFactory.pokemon.type.FirePokemon;
import pattern.creational.abstractFactory.pokemon.type.GrassPokemon;
import pattern.creational.abstractFactory.pokemon.type.WaterPokemon;

public class PokemonStarterHoennFactory implements PokemonStarterAbstractFactory{

	@Override
	public WaterPokemon getWaterPokemon() {
		// TODO Auto-generated method stub
		return new Mudkip();
	}

	@Override
	public FirePokemon getFirePokemon() {
		// TODO Auto-generated method stub
		return new Torchic();
	}

	@Override
	public GrassPokemon getGrassPokemon() {
		// TODO Auto-generated method stub
		return new Treecko();
	}

	@Override
	public PokemonLeagueName getLeague() {
		// TODO Auto-generated method stub
		return PokemonLeagueName.Hoenn;
	}

}
