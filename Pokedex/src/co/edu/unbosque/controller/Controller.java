package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import co.edu.unbosque.model.PokemonDAO;
import co.edu.unbosque.view.VentanaPrincipal;

/**
 * Establece la lógica entre la interfaz de usuario y las representaciones planteadas en el modelo.
 * 
 * @author Juan Esteban Quintero, Javier Felipe Meza, Joann Zamudio, Federico Vargas Rozo
 * @param vp Objeto de la clase VentanaPrincipal.
 * @param pdao Objeto de la clase PokemonDAO.
 * @param check Variable para verificar si se ha creado, eliminado, o modificado un Pokemon de la lista PokemonDAO.
 * @param id_check Variable para verificar si el ID del Pokemon a crear previamente existe.
 * @param nombre_check Variable para verificar si el Nombre del Pokemon a crear previamente existe.
 * @param valores ArrayList para acceder facilmente a todos los Pokemones desde los filtros.
 * @param id ID del Pokemon a crear.
 * @param nombre Nombre del Pokemon a crear.
 * @param lv Nivel (Level) del Pokemon a crear.
 * @param hp Puntos de Salud (Health Points) del Pokemon a crear.
 * @param atk Ataque del Pokemon a crear.
 * @param def Defensa del Pokemon a crear.
 * @param satk Ataque Especial del Pokemon a crear.
 * @param sdef Defensa Especial del Pokemon a crear.
 * @param vel Velocidad del Pokemon a crear.
 * @param al Altura (en metros) del Pokemon a crear.
 * @param pe Peso (en Kilogramos) del Pokemon a crear.
 * 
 */

public class Controller implements ActionListener {

	private VentanaPrincipal vp;
	private PokemonDAO pdao;
	private boolean check;
	private boolean id_check;
	private boolean nombre_check;
	private ArrayList<String> valores;
	
	//Valores Creacion
	private String id, nombre;
	private int lv, hp, atk, def, satk, sdef, vel;
	private float al, pe;

	public Controller() {

	}
	/**
	 * Funcion para inicializar atributos, lectores, variables y añadir todos los Pokemones a las respectivas listas.
	 */

	public void run() {
		vp = new VentanaPrincipal();
		pdao = new PokemonDAO();
		agregarLectores();
		valores = new ArrayList<>();
		check = false;

		// Inicializando Lista
		cargarModelos();
		cargarValores();
	}

	/**
	 * Se crean los lectores para que todo JButton, JTextField y JList, permitan la lectura.
	 */
	
	public void agregarLectores() {
		
		//Filtros Eliminar
		vp.getPanel_eliminar().getCampo_filtro().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) { filtrarMostrarEliminar(); }

			@Override
			public void removeUpdate(DocumentEvent e) { filtrarMostrarEliminar(); }

