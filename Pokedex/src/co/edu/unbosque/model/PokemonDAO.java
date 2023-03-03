package co.edu.unbosque.model;

import java.util.ArrayList;

public class PokemonDAO extends OperacionesDAO{
	
	private ArrayList<PokemonDTO> lista;
	
	public PokemonDAO() {
		lista = new ArrayList<PokemonDTO>();
		/**
		 * Aqui se empieza a crear los Pokemones predefinidos
		 * ej: 
		 */
		lista.add(new PokemonDTO(001, "Bulbasaur", 1, 0.7f, 6.9f, "Planta", "Veneno", 45, 49, 49, 65, 65, 45, "Una rara semilla fue plantada en su espalda al nacer. La planta brota y crece con este Pokémon."));
		
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
	
	//Funciones CRUD

	@Override
	public void crearTipoIndividual(int id, String nombre, int lv, float altura, float peso, String tipo, int hp,
			int ataque, int defensa, int atl_especial, int def_especial, int velocidad, String descripcion) {
		lista.add(new PokemonDTO(id, nombre, lv, altura, peso, tipo, hp, ataque, defensa, atl_especial, def_especial, velocidad, descripcion));
	}
	
	@Override
	public void crearTipoSecundario(int id, String nombre, int lv, float altura, float peso, String tipo, String tipo_sec,
			int hp, int ataque, int defensa, int atk_especial, int def_especial, int velocidad, String descripcion) {
		lista.add(new PokemonDTO(id, nombre, lv, altura, peso, tipo, tipo_sec, hp, ataque, defensa, atk_especial, def_especial, velocidad, descripcion));
		
	}
	
	@Override
	public boolean eliminarIndex(int del_index){
		try{
			lista.remove(del_index);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
}
