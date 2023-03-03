package co.edu.unbosque.model;

public abstract class OperacionesDAO {
	 
	public OperacionesDAO() {
			
	}
	
	public abstract void crearTipoIndividual(int id, String nombre, int lv, float altura, float peso, String tipo, int hp,
			int ataque, int defensa, int atl_especial, int def_especial, int velocidad, String descripcion);
	
	public abstract void crearTipoSecundario(int id, String nombre, int lv, float altura, float peso, String tipo, String tipo_sec,
			int hp, int ataque, int defensa, int atk_especial, int def_especial, int velocidad, String descripcion);
	
	public abstract boolean eliminarIndex(int del_index);
	
	
	
}
