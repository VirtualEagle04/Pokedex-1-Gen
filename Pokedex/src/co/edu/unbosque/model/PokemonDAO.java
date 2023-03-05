package co.edu.unbosque.model;

import java.util.ArrayList;

public class PokemonDAO extends OperacionesDAO {

	private ArrayList<PokemonDTO> lista;

	public PokemonDAO() {
		lista = new ArrayList<PokemonDTO>();
		/**
		 * Aqui se empieza a crear los Pokemones predefinidos ej:
		 */

		lista.add(new PokemonDTO("076", "Golem", 32, 1.4f, 300f, "Roca", "Tierra", 80, 120, 130, 55, 65, 45,
				"Su cuerpo rocoso, es super duro. Soporta las explosiones de dinamita sin sufrir danio."));
		lista.add(new PokemonDTO("077", "Ponyta", 5, 1.0f, 30f, "Fuego", 50, 85, 55, 65, 65, 90,
				"Sus cascos son 10 veces mas duros que el diamante. Puede pisotear cualquier cosa en poco tiempo."));
		lista.add(new PokemonDTO("078", "Rapidash", 40, 1.7f, 95f, "Fuego", 65, 100, 70, 80, 80, 105,
				"Muy competitivo, este Pokemon perseguira a todo lo que se mueva rapido, esperando ganarle."));
		lista.add(new PokemonDTO("079", "Slowpoke", 5, 1.2f, 36f, "Agua", "Psiquico", 90, 65, 65, 40, 40, 15,
				"Increiblemente lento y torpe. Tardara 5 segundos en sentir dolor si es atacado."));
		lista.add(new PokemonDTO("080", "Slowbro", 37, 1.6f, 78.5f, "Agua", "Psiquico", 95, 75, 110, 100, 80, 30,
				"Dicen que el Shellder pegado a la cola de Slowpoke se nutre de los residuos del anfitrion."));
		lista.add(new PokemonDTO("081", "Magnemite", 5, 0.3f, 6f, "Electrico", "Acero", 25, 35, 70, 95, 55, 45,
				"Anula la gravedad para mantenerse en el aire. Sin previo aviso usa la ondatrueno y parecidos."));
		lista.add(new PokemonDTO("082", "Magneton", 30, 1f, 60f, "Electrico", "Acero", 50, 60, 95, 120, 70, 70,
				"Estan formados por Magnemite unidos. Suelen aparecer cuando arden las manchas solares."));
		lista.add(new PokemonDTO("083", "Farfetch'd", 5, 0.8f, 15f, "Normal", "Volador", 52, 90, 55, 58, 62, 60,
				"La ramita de cebollas verdes que lleva es su arma. Suele usarla como una espada."));
		lista.add(new PokemonDTO("084", "Doduo", 5, 1.4f, 39.2f, "Normal", "Volador", 35, 85, 45, 35, 35, 75,
				"Un pajaro que compensa su pobre vuelo caminando muy rapidamente. Deja enormes huellas."));
		lista.add(new PokemonDTO("085", "Dodrio", 31, 1.8f, 85.2f, "Normal", "Volador", 60, 110, 70, 60, 60, 110,
				"Para tramar sus planes usa sus tres cerebros. Cuando 2 cabezas duermen, la otra sigue despierta."));
		lista.add(new PokemonDTO("086", "Seel", 5, 1.1f, 90f, "Agua", 65, 45, 55, 45, 70, 45,
				"El cuerno que sobresale de su cabeza es muy duro. Suele usarlo para romper el hielo."));
		lista.add(new PokemonDTO("087", "Dewgong", 34, 1.7f, 120f, "Agua", "Hielo", 90, 70, 80, 70, 95, 70,
				"Guarda energia termica en su cuerpo. Nada a 8 nudos sin parar hasta en aguas muy frias."));
		lista.add(new PokemonDTO("088", "Grimer", 5, 0.9f, 30f, "Veneno", 80, 80, 50, 40, 50, 25,
				"Aparece en zonas asquerosas. Crece absorbiendo los residuos toxicos expulsados por las fabricas."));
		lista.add(new PokemonDTO("089", "Muk", 38, 1.2f, 30f, "Veneno", 105, 105, 75, 65, 100, 50,
				"Esta cubierto por un repugnante lodo. Es tan toxico que hasta sus huellas son venenosas."));
		lista.add(new PokemonDTO("090", "Shellder", 5, 0.3f, 4f, "Agua", 30, 65, 100, 45, 25, 40,
				"Su caparazon repele cualquier tipo de ataque. Solo cuando abre su caparazon es vulnerable."));
		lista.add(new PokemonDTO("091", "Cloyster", 32, 1.5f, 132.5f, "Agua", "Hielo", 50, 95, 180, 85, 45, 70,
				"Cuando es atacado lanza sus cuernos con gran rapidez. Sus entrañas jamás han sido vistas."));
		lista.add(new PokemonDTO("092", "Gastly", 5, 1.3f, 0.1f, "Fastasma", "Veneno", 30, 35, 30, 100, 35, 80,
				"Casi invisible, este gaseoso Pokemon cubre al enemigo y lo adormece sin previo aviso."));
		lista.add(new PokemonDTO("093", "Haunter", 25, 1.6f, 0.1f, "Fantasma", "Veneno", 45, 50, 45, 115, 55, 95,
				"Por su habilidad para atravesar muros de piedra, se dice que viene de otra dimension."));
		lista.add(new PokemonDTO("094", "Gengar", 32, 1.5f, 40.5f, "Fantasma", "Veneno", 60, 65, 60, 130, 75, 110,
				"En luna llena, a este Pokemon le gusta imitar las sombras de la gente y burlarse de sus miedos."));
		lista.add(new PokemonDTO("095", "Onix", 5, 8.8f, 210f, "Roca", "Tierra", 35, 45, 160, 30, 45, 70,
				"Cuando crece, las partes rocosas de su cuerpo se endurecen. Acaba pareciendose a un diamante negro."));
		lista.add(new PokemonDTO("096", "Drowzee", 5, 1f, 32.4f, "Psiquico", 60, 48, 45, 43, 90, 42,
				"Adormece a sus enemigos y se come sus sueños. A veces se pone enfermo si come pesadillas."));
		lista.add(new PokemonDTO("097", "Hypno", 26, 1.6f, 75.6f, "Psiquico", 85, 73, 70, 73, 115, 67,
				"Cuando mira al enemigo, usa una mezcla de movimientos psíquicos, como la hipnosis y la confusión."));
		lista.add(new PokemonDTO("098", "Krabby", 5, 0.4f, 6.5f, "Agua", 30, 105, 90, 25, 25, 50,
				"Sus pinzas son potentes armas, además de usarlas para equilibrarse cuando camina lateralmente."));
		lista.add(new PokemonDTO("099", "Kingler", 28, 1.3f, 60f, "Agua", 55, 130, 115, 50, 50, 75,
				"La pinza más grande tiene una enorme potencia, pero su gran tamaño la hace poco manejable."));
		lista.add(new PokemonDTO("100", "Voltorb", 5, 0.5f, 10.4f, "Electrico", 40, 30, 50, 55, 55, 100,
				"Suele vivir en centrales de energia. Mucha gente muere al confundirlo con una Poke Ball."));
		lista.add(new PokemonDTO("101", "Electrode", 30, 1.2f, 66.6f, "Electrico", 60, 50, 70, 80, 80, 150,
				"Almacena energia electrica a gran presion."));
		lista.add(new PokemonDTO("102", "Exeggcute", 5, 0.4f, 2.5f, "Planta", "Psiquico", 60, 40, 80, 60, 45, 40,
				"Son muy parecidos a los huevos. Cuando se les molesta, se agrupan y atacan todos juntos."));
		lista.add(new PokemonDTO("103", "Exeggutor", 28, 2f, 120f, "Planta", "Psiquico", 95, 95, 85, 125, 75, 55,
				"Dice la leyenda que en raras ocasiones una de sus cabezas cae y sobrevive como Exeggcute."));
		lista.add(new PokemonDTO("104", "Cubone", 5, 0.4f, 6.5f, "Tierra", 50, 50, 95, 40, 50, 35,
				"Como no se quita nunca su casco-calavera, nadie le ha visto la cara a este Pokemon."));
		lista.add(new PokemonDTO("105", "Marowak", 28, 1f, 45f, "Tierra", 60, 80, 110, 50, 80, 45,
				"El hueso que lleva es su gran arma. Lo lanza habilmente como un boomerang dejandolos KO."));
		lista.add(new PokemonDTO("106", "Hitmonlee", 20, 1.5f, 49.8f, "Lucha", 50, 120, 53, 35, 110, 87,
				"Si tiene prisa, sus patas se extenderan. Corre suavemente con zancadas extra-largas."));
		lista.add(new PokemonDTO("107", "Hitmonchan", 20, 1.4f, 50.2f, "Lucha", 50, 105, 79, 35, 110, 76,
				"Aunque parezca que no hace nada, sus rapidos punietazos-voleas son imposibles de ver."));
		lista.add(new PokemonDTO("108", "Lickitung", 5, 1.2f, 65.5f, "Normal", 90, 55, 75, 60, 75, 30,
				"Su lengua se extiende como la de un camaleon. Cuando lame a sus enemigos, estos se estremecen."));
		lista.add(new PokemonDTO("109", "Koffing", 5, 0.6f, 1f, "Veneno", 40, 65, 95, 60, 45, 35,
				"Como encierra varios tipos de gases toxicos en su cuerpo, suele explosionar sin previo aviso."));
		lista.add(new PokemonDTO("110", "Weezing", 35, 1.2f, 9.5f, "Veneno", 65, 90, 120, 85, 70, 60,
				"Donde se juntan 2 tipos de gases venenosos, 2 Koffing podran fusionarse en un Weezing."));
		lista.add(new PokemonDTO("111", "Rhyhorn", 5, 1f, 115f, "Tierra", "Roca", 80, 85, 95, 30, 30, 25,
				"Sus huesos son 1000 veces mas macizos que los humanos. Famoso por su gran fuerza."));
		lista.add(new PokemonDTO("112", "Rhydon", 42, 1.9f, 120f, "Tierra", "Roca", 105, 130, 120, 45, 45, 40,
				"Protegido por una piel tipo-escudo, puede vivir en lava líquida a 3.600 grados de temperatura."));
		lista.add(new PokemonDTO("113", "Chansey", 5, 1.1f, 34.6f, "Normal", 250, 5, 5, 35, 105, 50,
				"Un raro y evasivo Pokemon que, segun dicen, trae la felicidad a aquellos que lo atrapan."));
		lista.add(new PokemonDTO("114", "Tangela", 5, 1f, 35f, "Planta", 65, 55, 115, 100, 40, 60,
				"Todo su cuerpo esta cubierto con anchas cintas del tipo alga. Estas se mueven cuando camina."));
		lista.add(new PokemonDTO("115", "Kangaskhan", 5, 2.2f, 80f, "Normal", 105, 95, 80, 40, 80, 90,
				"El bebe no suele salir de la segura bolsa de su madre hasta que cumple los tres anios."));
		lista.add(new PokemonDTO("116", "Horsea", 5, 0.4f, 8f, "Agua", 30, 40, 70, 70, 25, 60,
				"Famoso por derribar a bichos volantes lanzando tinta desde la superficie del agua."));
		lista.add(new PokemonDTO("117", "Seadra", 32, 1.2f, 25f, "Agua", 55, 65, 95, 95, 45, 85,
				"Puede nadar hacia atras moviendo rapidamente sus aletas pectorales y su robusta cola."));
		lista.add(new PokemonDTO("118", "Goldeen", 5, 0.6f, 15f, "Agua", 45, 67, 60, 35, 50, 63,
				"La aleta de su cola se hincha como un elegante traje de baile. Es llamado Reina del Agua."));
		lista.add(new PokemonDTO("119", "Seaking", 33, 1.3f, 39f, "Agua", 80, 92, 65, 65, 80, 68,
				"En otonio, cuando se reproducen, pueden ser vistos nadando con energia por rios y arroyos."));
		lista.add(new PokemonDTO("120", "Staryu", 5, 0.8f, 34.5f, "Agua", 30, 45, 55, 70, 55, 85,
				"Un enigmatico Pokemon que puede regenerar con facilidad todo apendice que pierda luchando."));
		lista.add(new PokemonDTO("121", "Starmie", 24, 1.1f, 80f, "Agua", "Psiquico", 60, 75, 85, 100, 85, 115,
				"Su nucleo central brilla con los 7 colores del arco iris. Es valorado como gema por algunos."));
		lista.add(new PokemonDTO("122", "Mr. Mime", 5, 1.3f, 54.5f, "Psiquico", "Hada", 40, 45, 65, 100, 120, 90,
				"Si alguien lo interrumpe mientras excava, el le abofeteara con sus enormes manos."));
		lista.add(new PokemonDTO("123", "Scyther", 5, 1.5f, 56f, "Bicho", "Volador", 70, 110, 80, 55, 80, 105,
				"Con una agilidad y velocidad tipo ninja, puede crear la ilusion de que hay mas de uno."));
		lista.add(new PokemonDTO("124", "Jynx", 30, 1.4f, 40.6f, "Hielo", "Psiquico", 65, 50, 35, 115, 95, 95,
				"Mueve sus caderas seductoramente al caminar. Puede hacer que la gente baile al unisono."));
		lista.add(new PokemonDTO("125", "Electabuzz", 30, 1.1f, 30f, "Electrico", 65, 83, 57, 95, 85, 105,
				"Suelen andar por las centrales electricas, pero tambien merodean y causan grandes apagones."));
		lista.add(new PokemonDTO("126", "Magmar", 30, 1.3f, 44.5f, "Fuego", 65, 95, 57, 100, 85, 93,
				"Su cuerpo siempre arde con brillo naranja, con el que se oculta entre las llamas."));
		lista.add(new PokemonDTO("127", "Pinsir", 5, 1.5f, 55f, "Bicho", 65, 125, 100, 55, 70, 85,
				"Si no consigue triturar a su victima con sus pinzas, le dara vueltas y la arrojara lejos."));
		lista.add(new PokemonDTO("128", "Tauros", 5, 1.4f, 88.4f, "Normal", 75, 100, 95, 40, 70, 110,
				"Cuando ve a un enemigo, carga ferozmente con su cuerpo azotando sus largas colas."));
		lista.add(new PokemonDTO("129", "Magikarp", 5, 0.9f, 10f, "Agua", 20, 10, 55, 15, 20, 80,
				"En un pasado lejano, era mas fuerte que sus horribles descendientes de hoy en dia."));
		lista.add(new PokemonDTO("130", "Gyarados", 20, 6.5f, 235f, "Agua", "Volador", 95, 125, 79, 60, 100, 81,
				"Poco visto en la naturaleza. Enorme y malo, es capaz de destruir ciudades enteras de un ataque."));
		lista.add(new PokemonDTO("131", "Lapras", 5, 2.5f, 220f, "Agua", "Hielo", 130, 85, 80, 85, 95, 60,
				"Un Pokemon que ha sido cazado casi hasta la extincion. Puede llevar a la gente por el agua."));
		lista.add(new PokemonDTO("132", "Ditto", 5, 0.3f, 4f, "Normal", 48, 48, 48, 48, 48, 48,
				"Puede copiar el codigo genetico de un enemigo y transformarse en una replica de este."));
		lista.add(new PokemonDTO("133", "Eevee", 5, 0.3f, 6.5f, "Normal", 55, 55, 50, 45, 65, 55,
				"De irregular codigo genetico, puede mutar si se le expone a la radiacion de los elementos roca."));
		lista.add(new PokemonDTO("134", "Vaporeon", 24, 1f, 29f, "Agua", 130, 65, 60, 110, 95, 65,
				"Vive cerca del agua. Su larga cola termina en una aleta muy parecida a la de una sirena."));
		lista.add(new PokemonDTO("135", "Jolteon", 24, 0.8f, 24.5f, "Electrico", 65, 65, 60, 110, 95, 130,
				"Acumula iones negativos en la atmosfera para lanzar rayos de 10000 voltios de potencia."));
		lista.add(new PokemonDTO("136", "Flareon", 24, 0.9f, 25f, "Fuego", 65, 130, 60, 95, 110, 65,
				"Cuando almacena energia termica en su cuerpo, su temperatura puede subir a mas de 1600 grados."));
		lista.add(new PokemonDTO("137", "Porygon", 5, 0.8f, 36.5f, "Normal", 65, 60, 70, 85, 75, 40,
				"Un Pokemon formado por codigos de programacion. Se mueve libre en el ciberespacio."));
		lista.add(new PokemonDTO("138", "Omanyte", 5, 0.4f, 7.5f, "Roca", "Agua", 35, 40, 100, 90, 55, 35,
				"Aunque extinto, en algunas ocasiones puede ser resucitado geneticamente de los fosiles."));
		lista.add(new PokemonDTO("139", "Omastar", 40, 1f, 35f, "Roca", "Agua", 70, 60, 125, 115, 70, 55,
				"Un prehistorico Pokemon que murio cuando su pesada concha le impidio atrapar a sus presas."));
		lista.add(new PokemonDTO("140", "Kabuto", 24, 0.5f, 11.5f, "Roca", "Agua", 30, 80, 90, 55, 45, 55,
				"Un Pokemon resucitado de un fosil, encontrado en lo que hace eones fuera el fondo oceanico."));
		lista.add(new PokemonDTO("141", "Kabutops", 40, 1.3f, 40.5f, "Roca", "Agua", 60, 115, 105, 65, 70, 80,
				"Con su impecable forma es un gran nadador. Corta a su presa con sus garras y absorbe sus fluidos."));
		lista.add(new PokemonDTO("142", "Aerodactyl", 5, 1.8f, 59f, "Roca", "Volador", 80, 105, 65, 60, 75, 130,
				"Un prehistorico y feroz Pokemon que ataca con sus colmillos la garganta del enemigo."));
		lista.add(new PokemonDTO("143", "Snorlax", 5, 2.1f, 460f, "Normal", 160, 110, 65, 65, 110, 30,
				"Es muy vago. Solo come y duerme. A medida que engorda se vuelve cada vez mas perezoso."));
		lista.add(new PokemonDTO("144", "Articuno", 99, 1.7f, 55.4f, "Hielo", "Volador", 90, 85, 100, 95, 125, 85,
				"Un legendario pajaro Pokemon. Se aparece a la gente que se ha perdido en las heladas montanias."));
		lista.add(new PokemonDTO("145", "Zapdos", 99, 1.6f, 52.6f, "Electrico", "Volador", 90, 90, 85, 125, 90, 100,
				"Un legendario pajaro Pokemon. Dicen que aparece entre las nubes lanzando enormes rayos brillantes."));
		lista.add(new PokemonDTO("146", "Moltres", 99, 2f, 60f, "Fuego", "Volador", 90, 100, 90, 125, 85, 90,
				"Mas conocido como el legendario pajaro de fuego. Con cada aleteo crea brillantes llamas."));
		lista.add(new PokemonDTO("147", "Dratini", 5, 1.8f, 3.3f, "Dragon", 41, 64, 45, 50, 50, 50,
				"Considerado como un mitico Pokemon durante anios hasta que fue encontrada una colonia submarina."));
		lista.add(new PokemonDTO("148", "Dragonair", 30, 4f, 16.5f, "Dragon", 61, 84, 65, 70, 70, 70,
				"Un mistico Pokemon rodeado de una sutil aura y con capacidad de cambiar la climatologia."));
		lista.add(new PokemonDTO("149", "Dragonite", 55, 2.2f, 210f, "Dragon", 91, 134, 95, 100, 100, 80,
				"Un Pokemon marino que es muy raro de ver. Dicen que es tan inteligente como los humanos."));
		lista.add(new PokemonDTO("150", "Mewtwo", 99, 2f, 122f, "Psiquico", 106, 110, 90, 154, 90, 130,
				"Fue creado por un cientifico tras anios de horribles experimentos de ingenieria genetica."));
		lista.add(new PokemonDTO("151", "Mew", 99, 0.4f, 4f, "Psiquico", 100, 100, 100, 100, 100, 100,
				"Es tan raro que muchos expertos opinan que es solo una ilusion. Solo unos pocos lo han visto."));
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

	// Funciones CRUD

	@Override
	public void crearTipoIndividual(String id, String nombre, int lv, float altura, float peso, String tipo, int hp,
			int ataque, int defensa, int atl_especial, int def_especial, int velocidad, String descripcion) {
		lista.add(new PokemonDTO(id, nombre, lv, altura, peso, tipo, hp, ataque, defensa, atl_especial, def_especial,
				velocidad, descripcion));
	}

	@Override
	public void crearTipoSecundario(String id, String nombre, int lv, float altura, float peso, String tipo,
			String tipo_sec, int hp, int ataque, int defensa, int atk_especial, int def_especial, int velocidad,
			String descripcion) {
		lista.add(new PokemonDTO(id, nombre, lv, altura, peso, tipo, tipo_sec, hp, ataque, defensa, atk_especial,
				def_especial, velocidad, descripcion));

	}

	@Override
	public boolean eliminarIndex(int del_index) {
		try {
			lista.remove(del_index);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
