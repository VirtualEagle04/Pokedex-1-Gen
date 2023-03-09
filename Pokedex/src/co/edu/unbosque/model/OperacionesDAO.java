package co.edu.unbosque.model;

/**
 * La clase abstracta engloba los aspectos generales de los Objetos.
 * Establece el nombre, el tipo de retorno y los parametros de las funciones, más no se le da funcionalidad a los metodos.
 * @author Juan Esteban Quintero, Javier Felipe Meza, Joann Zamudio, Federico Vargas Rozo
 *
 */

public abstract class OperacionesDAO {
	 
	public OperacionesDAO() {
			
	}
	/**
	 * Se llama unicamente cuando el Pokemon a crear contiene solo un Tipo.
	 * 
	 * @param id ID del Pokemon a crear.
	 * @param nombre Nombre del Pokemon a crear.
	 * @param lv Nivel (Level) del Pokemon a crear.
	 * @param hp Puntos de Salud (Health Points) del Pokemon a crear.
	 * @param ataque Ataque del Pokemon a crear.
	 * @param def Defensa del Pokemon a crear.
	 * @param atl_especial Ataque Especial del Pokemon a crear.
	 * @param def_especial Defensa Especial del Pokemon a crear.
	 * @param velocidad Velocidad del Pokemon a crear.
	 * @param altura Altura (en metros) del Pokemon a crear.
	 * @param peso Peso (en Kilogramos) del Pokemon a crear.
	 * @param tipo Tipo primario del Pokemon a crear.
	 * @param descripcion Descripcion del Pokemon a crear.
	 * @param creado_usuario Utilizado para saber si el usuario lo ha creado.
	 */
	
	public abstract void crearTipoIndividual(String id, String nombre, int lv, float altura, float peso, String tipo, int hp,
			int ataque, int defensa, int atl_especial, int def_especial, int velocidad, String descripcion, boolean creado_usuario);
	
	/**
	 * Se llama unicamente cuando el Pokemon a crear contiene un Tipo secundario.
	 * 
	 * @param id ID del Pokemon a crear.
	 * @param nombre Nombre del Pokemon a crear.
	 * @param lv Nivel (Level) del Pokemon a crear.
	 * @param hp Puntos de Salud (Health Points) del Pokemon a crear.
	 * @param ataque Ataque del Pokemon a crear.
	 * @param def Defensa del Pokemon a crear.
	 * @param atl_especial Ataque Especial del Pokemon a crear.
	 * @param def_especial Defensa Especial del Pokemon a crear.
	 * @param velocidad Velocidad del Pokemon a crear.
	 * @param altura Altura (en metros) del Pokemon a crear.
	 * @param peso Peso (en Kilogramos) del Pokemon a crear.
	 * @param tipo Tipo primario del Pokemon a crear.
	 * @param tipo_sec Tipo secundario del Pokemon a crear.
	 * @param descripcion Descripcion del Pokemon a crear.
	 * @param creado_usuario Utilizado para saber si el usuario lo ha creado.
	 */
	
	public abstract void crearTipoSecundario(String id, String nombre, int lv, float altura, float peso, String tipo, String tipo_sec,
			int hp, int ataque, int defensa, int atk_especial, int def_especial, int velocidad, String descripcion, boolean creado_usuario);
	
	/**
	 * Se llama unicamente cuando se desea eliminar un Pokemon por medio de su indice en la lista.
	 * @param del_index Indice del Pokemon a eliminar.
	 * @return Retorna true, si la eliminacion se completo con exito. De lo contrario, retorna false.
	 */
	
	public abstract boolean eliminarIndex(int del_index);
	
	
	
}