			@Override
			public void changedUpdate(DocumentEvent e) {}
		});
		
		//Filtros Agregar
		vp.getPanel_agregar().getCampo_id().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) { filtrarID(); }

			@Override
			public void removeUpdate(DocumentEvent e) { filtrarID(); }

			@Override
			public void changedUpdate(DocumentEvent e) {}

		});
		
		vp.getPanel_agregar().getCampo_nombre().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) { filtrarNombre(); }

			@Override
			public void removeUpdate(DocumentEvent e) { filtrarNombre(); }

			@Override
			public void changedUpdate(DocumentEvent e) {}
		});
		
		
		
		//Filtro Mostrar
		vp.getPanel_mostrar().getCampo_filtro().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) { filtrarMostrar(); }

			@Override
			public void removeUpdate(DocumentEvent e) { filtrarMostrar(); }

			@Override
			public void changedUpdate(DocumentEvent e) {}

		});

		//Imagen y Nombre Mostrar
		vp.getPanel_mostrar().getLista_n().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				for (int i = 0; i < pdao.getLista().size(); i++) {

					try {
						if (vp.getPanel_mostrar().getLista_n().getSelectedValue().substring(0, 3).equals(pdao.getLista().get(i).getId())) {

							String directorio = "src/Assets/PokemonSprites/" + pdao.getLista().get(i).getNombre() + "_icon.png";
							vp.getPanel_mostrar().getImg_pokemon().cargarImagen(directorio);
							vp.getPanel_mostrar().getNombre_pokemon().setText(pdao.getLista().get(i).getNombre());

							break;
						} else {
							vp.getPanel_mostrar().getImg_pokemon().cargarImagen("src/Assets/PokemonSprites/000.png");
							vp.getPanel_mostrar().getNombre_pokemon().setText(pdao.getLista().get(i).getNombre());
						}
					}catch (NullPointerException e1) {
						
					}
				}

			}
		});
		//Imagen y Nombre Eliminar
		vp.getPanel_eliminar().getLista_eliminar().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				for (int i = 0; i < pdao.getLista().size(); i++) {

					try {
						if (vp.getPanel_eliminar().getLista_eliminar().getSelectedValue().substring(0, 3).equals(pdao.getLista().get(i).getId())) {

							String directorio = "src/Assets/PokemonSprites/" + pdao.getLista().get(i).getNombre() + "_icon.png";
							vp.getPanel_eliminar().getImg_pokemon().cargarImagen(directorio);
							vp.getPanel_eliminar().getNombre_pokemon().setText(pdao.getLista().get(i).getNombre());

							break;
						} else {
							vp.getPanel_eliminar().getImg_pokemon().cargarImagen("src/Assets/PokemonSprites/000.png");
							vp.getPanel_eliminar().getNombre_pokemon().setText(pdao.getLista().get(i).getNombre());
						}
					}catch (NullPointerException e1) {
						
					}
				}

			}
		});

		vp.getPanel_crud().getAgregar().addActionListener(this);
		vp.getPanel_crud().getAgregar().setActionCommand("CrudAgregar");

		vp.getPanel_agregar().getConfirmar().addActionListener(this);
		vp.getPanel_agregar().getConfirmar().setActionCommand("AgregConfirmar");

		vp.getPanel_crud().getEliminar().addActionListener(this);
		vp.getPanel_crud().getEliminar().setActionCommand("CrudEliminar");

		vp.getPanel_crud().getMostrar().addActionListener(this);
		vp.getPanel_crud().getMostrar().setActionCommand("CrudMostrar");

		vp.getPanel_mostrar().getBoton_seleccionar().addActionListener(this);
		vp.getPanel_mostrar().getBoton_seleccionar().setActionCommand("SeleccionInfo");
		
		vp.getPanel_eliminar().getBoton_seleccionar().addActionListener(this);
		vp.getPanel_eliminar().getBoton_seleccionar().setActionCommand("SeleccionEliminar");
		
		vp.getPanel_eliminar().getEliminar_confirmar().addActionListener(this);
		vp.getPanel_eliminar().getEliminar_confirmar().setActionCommand("EliminarConfirmar");
		
		vp.getPanel_eliminar().getEliminar_negar().addActionListener(this);
		vp.getPanel_eliminar().getEliminar_negar().setActionCommand("EliminarNegar");

	}
	/**
	 * Itera por todos los valores de la lista perteneciente a PokemonesDAO e
	 * ingresa el ID y el Nombre, concatonados, a el ArrayList Valores.
	 */
	
	public void cargarValores() {
		for (int i = 0; i < pdao.getLista().size(); i++) {
			valores.add(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
		}	
	}
	
	/**
	 * Itera por todos los valores de la lista perteneciente a PokemonesDAO e
	 * ingresa el ID y el Nombre, concatonados, a los DefaultListModel de las 
	 * JList pertenecientes a PanelMostrar y PanelEliminar.
	 * 
	 */
	
	public void cargarModelos() {
		//CRUD Mostrar
		DefaultListModel<String> temp_modelo_mostrar = vp.getPanel_mostrar().getModelo();
		temp_modelo_mostrar.clear();
		for(int i = 0; i < pdao.getLista().size(); i++) {
			temp_modelo_mostrar.addElement(pdao.getLista().get(i).getId()+" "+pdao.getLista().get(i).getNombre());
		}
		vp.getPanel_mostrar().getLista_n().setModel(temp_modelo_mostrar);
		
		//CRUD Eliminar
		DefaultListModel<String> temp_modelo_eliminar = vp.getPanel_eliminar().getModelo_eliminar();
		temp_modelo_eliminar.clear();
		for (int i = 0; i < pdao.getLista().size(); i++) {
			temp_modelo_eliminar.addElement(pdao.getLista().get(i).getId()+" "+pdao.getLista().get(i).getNombre());
		}
		vp.getPanel_eliminar().getLista_eliminar().setModel(temp_modelo_eliminar);
	}
	
	
	/**
	 * Recibe en tiempo real el String de cierto JTextField y lo almacena.
	 */
	
	//Filtros ID
	public void filtrarID() {
		String textfiltro = vp.getPanel_agregar().getCampo_id().getText();
		filtrarValoresID(textfiltro);
	}
	/**
	 * Itera por todos los valores de la lista, hasta encontrar todos los que contengan el filtro.
	 * Revisa si el ID ingresado, le pertenece a otro Pokemon.
	 * @param filtro String anteriormente almacenado.
	 */
	
	public void filtrarValoresID(String filtro) {
		for (int i = 0; i < pdao.getLista().size(); i++) {
			if(pdao.getLista().get(i).getId().equalsIgnoreCase(filtro) || filtro.equalsIgnoreCase("000")) {
				vp.getPanel_agregar().getCampo_id().setForeground(Color.RED);
				id_check = false;
				break;
			}else {
				vp.getPanel_agregar().getCampo_id().setForeground(Color.BLACK);
				id_check = true;
			}
		}
	}
	
	/**
	 * Recibe en tiempo real el String de cierto JTextField y lo almacena.
	 */
	
	//Filtos Nombre
	public void filtrarNombre() {
		String textfiltro = vp.getPanel_agregar().getCampo_nombre().getText();
		filtrarValoresNombre(textfiltro);
	}
	
	/**
	 * Itera por todos los valores de la lista, hasta encontrar todos los que contengan el filtro.
	 * Revisa si el Nombre ingresado, le pertenece a otro Pokemon.
	 * @param filtro String anteriormente almacenado.
	 */
	
	public void filtrarValoresNombre(String filtro) {
		for (int i = 0; i < pdao.getLista().size(); i++) {
			if(pdao.getLista().get(i).getNombre().equalsIgnoreCase(filtro)) {
				vp.getPanel_agregar().getCampo_nombre().setForeground(Color.RED);
				nombre_check = false;
				break;
			}else {
				vp.getPanel_agregar().getCampo_nombre().setForeground(Color.BLACK);
				nombre_check = true;
			}
		}
	}
	
	/**
	 * Recibe en tiempo real el String de cierto JTextField y lo almacena.
	 */
		
	//Filtros Lista
	public void filtrarMostrar() {
		String textfiltro = vp.getPanel_mostrar().getCampo_filtro().getText();
		filtrarModelo((DefaultListModel<String>) vp.getPanel_mostrar().getLista_n().getModel(), textfiltro);
	}
	
	/**
	 * Itera por todos los valores de la JList hasta encontrar aquellos que contengan el filtro.
	 * @param modelo DefaultListModel del JList en el Panel de Mostrar.
	 * @param filtro String anteriormente almancenado.
	 */

	public void filtrarModelo(DefaultListModel<String> modelo, String filtro) {
		modelo.clear();
		for (int i = 0; i < valores.size(); i++) {
			String s = valores.get(i);
			if (s.toLowerCase().contains(filtro.toLowerCase())) {
				modelo.addElement(s);
			}
		}
	}
	
	/**
	 * Recibe en tiempo real el String de cierto JTextField y lo almacena.
	 */
	
	//Filtro Eliminar
	public void filtrarMostrarEliminar() {
		String textfiltro = vp.getPanel_eliminar().getCampo_filtro().getText();
		filtrarModeloEliminar((DefaultListModel<String>) vp.getPanel_eliminar().getLista_eliminar().getModel(), textfiltro);
	}

	/**
	 * Itera por todos los valores de la JList hasta encontrar aquellos que contengan el filtro.
	 * @param modelo DefaultListModel del JList en el Panel de Eliminar.
	 * @param filtro String anteriormente almancenado.
	 */
	
	public void filtrarModeloEliminar(DefaultListModel<String> modelo, String filtro) {
		modelo.clear();
		for (int i = 0; i < valores.size(); i++) {
			String s = valores.get(i);
			if (s.toLowerCase().contains(filtro.toLowerCase())) {
				modelo.addElement(s);
			}
		}
	}
	
	/**
	 * Se llama cuando se presiona un JButton previamente inicializado.
	 * Establece los comandos y la funcionalidad de cada elemento interactivo.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "CrudAgregar": {
			vp.getPanel_eliminar().getImg_pokemon().setIcon(null);
			vp.getPanel_eliminar().getNombre_pokemon().setText("");
			vp.getPanel_eliminar().getLista_eliminar().clearSelection();
			vp.getPanel_mostrar().getImg_pokemon().setIcon(null);
			vp.getPanel_mostrar().getNombre_pokemon().setText("");
			vp.getPanel_mostrar().getLista_n().clearSelection();
			vp.getPanel_eliminar().getLabel_confirmar().setVisible(false);
			vp.getPanel_eliminar().getLabel_text1().setVisible(false);
			vp.getPanel_eliminar().getLabel_text2().setVisible(false);
			vp.getPanel_eliminar().getEliminar_confirmar().setVisible(false);
			vp.getPanel_eliminar().getEliminar_negar().setVisible(false);
			vp.getPanel_eliminar().getCampo_filtro().setText("");
			vp.getPanel_mostrar().getCampo_filtro().setText("");
			
			
			vp.getPanel_agregar().setVisible(true);
			vp.getPanel_mostrar().setVisible(false);
			vp.getPanel_eliminar().setVisible(false);
			vp.getPanel_info().getDesc().setVisible(false);

			check = false;

			break;
		}
		case "CrudEliminar": {
			vp.getPanel_mostrar().getImg_pokemon().setIcon(null);
			vp.getPanel_mostrar().getNombre_pokemon().setText("");
			vp.getPanel_mostrar().getLista_n().clearSelection();
			vp.getPanel_mostrar().getCampo_filtro().setText("");
			
			vp.getPanel_agregar().setVisible(false);
			vp.getPanel_mostrar().setVisible(false);
			vp.getPanel_eliminar().setVisible(true);

			if (check) {
				for (int i = 0; i < pdao.getLista().size(); i++) {
						vp.getPanel_mostrar().getModelo().addElement(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
						vp.getPanel_eliminar().getModelo_eliminar().addElement(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
						valores.add(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
					
					check = false;
				}
			}

			break;
		}
		case "CrudMostrar": {
			vp.getPanel_eliminar().getImg_pokemon().setIcon(null);
			vp.getPanel_eliminar().getNombre_pokemon().setText("");
			vp.getPanel_eliminar().getLista_eliminar().clearSelection();
			vp.getPanel_eliminar().getLabel_confirmar().setVisible(false);
			vp.getPanel_eliminar().getLabel_text1().setVisible(false);
			vp.getPanel_eliminar().getLabel_text2().setVisible(false);
			vp.getPanel_eliminar().getEliminar_confirmar().setVisible(false);
			vp.getPanel_eliminar().getEliminar_negar().setVisible(false);
			vp.getPanel_eliminar().getCampo_filtro().setText("");
			
			vp.getPanel_agregar().setVisible(false);
			vp.getPanel_mostrar().setVisible(true);
			vp.getPanel_eliminar().setVisible(false);
			
			
			
			if (check) {
				vp.getPanel_mostrar().getModelo().clear();
				vp.getPanel_eliminar().getModelo_eliminar().clear();
				for (int i = 0; i < pdao.getLista().size(); i++) {
						vp.getPanel_mostrar().getModelo().addElement(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
						vp.getPanel_eliminar().getModelo_eliminar().addElement(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
						valores.add(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
					
					check = false;
				}
			}
			break;
		}
		case "SeleccionEliminar": {
			
			if(!vp.getPanel_eliminar().getLista_eliminar().isSelectionEmpty()) {
				vp.getPanel_eliminar().getLabel_confirmar().setVisible(true);
				vp.getPanel_eliminar().getLabel_text1().setVisible(true);
				vp.getPanel_eliminar().getLabel_text2().setVisible(true);
				vp.getPanel_eliminar().getEliminar_confirmar().setVisible(true);
				vp.getPanel_eliminar().getEliminar_negar().setVisible(true);
			}
			break;
		}
		case "EliminarConfirmar": {
			
			try {
				
				String temp_del_id = vp.getPanel_eliminar().getLista_eliminar().getSelectedValue().substring(0, 3);
				
				for (int i = 0; i < pdao.getLista().size(); i++) {
					if(pdao.getLista().get(i).getId().equalsIgnoreCase(temp_del_id)) {
						pdao.eliminarIndex(i);
						valores.remove(i);
					}
				}
				//Borrar y Sobre-escibir
				vp.getPanel_eliminar().getImg_pokemon().setIcon(null);
				vp.getPanel_eliminar().getNombre_pokemon().setText("");
				
				vp.getPanel_mostrar().getModelo().clear();
				vp.getPanel_eliminar().getModelo_eliminar().clear();
				for (int i = 0; i < valores.size(); i++) {
					vp.getPanel_mostrar().getModelo().addElement(valores.get(i));
					vp.getPanel_eliminar().getModelo_eliminar().addElement(valores.get(i));
				}
				
				vp.getPanel_eliminar().getLabel_confirmar().setVisible(false);
				vp.getPanel_eliminar().getLabel_text1().setVisible(false);
				vp.getPanel_eliminar().getLabel_text2().setVisible(false);
				vp.getPanel_eliminar().getEliminar_confirmar().setVisible(false);
				vp.getPanel_eliminar().getEliminar_negar().setVisible(false);
				vp.getPanel_eliminar().getCampo_filtro().setText("");
				
				check = true;
			}catch (NullPointerException e1) {}
			
			
			break;
		}
		case "EliminarNegar": {
			
			vp.getPanel_eliminar().getLabel_confirmar().setVisible(false);
			vp.getPanel_eliminar().getLabel_text1().setVisible(false);
			vp.getPanel_eliminar().getLabel_text2().setVisible(false);
			vp.getPanel_eliminar().getEliminar_confirmar().setVisible(false);
			vp.getPanel_eliminar().getEliminar_negar().setVisible(false);
			
			check = false;
			
			break;
		}
		case "SeleccionInfo": {
			String sel = "";
			check = false;
			if(vp.getPanel_mostrar().getLista_n().getSelectedValue() == null) {
				
			}else {
				vp.getPanel_mostrar().getNombre_pokemon().setText("");
				vp.getPanel_mostrar().getImg_pokemon().setIcon(null);
				
				
				vp.getPanel_info().setVisible(true);
				vp.getPanel_agregar().setVisible(false);
				vp.getPanel_eliminar().setVisible(false);
				vp.getPanel_mostrar().setVisible(false);
				vp.getPanel_info().getDesc().setVisible(true);

				try {
					sel = vp.getPanel_mostrar().getLista_n().getSelectedValue();
				}catch (NullPointerException e1) {}
				
				try {
					for (int i = 0; i < pdao.getLista().size(); i++) {
						if (pdao.getLista().get(i).getId().equals(sel.substring(0, 3))) {
							if(pdao.getLista().get(i).isCreado_usuario()) {
								vp.getPanel_info().getImg_pokemon().cargarImagen("src/Assets/PokemonSprites/000.png");
							}else {
								vp.getPanel_info().getImg_pokemon().cargarImagen("src/Assets/PokemonInfoSprites/" + sel.substring(0, 3) + ".png");
							}
							vp.getPanel_info().getId().setText("No." + pdao.getLista().get(i).getId());
							vp.getPanel_info().getNombre().setText(pdao.getLista().get(i).getNombre().toUpperCase());
							vp.getPanel_info().getHp().setText(String.valueOf(pdao.getLista().get(i).getHp()) + "/"+ String.valueOf(pdao.getLista().get(i).getHp()));
							vp.getPanel_info().getAtk().setText(String.valueOf(pdao.getLista().get(i).getAtaque()));
							vp.getPanel_info().getDef().setText(String.valueOf(pdao.getLista().get(i).getDefensa()));
							vp.getPanel_info().getSatk().setText(String.valueOf(pdao.getLista().get(i).getAtk_especial()));
							vp.getPanel_info().getSdef().setText(String.valueOf(pdao.getLista().get(i).getDef_especial()));
							vp.getPanel_info().getVel().setText(String.valueOf(pdao.getLista().get(i).getVelocidad()));
							vp.getPanel_info().getLv().setText(String.valueOf(pdao.getLista().get(i).getLv()));
							vp.getPanel_info().getTipo1_img().cargarImagen("src/Assets/Tipos/tipo" + pdao.getLista().get(i).getTipo() + ".png");

							if (pdao.getLista().get(i).getTipo_sec() == null) {
								vp.getPanel_info().getTipo2_img().cargarImagen("src/Assets/Tipos/tipoNada.png");
							} else {
								vp.getPanel_info().getTipo2_img().cargarImagen("src/Assets/Tipos/tipo" + pdao.getLista().get(i).getTipo_sec() + ".png");
							}
							vp.getPanel_info().getPeso().setText(String.valueOf(pdao.getLista().get(i).getPeso()));
							vp.getPanel_info().getAlt().setText(String.valueOf(pdao.getLista().get(i).getAltura()));
							vp.getPanel_info().getDesc().setText(pdao.getLista().get(i).getDescripcion());
							break;
						} 
//						else {
//							vp.getPanel_info().getImg_pokemon().cargarImagen("src/Assets/PokemonSprites/000.png");
//						}
					}
				} catch (NullPointerException e1) {}
			}
			
			
			
			vp.getPanel_mostrar().setModelo(vp.getPanel_mostrar().getModelo());
			vp.getPanel_mostrar().getModelo().clear();
			vp.getPanel_eliminar().getModelo_eliminar().clear();
			for (int i = 0; i < valores.size(); i++) {
				vp.getPanel_mostrar().getModelo().addElement(valores.get(i));
				vp.getPanel_eliminar().getModelo_eliminar().addElement(valores.get(i));
			}
			vp.getPanel_mostrar().getCampo_filtro().setText("");

			break;
		}
		case "AgregConfirmar": {
			int validacion = 0;
			boolean letras = false;

			if (vp.getPanel_agregar().getCampo_tipo_sec().getSelectedItem().equals("Sin 2' Tipo")) {

				int len = vp.getPanel_agregar().getCampo_id().getText().length();
				for(int i = 0; i < len; i++) {
					if(Character.isLetter(vp.getPanel_agregar().getCampo_id().getText().charAt(i))) {
						letras = true;
						break;
					}
				}
				if(letras) {
					vp.getPanel_agregar().getCampo_id().setForeground(Color.RED);
				}else {
					vp.getPanel_agregar().getCampo_id().setForeground(Color.BLACK);
					id = vp.getPanel_agregar().getCampo_id().getText();
					validacion++;
				}
				
				if(nombre_check) {
					nombre = vp.getPanel_agregar().getCampo_nombre().getText();
					validacion++;
				}
				
				try {
					vp.getPanel_agregar().getCampo_lv().setForeground(Color.BLACK);
					String lv_temp = vp.getPanel_agregar().getCampo_lv().getText();
					lv = Integer.parseInt(lv_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_lv().setForeground(Color.RED);
					
				}

				try {
					vp.getPanel_agregar().getCampo_al().setForeground(Color.BLACK);
					String al_temp = vp.getPanel_agregar().getCampo_al().getText();
					al = Float.parseFloat(al_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_al().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_pe().setForeground(Color.BLACK);
					String pe_temp = vp.getPanel_agregar().getCampo_pe().getText();
					pe = Float.parseFloat(pe_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_pe().setForeground(Color.RED);

				}
				
				try {
					vp.getPanel_agregar().getCampo_hp().setForeground(Color.BLACK);
					String hp_temp = vp.getPanel_agregar().getCampo_hp().getText();
					hp = Integer.parseInt(hp_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_hp().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_atk().setForeground(Color.BLACK);
					String atk_temp = vp.getPanel_agregar().getCampo_atk().getText();
					atk = Integer.parseInt(atk_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_atk().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_def().setForeground(Color.BLACK);
					String def_temp = vp.getPanel_agregar().getCampo_def().getText();
					def = Integer.parseInt(def_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_def().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_satk().setForeground(Color.BLACK);
					String satk_temp = vp.getPanel_agregar().getCampo_satk().getText();
					satk = Integer.parseInt(satk_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_satk().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_sdef().setForeground(Color.BLACK);
					String sdef_temp = vp.getPanel_agregar().getCampo_sdef().getText();
					sdef = Integer.parseInt(sdef_temp);
					validacion++;
				}catch (NumberFormatException e2){
					vp.getPanel_agregar().getCampo_sdef().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_vel().setForeground(Color.BLACK);
					String vel_temp = vp.getPanel_agregar().getCampo_vel().getText();
					vel = Integer.parseInt(vel_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_vel().setForeground(Color.RED);
					
				}
				

				String tipo1 = vp.getPanel_agregar().getCampo_tipo().getSelectedItem() + "";

				String desc = vp.getPanel_agregar().getCampo_descripcion().getText();
				if(desc.isBlank()) {
					vp.getPanel_agregar().getInd_descripcion().setForeground(Color.RED);
				}else {
					vp.getPanel_agregar().getInd_descripcion().setForeground(Color.DARK_GRAY);
					validacion++;
				}
				
				if(validacion == 12) {
					pdao.crearTipoIndividual(id + "", nombre, lv, al, pe, tipo1, hp, atk, def, satk, sdef, vel, desc, true);
					if(Integer.parseInt(id)-1 >= vp.getPanel_mostrar().getModelo().size()) {
						vp.getPanel_mostrar().getModelo().add(vp.getPanel_mostrar().getModelo().size(), id+" "+nombre);
					}else {
						vp.getPanel_mostrar().getModelo().add(Integer.parseInt(id)-1, id+" "+nombre);
					}
					
					if(Integer.parseInt(id)-1 >= vp.getPanel_eliminar().getModelo_eliminar().size()) {
						vp.getPanel_eliminar().getModelo_eliminar().add(vp.getPanel_eliminar().getModelo_eliminar().size(), id+" "+nombre);
					}else {
						vp.getPanel_eliminar().getModelo_eliminar().add(Integer.parseInt(id)-1, id+" "+nombre);
					}
					if(Integer.parseInt(id)-1 >= valores.size()) {
						valores.add(valores.size(), id+" "+nombre);
					}else {
						valores.add(Integer.parseInt(id)-1, id+" "+nombre);
					}
					
					
					
					check = false;
					vp.getPanel_mostrar().setVisible(true);
					vp.getPanel_agregar().setVisible(false);
					vp.getPanel_agregar().getCampo_id().setText("");
					vp.getPanel_agregar().getCampo_nombre().setText("");
					vp.getPanel_agregar().getCampo_lv().setText("");
					vp.getPanel_agregar().getCampo_hp().setText("");
					vp.getPanel_agregar().getCampo_atk().setText("");
					vp.getPanel_agregar().getCampo_def().setText("");
					vp.getPanel_agregar().getCampo_satk().setText("");
					vp.getPanel_agregar().getCampo_sdef().setText("");
					vp.getPanel_agregar().getCampo_vel().setText("");
					vp.getPanel_agregar().getCampo_al().setText("");
					vp.getPanel_agregar().getCampo_pe().setText("");
					vp.getPanel_agregar().getCampo_descripcion().setText("");
					vp.getPanel_agregar().getCampo_tipo().setSelectedIndex(0);
					vp.getPanel_agregar().getCampo_tipo_sec().setSelectedIndex(0);
					vp.getPanel_agregar().getCampo_tipo().setForeground(Color.DARK_GRAY);
					vp.getPanel_agregar().getCampo_tipo_sec().setForeground(Color.DARK_GRAY);
					
				}
				break;

			} else {
				int validacion2 = 0;
				boolean letras2 = false;
				
				int len = vp.getPanel_agregar().getCampo_id().getText().length();
				for(int i = 0; i < len; i++) {
					if(Character.isLetter(vp.getPanel_agregar().getCampo_id().getText().charAt(i))) {
						letras2 = true;
						break;
					}
				}
				if(letras2) {
					vp.getPanel_agregar().getCampo_id().setForeground(Color.RED);
				}else {
					vp.getPanel_agregar().getCampo_id().setForeground(Color.BLACK);
					id = vp.getPanel_agregar().getCampo_id().getText();
					validacion2++;
				}
				
				if(nombre_check) {
					nombre = vp.getPanel_agregar().getCampo_nombre().getText();
					validacion2++;
				}

				try {
					vp.getPanel_agregar().getCampo_lv().setForeground(Color.BLACK);
					String lv_temp = vp.getPanel_agregar().getCampo_lv().getText();
					lv = Integer.parseInt(lv_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_lv().setForeground(Color.RED);
					
				}

				try {
					vp.getPanel_agregar().getCampo_al().setForeground(Color.BLACK);
					String al_temp = vp.getPanel_agregar().getCampo_al().getText();
					al = Float.parseFloat(al_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_al().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_pe().setForeground(Color.BLACK);
					String pe_temp = vp.getPanel_agregar().getCampo_pe().getText();
					pe = Float.parseFloat(pe_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_pe().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_hp().setForeground(Color.BLACK);
					String hp_temp = vp.getPanel_agregar().getCampo_hp().getText();
					hp = Integer.parseInt(hp_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_hp().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_atk().setForeground(Color.BLACK);
					String atk_temp = vp.getPanel_agregar().getCampo_atk().getText();
					atk = Integer.parseInt(atk_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_atk().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_def().setForeground(Color.BLACK);
					String def_temp = vp.getPanel_agregar().getCampo_def().getText();
					def = Integer.parseInt(def_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_def().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_satk().setForeground(Color.BLACK);
					String satk_temp = vp.getPanel_agregar().getCampo_satk().getText();
					satk = Integer.parseInt(satk_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_satk().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_sdef().setForeground(Color.BLACK);
					String sdef_temp = vp.getPanel_agregar().getCampo_sdef().getText();
					sdef = Integer.parseInt(sdef_temp);
					validacion2++;
				}catch (NumberFormatException e2){
					vp.getPanel_agregar().getCampo_sdef().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_vel().setForeground(Color.BLACK);
					String vel_temp = vp.getPanel_agregar().getCampo_vel().getText();
					vel = Integer.parseInt(vel_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_vel().setForeground(Color.RED);
					
				}

				String tipo1 = vp.getPanel_agregar().getCampo_tipo().getSelectedItem() + "";

				String tipo2 = vp.getPanel_agregar().getCampo_tipo_sec().getSelectedItem() + "";
				
				if(tipo1.equals(tipo2)) {
					vp.getPanel_agregar().getCampo_tipo().setForeground(Color.RED);
					vp.getPanel_agregar().getCampo_tipo_sec().setForeground(Color.RED);
					
				}else {
					vp.getPanel_agregar().getCampo_tipo().setForeground(Color.BLACK);
					vp.getPanel_agregar().getCampo_tipo_sec().setForeground(Color.BLACK);
					validacion2++;
				}

				String desc = vp.getPanel_agregar().getCampo_descripcion().getText();
				if(desc.isBlank()) {
					vp.getPanel_agregar().getInd_descripcion().setForeground(Color.RED);
				}else {
					vp.getPanel_agregar().getInd_descripcion().setForeground(Color.DARK_GRAY);
					validacion2++;
				}
				
				if(validacion2 == 13) {
					pdao.crearTipoSecundario(id + "", nombre, lv, al, pe, tipo1, tipo2, hp, atk, def, satk, sdef, vel, desc, true);
					if(Integer.parseInt(id)-1 >= vp.getPanel_mostrar().getModelo().size()) {
						vp.getPanel_mostrar().getModelo().add(vp.getPanel_mostrar().getModelo().size(), id+" "+nombre);
					}else {
						vp.getPanel_mostrar().getModelo().add(Integer.parseInt(id)-1, id+" "+nombre);
					}
					
					if(Integer.parseInt(id)-1 >= vp.getPanel_eliminar().getModelo_eliminar().size()) {
						vp.getPanel_eliminar().getModelo_eliminar().add(vp.getPanel_eliminar().getModelo_eliminar().size(), id+" "+nombre);
					}else {
						vp.getPanel_eliminar().getModelo_eliminar().add(Integer.parseInt(id)-1, id+" "+nombre);
					}
					if(Integer.parseInt(id)-1 >= valores.size()) {
						valores.add(valores.size(), id+" "+nombre);
					}else {
						valores.add(Integer.parseInt(id)-1, id+" "+nombre);
					}
					check = false;
					vp.getPanel_mostrar().setVisible(true);
					vp.getPanel_agregar().setVisible(false);
					vp.getPanel_agregar().getCampo_id().setText("");
					vp.getPanel_agregar().getCampo_nombre().setText("");
					vp.getPanel_agregar().getCampo_lv().setText("");
					vp.getPanel_agregar().getCampo_hp().setText("");
					vp.getPanel_agregar().getCampo_atk().setText("");
					vp.getPanel_agregar().getCampo_def().setText("");
					vp.getPanel_agregar().getCampo_satk().setText("");
					vp.getPanel_agregar().getCampo_sdef().setText("");
					vp.getPanel_agregar().getCampo_vel().setText("");
					vp.getPanel_agregar().getCampo_al().setText("");
					vp.getPanel_agregar().getCampo_pe().setText("");
					vp.getPanel_agregar().getCampo_descripcion().setText("");
					vp.getPanel_agregar().getCampo_tipo().setSelectedIndex(0);
					vp.getPanel_agregar().getCampo_tipo_sec().setSelectedIndex(0);
					vp.getPanel_agregar().getCampo_tipo().setForeground(Color.DARK_GRAY);
					vp.getPanel_agregar().getCampo_tipo_sec().setForeground(Color.DARK_GRAY);
				}

				
				
			}

			break;
		}

		default:
		}

	}

}
