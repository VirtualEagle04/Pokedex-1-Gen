 package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * Al heredar de la clase abstracta OperacionesDAO, obliga a darle funcionalidad a los metodos por medio de la palabra clave Override.
 * @author Juan Esteban Quintero, Javier Felipe Meza, Joann Zamudio, Federico Vargas Rozo
 * @param lista ArrayList de tipo PokemonDTO que contiene la informacion general de todos los Pokemones de la primera generacion.
 */

public class PokemonDAO extends OperacionesDAO {

	private ArrayList<PokemonDTO> lista;

	public PokemonDAO() {
		lista = new ArrayList<PokemonDTO>();
		lista.add(new PokemonDTO("000", "???", 0, 0f, 0f, "???", "???", 0, 0, 0, 0, 0, 0, "???"));
		lista.add(new PokemonDTO("001", "Bulbasaur", 1, 0.7f, 6.9f, "Planta", "Veneno", 45, 49, 49, 65, 65, 45, "Una rara semilla fue plantada en su espalda al nacer. La planta brota y crece con este Pokemon."));
		lista.add(new PokemonDTO("002", "Ivysaur", 16, 1f, 13f, "Planta", "Veneno", 60, 62, 63, 80, 80, 60, "Cuando el bulbo de su espalda crece, parece no poder ponerse de pie sobre sus patas traseras."));
		lista.add(new PokemonDTO("003", "Venusaur", 32, 2f, 100f, "Planta", "Veneno", 80, 82, 83, 100, 100, 80, "La planta florese cuando absorbe energia solar. Esta le obliga a ponerse en busca de la luz."));
		lista.add(new PokemonDTO("004", "Charmander", 1, 0.6f, 8.5f, "Fuego", 39, 52, 43, 60, 50, 65, "Prefiere los sitios calientes. Dicen que cuando llueve sale vapor de la punta de su cola."));
		lista.add(new PokemonDTO("005", "Charmeleon", 16, 1.1f, 19f, "Fuego", 58, 64, 58, 80, 65, 80, "Cuando balancea su ardiente cola, eleva la temperatura a niveles muy altos."));
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
		lista.add(new PokemonDTO("019", "Rattata", 1, 0.3f, 3.5f, "Normal", 30, 56, 35, 25, 35, 72, "Cuando ataca lo muerde todo. Pequenio y muy rapido, es muy facil de ver muchos sitios."));
		lista.add(new PokemonDTO("020", "Raticate", 20, 0.7f, 18.5f, "Normal", 55, 81, 60, 50, 70, 97, "Utiliza sus bigotes para equilibrarse. Parece que si con cortados va mas despacio."));
		lista.add(new PokemonDTO("021", "Spearow", 1, 0.3f, 2f, "Normal", "Volador", 40, 60, 30, 31, 31, 70, "Come bichos en zona de hierba. Agita sus cortas alas muy rapido para mantener en el aure."));
		lista.add(new PokemonDTO("022", "Fearow", 20, 1.2f, 38f, "Normal", "Volador", 65, 90, 65, 61, 61, 100, "Con sus enormes y magnificas alas, puede seguir volando sin tener que aterrizar para descanzar."));
		lista.add(new PokemonDTO("023", "Ekans", 1, 2f, 6.9f, "Veneno", 35, 60, 44, 40, 54, 55, "Es muy silencioso y sigiloso. Come huevos de pajaros como los de Pidgey y Spearow."));
		lista.add(new PokemonDTO("024", "Arbok", 22, 3.5f, 65f, "Veneno", 60, 95, 69, 65, 79, 80, "Se dice que las feroces seniales de alerta de su panza difieren un area a otro."));
		lista.add(new PokemonDTO("025", "Pikachu", 16, 0.4f, 6f, "Electrico", 35, 55, 40, 50, 50, 90, "Cuando varios de estos Pokemon se juntan, su energia puede causar fuertes tormentas."));
		lista.add(new PokemonDTO("026", "Raichu", 32, 0.8f, 30f, "Electrico", 60, 90, 55, 90, 80, 110, "Su larga cola le sirve para protegerse a si mismo de su potente y alto voltaje."));
		lista.add(new PokemonDTO("027", "Sandshrew", 1, 0.6f, 12f, "Tierra", 50, 75, 85, 20, 30, 40, "Se oculta bajo tierra, en zonas aridas y alejadas del agua. Solo emerge para cazar su comido."));
		lista.add(new PokemonDTO("028", "Sandslash", 22, 1f, 29.5f, "Tierra", 75, 100, 110, 45, 55, 65, "Ante el peligro se acurruca en un espinoso ovillo. De esta forma puede rodar para atacar o escapar."));
		lista.add(new PokemonDTO("029", "Nidoran Hembra", 1, 0.4f, 7f, "Veneno", 55, 47, 52, 40, 40, 41, "Aunque pequenias, sus venenosas puas son muy peligrosas. La hembra tiene pequenios cuernos."));
		lista.add(new PokemonDTO("030", "Nidorina", 16, 0.8f, 20f, "Veneno", 70, 62, 67, 55, 55, 56, "El cuerno de la hembra crece lentamente. Prefiere ataques fisicos como araniar o morder."));
		lista.add(new PokemonDTO("031", "Nidoqueen", 32, 1.3f, 60f, "Veneno", "Tierra", 90, 92, 87, 75, 85, 76, "Sus duras escamas lo protegen. Usa su gran corpulencia para ejecutar potentes movimientos."));
		lista.add(new PokemonDTO("032", "Nidoran Macho", 1, 0.5f, 9f, "Veneno", 46, 57, 40, 40, 40, 50, "Estira sus orejas para sentir el peligro. Cuanto mayores sean sus cuernos, mas fuerte su veneno."));
		lista.add(new PokemonDTO("033", "Nidorino", 16, 0.9f, 19.5f, "Veneno", 61, 72, 57, 55, 55, 65, "Un Pokemon agresivo, siempre listo para atacar. El cuerno de la cabeza segrega un potente veneno."));
		lista.add(new PokemonDTO("034", "Nidoking", 32, 1.4f, 62f, "Veneno", "Tierra", 81, 102, 77, 85, 75, 85, "Usa su potente veneno cola en combate para aplastar y oprimir a su presa. Despues le rompe los huesos."));
		lista.add(new PokemonDTO("035", "Clefairy", 16, 0.6f, 7.5f, "Hada", 70, 45, 48, 60, 65, 35, "Su magico y adorable aspecto atrae a la gente. Es raro y solo aparece en ciertas areas."));
		lista.add(new PokemonDTO("036", "Clefable", 32, 1.3f, 40f, "Hada", 95, 70, 73, 95, 90, 60, "Un encantador y timido Pokemon muy raro de ver. Corre y se oculta en cuanto siente que viene gente."));
		lista.add(new PokemonDTO("037", "Vulpix", 1, 0.6f, 9.9f, "Fuego", 38, 41, 40, 50, 65, 65, "Cuando nace solo tiene una cola, pero a medida que crece, esta se va dividiendo desde al punta."));
		lista.add(new PokemonDTO("038", "Ninetales", 36, 1.1f, 19.9f, "Fuego", 73, 76, 75, 81, 100, 100, "Muy inteligente y vengativo. Agarrar una de sus colas podria causar 1000 anios de maldicion."));
		lista.add(new PokemonDTO("039", "Jigglypuff", 16, 0.5f, 5.5f, "Normal", "Hada", 115, 45, 20, 45, 25, 20, "Cuando sus ojos se iluminan, canta una secreta melodia con la que duerme a sus enemigos."));
		lista.add(new PokemonDTO("040", "Wigglytuff", 32, 1f, 12f, "Normal", "Hada", 140, 70, 45, 85, 50, 45, "Su cuerpo es blando y gomoso. Cuando se enfada traga aire y se hincha enormemente."));
		lista.add(new PokemonDTO("041", "Zubat", 1, 0.8f, 7.5f, "Veneno", "Volador", 40, 45, 35, 30, 40, 55, "Forma colonias en lugar oscuras. Usa ultrasonidos para idenficar y acercarse a los objetos."));
		lista.add(new PokemonDTO("042", "Golbat", 16, 1.6f, 55f, "Veneno", "Volador", 75, 80, 70, 65, 75, 90, "Cuando ataque, seguira chupando energia de su victima, aunque pese tanto que ya no pueda volar."));
		lista.add(new PokemonDTO("043", "Oddish", 1, 0.5f, 5.4f, "Planta", "Veneno", 45, 50, 55, 75, 65, 30, "Durante el dia entierra su cara en el suelo. Merodea por la noche plantando sus semillas."));
		lista.add(new PokemonDTO("044", "Gloom", 16, 0.8f, 8.6f, "Planta", "Veneno", 60, 65, 70, 85, 75, 40, "El fluido que gotea de su boca no son babas. Es un nectar que usa para atraer a sus presas."));
		lista.add(new PokemonDTO("045", "Vileplume", 32, 1.2f, 18.6f, "Planta", "Veneno", 75, 80, 85, 110, 90, 50, "A mayor petalo, mas toxico es su polen. Su cabeza es pesada y le cuesta mantenerla."));
		lista.add(new PokemonDTO("046", "Paras", 1, 0.3f, 5.4f, "Bicho", "Planta", 35, 70, 55, 45, 55, 25, "Cava para chupar las raices los arboles. Las setas de su espalda crecen a sus expensas."));
		lista.add(new PokemonDTO("047", "Parasect", 16, 1f, 29.5f, "Bicho", "Planta", 60, 95, 80, 60, 80, 30, "Una pareja de parasitos en la que la seta ha ocupado al bicho. Prefieren los sitios humedos."));
		lista.add(new PokemonDTO("048", "Venonat", 1, 1f, 30f, "Bicho", "Veneno", 60, 55, 50, 40, 55, 45, "Vive entre las sombras de altos arboles, donde come insectos. Le atrae la luz por la noche."));
		lista.add(new PokemonDTO("049", "Venomoth", 16, 1.5f, 12.5f, "Bicho", "Veneno", 70, 65, 60, 90, 75, 90, "El polvillo que cubre sus alas es de distinto color segun el tipo de veneno que lleve."));
		lista.add(new PokemonDTO("050", "Diglett", 16, 0.2f, 0.8f, "Tierra", 10, 55, 25, 35, 45, 95, "Vive un metro opr debajo del suelo, donde se alimenta de raices. Tambien aparece en la superficie."));
		lista.add(new PokemonDTO("051", "Dugtrio", 26, 0.7f, 33.3f, "Tierra", 35, 100, 50, 50, 70, 120, "Un trio de Diglett. Causa enormes terremotos cavando 80 km por debajo del suelo."));
		lista.add(new PokemonDTO("052", "Meowth", 1, 0.4f, 4.2f, "Normal", 40, 45, 35, 40, 40, 90, "Adora los objetos redondos. De noche, camina por las calles en busca de monedas perdidas."));
		lista.add(new PokemonDTO("053", "Persian", 28, 1f, 32f, "Normal", 65, 70, 60, 65, 65, 115, "Aunque es muy admirado por su pelo, es dificil de entrenar como mascota por su voluble maldad."));
		lista.add(new PokemonDTO("054", "Psyduck", 1, 0.8f, 19.6f, "Agua", 50, 52, 48, 65, 50, 55, "Aunque calma al enemigo con su vacia mirada, este Pokemon usara poderes psicoquineticos."));
		lista.add(new PokemonDTO("055", "Golduck", 33, 1.7f, 76.6f, "Agua", 80, 82, 78, 95, 80, 85, "Suele ser visto nadando elegante por los lagos. Es confundido con el monstruo japones, Kappa."));
		lista.add(new PokemonDTO("056", "Mankey", 1, 0.5f, 28f, "Lucha", 40, 80, 35, 35, 45, 70, "Se enfada muy facilmente. Puede pasar de la tranquilidad a la ira en apenas segundos."));
		lista.add(new PokemonDTO("057", "Primeape", 28, 1f, 32f, "Lucha", 65, 105, 60, 60, 70, 95, "Siempre furioso y tenaz con sus patadas. Perseguira a su presa hasta que la atrape."));
		lista.add(new PokemonDTO("058", "Growlithe", 1, 0.7f, 19f, "Fuego", 55, 70, 45, 70, 50, 60, "Gran defensor de su territorio. Ladrara y mordera para echar a los instrusos de su espacio."));
		lista.add(new PokemonDTO("059", "Arcanine", 16, 1.9f, 155f, "Fuego", 90, 110, 80, 100, 80, 95, "Un Pokemon muy admirado desde la antiguedad por su belleza. Corre agilmente como si tuviera alas."));
		lista.add(new PokemonDTO("060", "Poliwag", 1, 0.6f, 12.4f, "Agua", 40, 50, 40, 40, 40, 90, "Sus nuevas y pequenias patas no le dejan correr. Parece que prefiere nadar a estar de pie."));
		lista.add(new PokemonDTO("061", "Poliwhirl", 16, 1f, 20f, "Agua", 65, 65, 65, 50, 50, 90, "Capaz de vivir dentro o fuera del agua. Fuera del agua suda para mantener su cuerpo baboso."));
		lista.add(new PokemonDTO("062", "Poliwrath", 32, 1.3f, 54f, "Agua", "Lucha", 90, 95, 95, 70, 90, 70, "Experto nadador tanto en brazo como crawl. Gana facilmente a todo nadador humano."));
		lista.add(new PokemonDTO("063", "Abra", 1, 0.9f, 19.5f, "Psiquico", 25, 20, 15, 105, 55, 90, "Con su capacidad de leer la mente, detecta cualquier peligro y se teletransporta a un lugar seguro."));
		lista.add(new PokemonDTO("064", "Kadabra", 16, 1.3f, 56.5f, "Psiquico", 40, 35, 30, 120, 70, 105, "Emite ondas-alfa especiales de su cuerpo que causan jaquecasa todo aquel que se acerca."));
		lista.add(new PokemonDTO("065", "Alakazam", 32, 1.5f, 48f, "Psiquico", 55, 50, 45, 135, 95, 120, "Su cerebro puede ganar al de un super-ordenador. Tiene un coeficiente intelectual de 5000."));
		lista.add(new PokemonDTO("066", "Machop", 1, 0.8f, 19.5f, "Lucha", 70, 80, 50, 35, 35, 35, "Le encanta ser musculoso. Se entrena en todo tipo de arte marcial para ser aun mas fuerte."));
		lista.add(new PokemonDTO("067", "Machoke", 28, 1.5f, 70.5f, "Lucha", 80, 100, 70, 50, 60, 45, "Su musculoso cuerpo es tan fuerte que usa un cinto anti-fuerza para controlar sus movimientos."));
		lista.add(new PokemonDTO("068", "Machamp", 32, 1.6f, 130f, "Lucha", 90, 130, 80, 65, 85, 55, "Con sus fuertes musculos, lanza bestiales punietazos y envia a su victima al lejano horizonte."));
		lista.add(new PokemonDTO("069", "Bellsprout", 1, 0.7f, 4f, "Planta", "Veneno", 50, 75, 35, 70, 30, 40, "Un Pokemon carnivoro que caza insectos. Usa sus raices para absorber humedad."));
		lista.add(new PokemonDTO("070", "Weepinbell", 21, 1f, 6.4f, "Planta", "Veneno", 65, 90, 50, 85, 45, 55, "Escupe polvo-veneno para envenenar al enemigo, y luego lo liquida con su acido."));
		lista.add(new PokemonDTO("071", "Victreebel", 32, 1.7f, 15.5f, "Planta", "Veneno", 80, 105, 65, 100, 70, 70, "Vive en grandes colonias en el interior de las junglas, aunque nadie ha podido verificarlo."));
		lista.add(new PokemonDTO("072", "Tentacool", 1, 0.9f, 45.5f, "Agua", "Veneno", 40, 40, 35, 50, 100, 70, "Va a la deriva a poca profundidad. Si es pescado por accidente, el castigo sera su punzante acido."));
		lista.add(new PokemonDTO("073", "Tentacruel", 30, 1.6f, 55f, "Agua", "Veneno", 80, 70, 65, 80, 120, 100, "De tentaculos cortos, cuando caza los extiende para atrapar e inmovilizara a su presa."));
		lista.add(new PokemonDTO("074", "Geodude", 1, 0.4f, 20f, "Roca", "Tierra", 40, 80, 100, 30, 30, 20, "Aparece en llanos y montanias. Semejantes a las rocas, la gente se tropieza con ellos o los pisa."));
		lista.add(new PokemonDTO("075", "Graveler", 25, 1f, 105f, "Roca", "Tierra", 55, 95, 115, 45, 45, 35, "Se mueve rodando cuesta abajo. Rueda sobre todo abstaculo sin frenar o cambiar de direccion."));
		lista.add(new PokemonDTO("076", "Golem", 32, 1.4f, 300f, "Roca", "Tierra", 80, 120, 130, 55, 65, 45, "Su cuerpo rocoso, es super duro. Soporta las explosiones de dinamita sin sufrir danio."));
		lista.add(new PokemonDTO("077", "Ponyta", 5, 1.0f, 30f, "Fuego", 50, 85, 55, 65, 65, 90, "Sus cascos son 10 veces mas duros que el diamante. Puede pisotear cualquier cosa en poco tiempo."));
		lista.add(new PokemonDTO("078", "Rapidash", 40, 1.7f, 95f, "Fuego", 65, 100, 70, 80, 80, 105, "Muy competitivo, este Pokemon perseguira a todo lo que se mueva rapido, esperando ganarle."));
		lista.add(new PokemonDTO("079", "Slowpoke", 5, 1.2f, 36f, "Agua", "Psiquico", 90, 65, 65, 40, 40, 15, "Increiblemente lento y torpe. Tardara 5 segundos en sentir dolor si es atacado."));
		lista.add(new PokemonDTO("080", "Slowbro", 37, 1.6f, 78.5f, "Agua", "Psiquico", 95, 75, 110, 100, 80, 30, "Dicen que el Shellder pegado a la cola de Slowpoke se nutre de los residuos del anfitrion."));
		lista.add(new PokemonDTO("081", "Magnemite", 5, 0.3f, 6f, "Electrico", "Acero", 25, 35, 70, 95, 55, 45, "Anula la gravedad para mantenerse en el aire. Sin previo aviso usa la ondatrueno y parecidos."));
		lista.add(new PokemonDTO("082", "Magneton", 30, 1f, 60f, "Electrico", "Acero", 50, 60, 95, 120, 70, 70,"Estan formados por Magnemite unidos. Suelen aparecer cuando arden las manchas solares."));
		lista.add(new PokemonDTO("083", "Farfetch'd", 5, 0.8f, 15f, "Normal", "Volador", 52, 90, 55, 58, 62, 60,"La ramita de cebollas verdes que lleva es su arma. Suele usarla como una espada."));
		lista.add(new PokemonDTO("084", "Doduo", 5, 1.4f, 39.2f, "Normal", "Volador", 35, 85, 45, 35, 35, 75,"Un pajaro que compensa su pobre vuelo caminando muy rapidamente. Deja enormes huellas."));
		lista.add(new PokemonDTO("085", "Dodrio", 31, 1.8f, 85.2f, "Normal", "Volador", 60, 110, 70, 60, 60, 110,"Para tramar sus planes usa sus tres cerebros. Cuando 2 cabezas duermen, la otra sigue despierta."));
		lista.add(new PokemonDTO("086", "Seel", 5, 1.1f, 90f, "Agua", 65, 45, 55, 45, 70, 45,"El cuerno que sobresale de su cabeza es muy duro. Suele usarlo para romper el hielo."));
		lista.add(new PokemonDTO("087", "Dewgong", 34, 1.7f, 120f, "Agua", "Hielo", 90, 70, 80, 70, 95, 70,"Guarda energia termica en su cuerpo. Nada a 8 nudos sin parar hasta en aguas muy frias."));
		lista.add(new PokemonDTO("088", "Grimer", 5, 0.9f, 30f, "Veneno", 80, 80, 50, 40, 50, 25,"Aparece en zonas asquerosas. Crece absorbiendo los residuos toxicos expulsados por las fabricas."));
		lista.add(new PokemonDTO("089", "Muk", 38, 1.2f, 30f, "Veneno", 105, 105, 75, 65, 100, 50,"Esta cubierto por un repugnante lodo. Es tan toxico que hasta sus huellas son venenosas."));
		lista.add(new PokemonDTO("090", "Shellder", 5, 0.3f, 4f, "Agua", 30, 65, 100, 45, 25, 40,"Su caparazon repele cualquier tipo de ataque. Solo cuando abre su caparazon es vulnerable."));
		lista.add(new PokemonDTO("091", "Cloyster", 32, 1.5f, 132.5f, "Agua", "Hielo", 50, 95, 180, 85, 45, 70,"Cuando es atacado lanza sus cuernos con gran rapidez. Sus entranias jamas han sido vistas."));
		lista.add(new PokemonDTO("092", "Gastly", 5, 1.3f, 0.1f, "Fastasma", "Veneno", 30, 35, 30, 100, 35, 80,"Casi invisible, este gaseoso Pokemon cubre al enemigo y lo adormece sin previo aviso."));
		lista.add(new PokemonDTO("093", "Haunter", 25, 1.6f, 0.1f, "Fantasma", "Veneno", 45, 50, 45, 115, 55, 95,"Por su habilidad para atravesar muros de piedra, se dice que viene de otra dimension."));
		lista.add(new PokemonDTO("094", "Gengar", 32, 1.5f, 40.5f, "Fantasma", "Veneno", 60, 65, 60, 130, 75, 110,"En luna llena, a este Pokemon le gusta imitar las sombras de la gente y burlarse de sus miedos."));
		lista.add(new PokemonDTO("095", "Onix", 5, 8.8f, 210f, "Roca", "Tierra", 35, 45, 160, 30, 45, 70,"Cuando crece, las partes rocosas de su cuerpo se endurecen. Acaba pareciendose a un diamante negro."));
		lista.add(new PokemonDTO("096", "Drowzee", 5, 1f, 32.4f, "Psiquico", 60, 48, 45, 43, 90, 42,"Adormece a sus enemigos y se come sus suenios. A veces se pone enfermo si come pesadillas."));
		lista.add(new PokemonDTO("097", "Hypno", 26, 1.6f, 75.6f, "Psiquico", 85, 73, 70, 73, 115, 67,"Cuando mira al enemigo, usa una mezcla de movimientos psiquicos, como la hipnosis y la confusion."));
		lista.add(new PokemonDTO("098", "Krabby", 5, 0.4f, 6.5f, "Agua", 30, 105, 90, 25, 25, 50,"Sus pinzas son potentes armas, ademas de usarlas para equilibrarse cuando camina lateralmente."));
		lista.add(new PokemonDTO("099", "Kingler", 28, 1.3f, 60f, "Agua", 55, 130, 115, 50, 50, 75,"La pinza mas grande tiene una enorme potencia, pero su gran tamanio la hace poco manejable."));
		lista.add(new PokemonDTO("100", "Voltorb", 5, 0.5f, 10.4f, "Electrico", 40, 30, 50, 55, 55, 100,"Suele vivir en centrales de energia. Mucha gente muere al confundirlo con una Poke Ball."));
		lista.add(new PokemonDTO("101", "Electrode", 30, 1.2f, 66.6f, "Electrico", 60, 50, 70, 80, 80, 150,"Almacena energia electrica a gran presion."));
		lista.add(new PokemonDTO("102", "Exeggcute", 5, 0.4f, 2.5f, "Planta", "Psiquico", 60, 40, 80, 60, 45, 40,"Son muy parecidos a los huevos. Cuando se les molesta, se agrupan y atacan todos juntos."));
		lista.add(new PokemonDTO("103", "Exeggutor", 28, 2f, 120f, "Planta", "Psiquico", 95, 95, 85, 125, 75, 55,"Dice la leyenda que en raras ocasiones una de sus cabezas cae y sobrevive como Exeggcute."));
		lista.add(new PokemonDTO("104", "Cubone", 5, 0.4f, 6.5f, "Tierra", 50, 50, 95, 40, 50, 35,"Como no se quita nunca su casco-calavera, nadie le ha visto la cara a este Pokemon."));
		lista.add(new PokemonDTO("105", "Marowak", 28, 1f, 45f, "Tierra", 60, 80, 110, 50, 80, 45,"El hueso que lleva es su gran arma. Lo lanza habilmente como un boomerang dejandolos KO."));
		lista.add(new PokemonDTO("106", "Hitmonlee", 20, 1.5f, 49.8f, "Lucha", 50, 120, 53, 35, 110, 87,"Si tiene prisa, sus patas se extenderan. Corre suavemente con zancadas extra-largas."));
		lista.add(new PokemonDTO("107", "Hitmonchan", 20, 1.4f, 50.2f, "Lucha", 50, 105, 79, 35, 110, 76,"Aunque parezca que no hace nada, sus rapidos punietazos-voleas son imposibles de ver."));
		lista.add(new PokemonDTO("108", "Lickitung", 5, 1.2f, 65.5f, "Normal", 90, 55, 75, 60, 75, 30,"Su lengua se extiende como la de un camaleon. Cuando lame a sus enemigos, estos se estremecen."));
		lista.add(new PokemonDTO("109", "Koffing", 5, 0.6f, 1f, "Veneno", 40, 65, 95, 60, 45, 35,"Como encierra varios tipos de gases toxicos en su cuerpo, suele explosionar sin previo aviso."));
		lista.add(new PokemonDTO("110", "Weezing", 35, 1.2f, 9.5f, "Veneno", 65, 90, 120, 85, 70, 60,"Donde se juntan 2 tipos de gases venenosos, 2 Koffing podran fusionarse en un Weezing."));
		lista.add(new PokemonDTO("111", "Rhyhorn", 5, 1f, 115f, "Tierra", "Roca", 80, 85, 95, 30, 30, 25,"Sus huesos son 1000 veces mas macizos que los humanos. Famoso por su gran fuerza."));
		lista.add(new PokemonDTO("112", "Rhydon", 42, 1.9f, 120f, "Tierra", "Roca", 105, 130, 120, 45, 45, 40,"Protegido por una piel tipo-escudo, puede vivir en lava liquida a 3.600 grados de temperatura."));
		lista.add(new PokemonDTO("113", "Chansey", 5, 1.1f, 34.6f, "Normal", 250, 5, 5, 35, 105, 50,"Un raro y evasivo Pokemon que, segun dicen, trae la felicidad a aquellos que lo atrapan."));
		lista.add(new PokemonDTO("114", "Tangela", 5, 1f, 35f, "Planta", 65, 55, 115, 100, 40, 60,"Todo su cuerpo esta cubierto con anchas cintas del tipo alga. Estas se mueven cuando camina."));
		lista.add(new PokemonDTO("115", "Kangaskhan", 5, 2.2f, 80f, "Normal", 105, 95, 80, 40, 80, 90,"El bebe no suele salir de la segura bolsa de su madre hasta que cumple los tres anios."));
		lista.add(new PokemonDTO("116", "Horsea", 5, 0.4f, 8f, "Agua", 30, 40, 70, 70, 25, 60,"Famoso por derribar a bichos volantes lanzando tinta desde la superficie del agua."));
		lista.add(new PokemonDTO("117", "Seadra", 32, 1.2f, 25f, "Agua", 55, 65, 95, 95, 45, 85,"Puede nadar hacia atras moviendo rapidamente sus aletas pectorales y su robusta cola."));
		lista.add(new PokemonDTO("118", "Goldeen", 5, 0.6f, 15f, "Agua", 45, 67, 60, 35, 50, 63,"La aleta de su cola se hincha como un elegante traje de baile. Es llamado Reina del Agua."));
		lista.add(new PokemonDTO("119", "Seaking", 33, 1.3f, 39f, "Agua", 80, 92, 65, 65, 80, 68,"En otonio, cuando se reproducen, pueden ser vistos nadando con energia por rios y arroyos."));
		lista.add(new PokemonDTO("120", "Staryu", 5, 0.8f, 34.5f, "Agua", 30, 45, 55, 70, 55, 85,"Un enigmatico Pokemon que puede regenerar con facilidad todo apendice que pierda luchando."));
		lista.add(new PokemonDTO("121", "Starmie", 24, 1.1f, 80f, "Agua", "Psiquico", 60, 75, 85, 100, 85, 115,"Su nucleo central brilla con los 7 colores del arco iris. Es valorado como gema por algunos."));
		lista.add(new PokemonDTO("122", "Mr. Mime", 5, 1.3f, 54.5f, "Psiquico", "Hada", 40, 45, 65, 100, 120, 90,"Si alguien lo interrumpe mientras excava, el le abofeteara con sus enormes manos."));
		lista.add(new PokemonDTO("123", "Scyther", 5, 1.5f, 56f, "Bicho", "Volador", 70, 110, 80, 55, 80, 105,"Con una agilidad y velocidad tipo ninja, puede crear la ilusion de que hay mas de uno."));
		lista.add(new PokemonDTO("124", "Jynx", 30, 1.4f, 40.6f, "Hielo", "Psiquico", 65, 50, 35, 115, 95, 95,"Mueve sus caderas seductoramente al caminar. Puede hacer que la gente baile al unisono."));
		lista.add(new PokemonDTO("125", "Electabuzz", 30, 1.1f, 30f, "Electrico", 65, 83, 57, 95, 85, 105,"Suelen andar por las centrales electricas, pero tambien merodean y causan grandes apagones."));
		lista.add(new PokemonDTO("126", "Magmar", 30, 1.3f, 44.5f, "Fuego", 65, 95, 57, 100, 85, 93,"Su cuerpo siempre arde con brillo naranja, con el que se oculta entre las llamas."));
		lista.add(new PokemonDTO("127", "Pinsir", 5, 1.5f, 55f, "Bicho", 65, 125, 100, 55, 70, 85,"Si no consigue triturar a su victima con sus pinzas, le dara vueltas y la arrojara lejos."));
		lista.add(new PokemonDTO("128", "Tauros", 5, 1.4f, 88.4f, "Normal", 75, 100, 95, 40, 70, 110,"Cuando ve a un enemigo, carga ferozmente con su cuerpo azotando sus largas colas."));
		lista.add(new PokemonDTO("129", "Magikarp", 5, 0.9f, 10f, "Agua", 20, 10, 55, 15, 20, 80,"En un pasado lejano, era mas fuerte que sus horribles descendientes de hoy en dia."));
		lista.add(new PokemonDTO("130", "Gyarados", 20, 6.5f, 235f, "Agua", "Volador", 95, 125, 79, 60, 100, 81,"Poco visto en la naturaleza. Enorme y malo, es capaz de destruir ciudades enteras de un ataque."));
		lista.add(new PokemonDTO("131", "Lapras", 5, 2.5f, 220f, "Agua", "Hielo", 130, 85, 80, 85, 95, 60,"Un Pokemon que ha sido cazado casi hasta la extincion. Puede llevar a la gente por el agua."));
		lista.add(new PokemonDTO("132", "Ditto", 5, 0.3f, 4f, "Normal", 48, 48, 48, 48, 48, 48,"Puede copiar el codigo genetico de un enemigo y transformarse en una replica de este."));
		lista.add(new PokemonDTO("133", "Eevee", 5, 0.3f, 6.5f, "Normal", 55, 55, 50, 45, 65, 55,"De irregular codigo genetico, puede mutar si se le expone a la radiacion de los elementos roca."));
		lista.add(new PokemonDTO("134", "Vaporeon", 24, 1f, 29f, "Agua", 130, 65, 60, 110, 95, 65,"Vive cerca del agua. Su larga cola termina en una aleta muy parecida a la de una sirena."));
		lista.add(new PokemonDTO("135", "Jolteon", 24, 0.8f, 24.5f, "Electrico", 65, 65, 60, 110, 95, 130,"Acumula iones negativos en la atmosfera para lanzar rayos de 10000 voltios de potencia."));
		lista.add(new PokemonDTO("136", "Flareon", 24, 0.9f, 25f, "Fuego", 65, 130, 60, 95, 110, 65,"Cuando almacena energia termica en su cuerpo, su temperatura puede subir a mas de 1600 grados."));
		lista.add(new PokemonDTO("137", "Porygon", 5, 0.8f, 36.5f, "Normal", 65, 60, 70, 85, 75, 40,"Un Pokemon formado por codigos de programacion. Se mueve libre en el ciberespacio."));
		lista.add(new PokemonDTO("138", "Omanyte", 5, 0.4f, 7.5f, "Roca", "Agua", 35, 40, 100, 90, 55, 35,"Aunque extinto, en algunas ocasiones puede ser resucitado geneticamente de los fosiles."));
		lista.add(new PokemonDTO("139", "Omastar", 40, 1f, 35f, "Roca", "Agua", 70, 60, 125, 115, 70, 55,"Un prehistorico Pokemon que murio cuando su pesada concha le impidio atrapar a sus presas."));
		lista.add(new PokemonDTO("140", "Kabuto", 24, 0.5f, 11.5f, "Roca", "Agua", 30, 80, 90, 55, 45, 55,"Un Pokemon resucitado de un fosil, encontrado en lo que hace eones fuera el fondo oceanico."));
		lista.add(new PokemonDTO("141", "Kabutops", 40, 1.3f, 40.5f, "Roca", "Agua", 60, 115, 105, 65, 70, 80,"Con su impecable forma es un gran nadador. Corta a su presa con sus garras y absorbe sus fluidos."));
		lista.add(new PokemonDTO("142", "Aerodactyl", 5, 1.8f, 59f, "Roca", "Volador", 80, 105, 65, 60, 75, 130,"Un prehistorico y feroz Pokemon que ataca con sus colmillos la garganta del enemigo."));
		lista.add(new PokemonDTO("143", "Snorlax", 5, 2.1f, 460f, "Normal", 160, 110, 65, 65, 110, 30,"Es muy vago. Solo come y duerme. A medida que engorda se vuelve cada vez mas perezoso."));
		lista.add(new PokemonDTO("144", "Articuno", 99, 1.7f, 55.4f, "Hielo", "Volador", 90, 85, 100, 95, 125, 85,"Un legendario pajaro Pokemon. Se aparece a la gente que se ha perdido en las heladas montanias."));
		lista.add(new PokemonDTO("145", "Zapdos", 99, 1.6f, 52.6f, "Electrico", "Volador", 90, 90, 85, 125, 90, 100,"Un legendario pajaro Pokemon. Dicen que aparece entre las nubes lanzando enormes rayos brillantes."));
		lista.add(new PokemonDTO("146", "Moltres", 99, 2f, 60f, "Fuego", "Volador", 90, 100, 90, 125, 85, 90,"Mas conocido como el legendario pajaro de fuego. Con cada aleteo crea brillantes llamas."));
		lista.add(new PokemonDTO("147", "Dratini", 5, 1.8f, 3.3f, "Dragon", 41, 64, 45, 50, 50, 50,"Considerado como un mitico Pokemon durante anios hasta que fue encontrada una colonia submarina."));
		lista.add(new PokemonDTO("148", "Dragonair", 30, 4f, 16.5f, "Dragon", 61, 84, 65, 70, 70, 70,"Un mistico Pokemon rodeado de una sutil aura y con capacidad de cambiar la climatologia."));
		lista.add(new PokemonDTO("149", "Dragonite", 55, 2.2f, 210f, "Dragon", 91, 134, 95, 100, 100, 80,"Un Pokemon marino que es muy raro de ver. Dicen que es tan inteligente como los humanos."));
		lista.add(new PokemonDTO("150", "Mewtwo", 99, 2f, 122f, "Psiquico", 106, 110, 90, 154, 90, 130,"Fue creado por un cientifico tras anios de horribles experimentos de ingenieria genetica."));
		lista.add(new PokemonDTO("151", "Mew", 99, 0.4f, 4f, "Psiquico", 100, 100, 100, 100, 100, 100,"Es tan raro que muchos expertos opinan que es solo una ilusion. Solo unos pocos lo han visto."));
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
	public void crearTipoSecundario(String id, String nombre, int lv, float altura, float peso, String tipo, String tipo_sec,
			int hp, int ataque, int defensa, int atk_especial, int def_especial, int velocidad, String descripcion) {
		lista.add(new PokemonDTO(id, nombre, lv, altura, peso, tipo, tipo_sec, hp, ataque, defensa, atk_especial, def_especial, velocidad, descripcion));
		
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
