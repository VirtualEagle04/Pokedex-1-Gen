package co.edu.unbosque.model;

/**
 * Clase base que contiene todos los atributos que comparten los Pokemones.
 * @author Juan Esteban Quintero, Javier Felipe Meza, Joann Zamudio, Federico Vargas Rozo
 * @param id ID del Pokemon a crear.
 * @param nombre Nombre del Pokemon a crear.
 * @param lv Nivel (Level) del Pokemon a crear.
 * @param hp Puntos de Salud (Health Points) del Pokemon a crear.
 * @param ataque Ataque del Pokemon a crear.
 * @param defensa Defensa del Pokemon a crear.
 * @param atk_especial Ataque Especial del Pokemon a crear.
 * @param def_especial Defensa Especial del Pokemon a crear.
 * @param velocidad Velocidad del Pokemon a crear.
 * @param altura Altura (en metros) del Pokemon a crear.
 * @param peso Peso (en Kilogramos) del Pokemon a crear.
 * @param tipo Tipo primario del Pokemon a crear.
 * @param tipo_sec Tipo secundario del Pokemon a crear.
 * @param descripcion Descripcion del Pokemon a crear.
 * @param creado_usuario Utilizado para saber si el usuario lo ha creado.
 */

public class PokemonDTO {
	private String id;
	private String nombre;
	private int lv;
	private float altura;
	private float peso;
	
	//Estadisticas
	private String tipo;
	private String tipo_sec;
	private int hp;
	private int ataque;
	private int defensa;
	private int atk_especial;
	private int def_especial;
	private int velocidad;

	private String descripcion;
	private boolean creado_usuario;
	
	public PokemonDTO() {
		
	}
	/**
	 * Constructor de PokemonDTO con Tipo Secundario
	 * @param id ID del Pokemon a crear.
	 * @param nombre Nombre del Pokemon a crear.
	 * @param lv Nivel (Level) del Pokemon a crear.
	 * @param hp Puntos de Salud (Health Points) del Pokemon a crear.
	 * @param ataque Ataque del Pokemon a crear.
	 * @param defensa Defensa del Pokemon a crear.
	 * @param atk_especial Ataque Especial del Pokemon a crear.
	 * @param def_especial Defensa Especial del Pokemon a crear.
	 * @param velocidad Velocidad del Pokemon a crear.
	 * @param altura Altura (en metros) del Pokemon a crear.
	 * @param peso Peso (en Kilogramos) del Pokemon a crear.
	 * @param tipo Tipo primario del Pokemon a crear.
	 * @param tipo_sec Tipo secundario del Pokemon a crear.
	 * @param descripcion Descripcion del Pokemon a crear.
	 * @param creado_usuario Utilizado para saber si el usuario lo ha creado.
	 */
	
	//Con Tipo Secundario
	public PokemonDTO(String id, String nombre, int lv, float altura, float peso, String tipo, String tipo_sec, int hp, int ataque,
			int defensa, int atk_especial, int def_especial, int velocidad, String descripcion, boolean creado_usuario) {
		this.id = id;
		this.nombre = nombre;
		this.lv = lv;
		this.altura = altura;
		this.peso = peso;
		this.tipo = tipo;
		this.tipo_sec = tipo_sec;
		this.hp = hp;
		this.ataque = ataque;
		this.defensa = defensa;
		this.atk_especial = atk_especial;
		this.def_especial = def_especial;
		this.velocidad = velocidad;
		this.descripcion = descripcion;
		this.creado_usuario = creado_usuario;
	}
	
	/**
	 * Constructor de PokemonDTO sin Tipo Secundario
	 * @param id ID del Pokemon a crear.
	 * @param nombre Nombre del Pokemon a crear.
	 * @param lv Nivel (Level) del Pokemon a crear.
	 * @param hp Puntos de Salud (Health Points) del Pokemon a crear.
	 * @param ataque Ataque del Pokemon a crear.
	 * @param defensa Defensa del Pokemon a crear.
	 * @param atk_especial Ataque Especial del Pokemon a crear.
	 * @param def_especial Defensa Especial del Pokemon a crear.
	 * @param velocidad Velocidad del Pokemon a crear.
	 * @param altura Altura (en metros) del Pokemon a crear.
	 * @param peso Peso (en Kilogramos) del Pokemon a crear.
	 * @param tipo Tipo primario del Pokemon a crear.
	 * @param descripcion Descripcion del Pokemon a crear.
	 * @param creado_usuario Utilizado para saber si el usuario lo ha creado.
	 */
	
	//Sin Tipo Secundario
	public PokemonDTO(String id, String nombre, int lv, float altura, float peso, String tipo, int hp, int ataque, int defensa,
			int atk_especial, int def_especial, int velocidad, String descripcion, boolean creado_usuario) {
		this.id = id;
		this.nombre = nombre;
		this.lv = lv;
		this.altura = altura;
		this.peso = peso;
		this.tipo = tipo;
		this.hp = hp;
		this.ataque = ataque;
		this.defensa = defensa;
		this.atk_especial = atk_especial;
		this.def_especial = def_especial;
		this.velocidad = velocidad;
		this.descripcion = descripcion;
		this.creado_usuario = creado_usuario;
	}
	
	
	public boolean isCreado_usuario() {
		return creado_usuario;
	}
	public void setCreado_usuario(boolean creado_usuario) {
		this.creado_usuario = creado_usuario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo_sec() {
		return tipo_sec;
	}
	public void setTipo_sec(String tipo_sec) {
		this.tipo_sec = tipo_sec;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getAtk_especial() {
		return atk_especial;
	}
	public void setAtk_especial(int atk_especial) {
		this.atk_especial = atk_especial;
	}
	public int getDef_especial() {
		return def_especial;
	}
	public void setDef_especial(int def_especial) {
		this.def_especial = def_especial;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

}