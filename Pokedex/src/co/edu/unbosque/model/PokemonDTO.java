package co.edu.unbosque.model;

public class PokemonDTO {
	private int id;
	private String nombre;
	private String apodo;
	private float altura;
	private float peso;
	private String descripcion;
	
	//Estadisticas
	private String tipo;
	private int hp;
	private int ataque;
	private int defensa;
	private int especial;
	private int velocidad;
	
	public PokemonDTO() {
		
	}

	public PokemonDTO(int id, String nombre, String apodo, float altura, float peso, String descripcion, String tipo,
			int hp, int ataque, int defensa, int especial, int velocidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
		this.altura = altura;
		this.peso = peso;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.hp = hp;
		this.ataque = ataque;
		this.defensa = defensa;
		this.especial = especial;
		this.velocidad = velocidad;
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

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public int getEspecial() {
		return especial;
	}

	public void setEspecial(int especial) {
		this.especial = especial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
	
	
	
}
