package co.edu.unbosque.model;

public class PokemonDTO {
	private int id;
	private String nombre;
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
	
	public PokemonDTO() {
		
	}
	//Con Tipo Secundario
	public PokemonDTO(int id, String nombre, float altura, float peso, String tipo, String tipo_sec, int hp, int ataque,
			int defensa, int atk_especial, int def_especial, int velocidad, String descripcion) {
		this.id = id;
		this.nombre = nombre;
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
	}
	//Sin Tipo Secundario
	public PokemonDTO(int id, String nombre, float altura, float peso, String tipo, int hp, int ataque, int defensa,
			int atk_especial, int def_especial, int velocidad, String descripcion) {
		this.id = id;
		this.nombre = nombre;
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
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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