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
		lista.add(new PokemonDTO("001", "Bulbasaur", 1, 0.7f, 6.9f, "Planta", "Veneno", 45, 49, 49, 65, 65, 45, "Una rara semilla fue plantada en su espalda al nacer. La planta brota y crece con este Pokemon."));
		lista.add(new PokemonDTO("002", "Ivysaur", 16, 1f, 13f, "Planta", "Veneno", 60, 62, 63, 80, 80, 60, "Cuando el bulbo de su espalda crece, parece no poder ponerse de pie sobre sus patas traseras."));
		lista.add(new PokemonDTO("003", "Venusaur", 32, 2f, 100f, "Planta", "Veneno", 80, 82, 83, 100, 100, 80, "La planta florese cuando absorbe energía solar. Está le obliga a ponerse en busca de la luz."));
		lista.add(new PokemonDTO("004", "Charmander", 1, 0.6f, 8.5f, "Fuego", 39, 52, 43, 60, 50, 65, "Prefiere los sitios calientes. Dicen que cuando llueve sale vapor de la punta de su cola."));
		lista.add(new PokemonDTO("005", "Charmeleon", 16, 1.1f, 19f, "Fuego", 58, 64, 58, 80, 65, 80, "Cuando balancea su ardiente cola , eleva la temperatura a niveles muy altos."));
		lista.add(new PokemonDTO("006", "Charizard", 36, 1.7f, 90.5f, "Fuego", "Volador", 78, 84, 78, 109, 85, 100, "Escupe fuego tan caliente que funde las rocas. Causa incendios forestales sin querer."));
		lista.add(new PokemonDTO("007", "Squirtle", 1, 0.5f, 9f, "Agua", 44, 48, 65, 50, 64, 43, "Tras nacer, su espalda se hincha y endurece como una concha. Echa potente espuma por boca."));
		lista.add(new PokemonDTO("008", "Wartortle", 16, 1f, 22.5f, "Agua", 59, 63, 80, 65, 80, 58, "Se oculta en el agua para cazar a sus presas. Al nadar rapidamente, mueve sus orejas para nivelarse."));
		lista.add(new PokemonDTO("009", "Blastoise", 36, 1.6f, 85.5f, "Agua", 79, 83, 100, 85, 105, 78, "Un brutal Pokemon con reactores de agua en su caparazon. Estos son usados para rapidos placajes."));
		lista.add(new PokemonDTO("010", "Caterpie", 1, 0.3f, 2.9f, "Bicho", 45, 30, 35, 20, 20, 45, "Sus cortas patas estan recubiertas de ventosas que le permitan subir incansable por muros y cuestas."));
		lista.add(new PokemonDTO("011", "Metapod", 7, 0.7f, 9.9f, "Bicho", 50, 20, 55, 25, 25, 30, "Este Pokemon es vulnerable al ataque cuando su concha es blanda, dejando expuesto su fragil cuerpo."));
		lista.add(new PokemonDTO("012", "Butterfree", 10, 1.1f, 32f, "Bicho", "Volador", 60, 45, 50, 90, 80, 70, "En combate, aletea a gran velocidad para lanzar al aire sus toxicos polvillos."));
		lista.add(new PokemonDTO("013", "Weedle", 1, 0.3f, 3.2f, "Bicho", "Veneno", 40, 35, 30, 20, 20, 50, "Facil de ver por los bosques comiendo hojas. Tiene un aguijon venenoso en la cabeza."));
		lista.add(new PokemonDTO("014", "Kakuna", 7, 0.6f, 10f, "Bicho", "Veneno", 45, 25, 50, 25, 25, 35, "Casi incapaz de moverse, este Pokemon solo puede endurecer su caparazon para protegerse."));
		lista.add(new PokemonDTO("015", "Beedrill", 10, 1f, 29.5f, "Bicho", "Veneno", 65, 90, 40, 45, 80, 75, "Vuelva muy deprisa y ataca con los venenosos y grandes aguijones de su cola y patas delanteras."));
		lista.add(new PokemonDTO("016", "Pidgey", 1, 0.3f, 1.8f, "Normal", "Volador", 40, 45, 40, 35, 35, 56, "Muy comun en el bosque y selvas. Aletea al nivel del suelo para levantar la gravilla."));
		lista.add(new PokemonDTO("017", "Pidgeotto", 10, 1.1f, 30f, "Normal", "Volador", 63, 60, 55, 50, 50, 71, "Muy protector de su amplio territorio, este Pokemon picoteara ferozmente a todo intruso."));
		lista.add(new PokemonDTO("018", "Pidgeot", 36, 1.5f, 39.5f, "Normal", "Volador", 83, 80, 75, 70, 70, 101, "Cuando caza, vuela muy deprisa a ras del agua, y sorprende a inocente presas como Magikarp."));
		lista.add(new PokemonDTO("019", "Rattata", 1, 0.3f, 3.5f, "Normal", 30, 56, 35, 25, 35, 72, "Cuando ataca lo muerde todo. Pequeño y muy rapido, es muy facil de ver muchos sitios."));
		lista.add(new PokemonDTO("020", "Raticate", 20, 0.7f, 18.5f, "Normal", 55, 81, 60, 50, 70, 97, "Utiliza sus bigotes para equilibrarse. Parece que si con cortados va mas despacio."));
		lista.add(new PokemonDTO("021", "Spearow", 1, 0.3f, 2f, "Normal", "Volador", 40, 60, 30, 31, 31, 70, "Come bichos en zona de hierba. Agita sus cortas alas muy rapido para mantener en el aure."));
		lista.add(new PokemonDTO("022", "Fearow", 20, 1.2f, 38f, "Normal", "Volador", 65, 90, 65, 61, 61, 100, "Con sus enormes y magnificas alas, puede seguir volando sin tener que aterrizar para descanzar."));
		lista.add(new PokemonDTO("023", "Ekans", 1, 2f, 6.9f, "Veneno", 35, 60, 44, 40, 54, 55, "Es muy silencioso y sigiloso. Come huevos de pajaros como los de Pidgey y Spearow."));
		lista.add(new PokemonDTO("024", "Arbok", 22, 3.5f, 65f, "Veneno", 60, 95, 69, 65, 79, 80, "Se dice que las feroces seniales de alerta de su panza difieren un area a otro."));
		
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
	public void crearTipoIndividual(String id, String nombre, int lv, float altura, float peso, String tipo, int hp,
			int ataque, int defensa, int atl_especial, int def_especial, int velocidad, String descripcion) {
		lista.add(new PokemonDTO(id, nombre, lv, altura, peso, tipo, hp, ataque, defensa, atl_especial, def_especial, velocidad, descripcion));
	}
	
	@Override
	public void crearTipoSecundario(String id, String nombre, int lv, float altura, float peso, String tipo, String tipo_sec,
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
