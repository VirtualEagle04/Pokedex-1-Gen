package co.edu.unbosque.model;

import java.util.ArrayList;

public class PokemonDAO {
	
	private ArrayList<PokemonDTO> lista;
	
	public PokemonDAO() {
		lista = new ArrayList<PokemonDTO>();
	}

	public PokemonDAO(ArrayList<PokemonDTO> lista) {
		super();
		this.lista = lista;
	}

	public ArrayList<PokemonDTO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<PokemonDTO> lista) {
		this.lista = lista;
	}
	
	
}
