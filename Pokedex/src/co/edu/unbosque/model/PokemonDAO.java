package co.edu.unbosque.model;

import java.util.ArrayList;

public class PokemonDAO {
	
	private ArrayList<PokemonDTO> lista;
	
	public PokemonDAO() {
		lista = new ArrayList<PokemonDTO>();
		/**
		 * Aqui se empieza a crear los Pokemones predefinidos
		 * ej: 
		 */
		lista.add(new PokemonDTO(001, "Bulbasaur", 0.7f, 6.9f, "Planta", "Veneno", 22, 10, 13, 13, 13, 11, "Una rara semilla fue plantada en su espalda al nacer. La planta brota y crece con este Pokémon."));
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

	public void crearTipoSecundario(int id, String nombre, float altura, float peso, String tipo, String tipo_sec,
	int hp, int ataque, int defensa, int atk_especial, int def_especial, int velocidad, String descripcion){
		lista.add(new PokemonDTO(id, nombre, altura, peso, tipo, tipo_sec, hp, ataque, defensa, atk_especial, def_especial, velocidad, descripcion));
	}
	
	public void crearTipoIndividual(int id, String nombre, float altura, float peso, String tipo, int hp,
	int ataque, int defensa, int atl_especial, int def_especial, int velocidad, String descripcion) {
		lista.add(new PokemonDTO(id, nombre, altura, peso, tipo, hp, ataque, defensa, atl_especial, def_especial, velocidad, descripcion));
	}

	public boolean eliminarNombre(String del_nombre){
		try{
			for (int i = 0; i < lista.size(); i++){
				if(lista.get(i).getNombre().equalsIgnoreCase(del_nombre)){
					lista.remove(i);
					return true;
				}
			}
		}catch (Exception e){
			return false;
		}
		return false;
	}

	public boolean eliminarIndex(int del_index){
		try{
			lista.remove(del_index);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	
	
}
