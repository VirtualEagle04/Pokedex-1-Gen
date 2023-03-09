package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

/**
 * Clase que hereda de JPanel y que contiene la lista de Pokemones, el filtro de busqueda, el nombre y la imagen del Pokemon seleccionado, 
 * y el boton para seleccionar un Pokemon para eliminar.
 * @author Juan Esteban Quintero, Javier Felipe Meza, Joann Zamudio, Federico Vargas Rozo
 * @param panel_lista Panel que contiene la JList de los Pokemones.
 * @param panel_lista_bg Lamina que muestra la imagen de fondo del panel.
 * @param bg Archivo .gif del fondo animado.
 * @param fuente Fuente encapsulada dentro del proyecto para evitar la necesidad de instalar la fuente personalizada en cada dispositivo.
 * @param lista_eliminar Permite mostrar de manera eficiente todo el contenido del ArrayList que contiene los Pokemones. 
 * @param modelo_eliminar Permite almancenar de forma temporal la informacion que sera impuesta el el JList.
 * @param campo_filtro JTextField que funciona como filtro de busqueda de la lista.
 * @param indicador_id Lamina indicadora del ID del Pokemon.
 * @param indicador_nombre Lamina indicadora del Nombre del Pokemon.
 * @param indicador_busqueda Lamina indicadora de la funcionalidad de busqueda.
 * @param barra_lista JScrollPane que permite mostrar todos los elementos de la JList aun así no quepan en el panel.
 * @param boton_seleccionar Boton que permite seleccionar un Pokemon de la lista para ampliar sus estadisticas en el PanelInfo.
 * @param nombre_pokemon Lamina para mostrar el nombre del Pokemon actualmente seleccionado.
 * @param nombre_pokemon_panel Lamina que muestra la imagen de fondo del panel.
 * @param img_pokemon Objeto de la clase ImagenPokemon que permite mostrar la imagen del Pokemon actualmente seleccionado.
 * @param label_confirmar Lamina emergente que muestra la confirmacion previa a eliminar un Pokemon.
 * @param label_text1 Lamina que pregunta al usuario si desea eliminar el Pokemon seleccionado.
 * @param label_text2 Lamina que pregunta al usuario si desea eliminar el Pokemon seleccionado.
 * @param eliminar_confirmar Boton que elimina el Pokemon seleccionado de la lista.
 * @param eliminar_negar Boton que niega la eliminacion del Pokemon seleccionado de la lista.
 */

public class PanelEliminar extends JPanel {

	private JPanel panel_lista;
	private JLabel panel_lista_bg;
	private JLabel bg;
	private Font fuente;
	private JList<String> lista_eliminar;
	private DefaultListModel<String> modelo_eliminar;
	private JTextField campo_filtro;
	private JLabel indicador_id, indicador_nombre, indicador_busqueda;
	private JScrollPane barra_lista;
	private JButton boton_nombre, boton_id, boton_seleccionar;
	private JLabel nombre_pokemon, nombre_pokemon_panel;
	private JLabel label_confirmar, label_text1, label_text2;
	private JButton eliminar_confirmar, eliminar_negar;

	// Imagen Pokemon
	private ImagenPokemon img_pokemon;

	public PanelEliminar() {

		try {
			fuente = Font.createFont(Font.TRUETYPE_FONT, new File("src/Assets/Font/Pokemon Classic.ttf"));
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		setBounds(0, 50, 720, 670);
		setBackground(Color.DARK_GRAY);
		setLayout(null);

		// apartado de mostrar

		bg = new JLabel(new ImageIcon("src/Assets/GUI/bg.gif"));
		bg.setBounds(5, 6, 360, 440);

		// filtros para buscar

		indicador_busqueda = new JLabel();
		indicador_busqueda.setBounds(400, 5, 280, 20);
		indicador_busqueda.setText("ELIMINAR POKEMON POR:");
		indicador_busqueda.setForeground(Color.WHITE);
		indicador_busqueda.setFont(fuente);
		indicador_busqueda.setFont(indicador_busqueda.getFont().deriveFont(Font.BOLD, 12));

		indicador_nombre = new JLabel();
		indicador_nombre.setText("ID/NOMBRE: ");
		indicador_nombre.setBounds(370, 30, 120, 20);
		indicador_nombre.setForeground(Color.WHITE);
		indicador_nombre.setFont(fuente);
		indicador_nombre.setFont(indicador_nombre.getFont().deriveFont(Font.BOLD, 10));

		campo_filtro = new JTextField();
		campo_filtro.setBounds(480, 35, 200, 14);
		campo_filtro.setFont(fuente);
		campo_filtro.setFont(campo_filtro.getFont().deriveFont(Font.BOLD, 12));
		campo_filtro.setEditable(true);
		campo_filtro.setBorder(null);

		boton_nombre = new JButton();
		boton_nombre.setBounds(555, 35, 14, 14);
		boton_nombre.setBackground(Color.RED);

		indicador_id = new JLabel();
		indicador_id.setText("ID: ");
		indicador_id.setBounds(585, 30, 120, 20);
		indicador_id.setForeground(Color.WHITE);
		indicador_id.setFont(fuente);
		indicador_id.setFont(indicador_id.getFont().deriveFont(Font.BOLD, 10));

		boton_id = new JButton();
		boton_id.setBounds(690, 35, 14, 14);
		boton_id.setBackground(Color.RED);

		boton_seleccionar = new JButton();
		boton_seleccionar.setBounds(440, 427, 200, 20);
		boton_seleccionar.setBackground(Color.DARK_GRAY);
		boton_seleccionar.setForeground(Color.WHITE);
		boton_seleccionar.setFont(fuente);
		boton_seleccionar.setFont(boton_seleccionar.getFont().deriveFont(Font.BOLD, 12));
		boton_seleccionar.setIcon(new ImageIcon("src/Assets/GUI/botonSeleccionar.png"));
		boton_seleccionar.setBorder(null);

		// panel lista de pokemones
		lista_eliminar = new JList<>();
		lista_eliminar.setBounds(20, 0, 320, 360);
		lista_eliminar.setFont(fuente);
		lista_eliminar.setFont(lista_eliminar.getFont().deriveFont(Font.BOLD, 15));
		modelo_eliminar = new DefaultListModel<>();
		lista_eliminar.setModel(modelo_eliminar);
		lista_eliminar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		barra_lista = new JScrollPane(lista_eliminar);
		barra_lista.setBounds(15, 0, 314, 365);
		barra_lista.setBorder(null);

		panel_lista_bg = new JLabel(new ImageIcon("src/Assets/GUI/panelLista.png"));
		panel_lista_bg.setBounds(0, 0, 328, 360);

		panel_lista = new JPanel();
		panel_lista.setBounds(371, 60, 328, 360);
		panel_lista.setBackground(Color.DARK_GRAY);
		panel_lista.setLayout(null);
		panel_lista.add(barra_lista, JLayeredPane.DRAG_LAYER);
		panel_lista.add(panel_lista_bg, JLayeredPane.DEFAULT_LAYER);

		// Imagen Pokemon
		img_pokemon = new ImagenPokemon();
		img_pokemon.setBounds(110, 135, 150, 150);
		// Nombre Pokemon
		nombre_pokemon_panel = new JLabel(new ImageIcon("src/Assets/GUI/nombreMostrar.png"));
		nombre_pokemon_panel.setBounds(10, 355, 350, 88);
		nombre_pokemon_panel.setBackground(Color.BLACK);
		nombre_pokemon_panel.setForeground(Color.WHITE);
		nombre_pokemon_panel.setFont(fuente);
		nombre_pokemon_panel.setFont(nombre_pokemon_panel.getFont().deriveFont(Font.BOLD, 15));

		nombre_pokemon = new JLabel();
		nombre_pokemon.setBounds(25, 385, 320, 30);
		nombre_pokemon.setForeground(Color.BLACK);
		nombre_pokemon.setFont(fuente);
		nombre_pokemon.setFont(nombre_pokemon.getFont().deriveFont(Font.BOLD, 20));
		nombre_pokemon.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_confirmar = new JLabel(new ImageIcon("src/Assets/GUI/nombreMostrar.png"));
		label_confirmar.setBounds(10,10, 350, 88);
		label_confirmar.setVisible(false);
		
		label_text1 = new JLabel("Desea eliminar");
		label_text1.setBounds(10, -15, 350, 88);
		label_text1.setFont(fuente);
		label_text1.setFont(label_text1.getFont().deriveFont(Font.BOLD, 15));
		label_text1.setHorizontalAlignment(SwingConstants.CENTER);
		label_text1.setVisible(false);

		label_text2 = new JLabel("este Pokemon?");
		label_text2.setBounds(10, 0, 350, 88);
		label_text2.setFont(fuente);
		label_text2.setFont(label_text1.getFont().deriveFont(Font.BOLD, 15));
		label_text2.setHorizontalAlignment(SwingConstants.CENTER);
		label_text2.setVisible(false);
		
		eliminar_confirmar = new JButton();
		eliminar_confirmar.setBounds(75, 60 , 100, 20);
		eliminar_confirmar.setBackground(Color.DARK_GRAY);
		eliminar_confirmar.setForeground(Color.WHITE);
		eliminar_confirmar.setFont(fuente);
		eliminar_confirmar.setFont(eliminar_confirmar.getFont().deriveFont(Font.BOLD, 12));
		eliminar_confirmar.setIcon(new ImageIcon("src/Assets/GUI/eliminarSi.png"));
		eliminar_confirmar.setBorder(null);
		eliminar_confirmar.setVisible(false);
		
		eliminar_negar = new JButton();
		eliminar_negar.setBounds(195, 60 , 100, 20);
		eliminar_negar.setBackground(Color.DARK_GRAY);
		eliminar_negar.setForeground(Color.WHITE);
		eliminar_negar.setFont(fuente);
		eliminar_negar.setFont(eliminar_negar.getFont().deriveFont(Font.BOLD, 12));
		eliminar_negar.setIcon(new ImageIcon("src/Assets/GUI/eliminarNo.png"));
		eliminar_negar.setBorder(null);
		eliminar_negar.setVisible(false);
		
		add(label_text1, JLayeredPane.MODAL_LAYER);
		add(label_text2, JLayeredPane.MODAL_LAYER);
		add(eliminar_confirmar, JLayeredPane.MODAL_LAYER);
		add(eliminar_negar, JLayeredPane.MODAL_LAYER);
		add(label_confirmar, JLayeredPane.DRAG_LAYER);
		add(nombre_pokemon);
		add(nombre_pokemon_panel);
		add(img_pokemon);
		add(panel_lista, JLayeredPane.DEFAULT_LAYER);
		add(indicador_busqueda);
		add(indicador_nombre);
		add(campo_filtro);
		add(boton_seleccionar, JLayeredPane.DEFAULT_LAYER);
		add(bg);
		setVisible(true);

	}
	
	

	public JButton getEliminar_negar() {
		return eliminar_negar;
	}



	public void setEliminar_negar(JButton eliminar_negar) {
		this.eliminar_negar = eliminar_negar;
	}



	public JButton getEliminar_confirmar() {
		return eliminar_confirmar;
	}



	public void setEliminar_confirmar(JButton eliminar_confirmar) {
		this.eliminar_confirmar = eliminar_confirmar;
	}



	public JLabel getLabel_text2() {
		return label_text2;
	}



	public void setLabel_text2(JLabel label_text2) {
		this.label_text2 = label_text2;
	}



	public JLabel getLabel_confirmar() {
		return label_confirmar;
	}



	public void setLabel_confirmar(JLabel label_confirmar) {
		this.label_confirmar = label_confirmar;
	}



	public JLabel getLabel_text1() {
		return label_text1;
	}



	public void setLabel_text1(JLabel label_text) {
		this.label_text1 = label_text;
	}



	public JPanel getPanel_lista() {
		return panel_lista;
	}

	public void setPanel_lista(JPanel panel_lista) {
		this.panel_lista = panel_lista;
	}

	public JLabel getPanel_lista_bg() {
		return panel_lista_bg;
	}

	public void setPanel_lista_bg(JLabel panel_lista_bg) {
		this.panel_lista_bg = panel_lista_bg;
	}

	public JLabel getBg() {
		return bg;
	}

	public void setBg(JLabel bg) {
		this.bg = bg;
	}

	public Font getFuente() {
		return fuente;
	}

	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}

	public JList<String> getLista_eliminar() {
		return lista_eliminar;
	}

	public void setLista_eliminar(JList<String> lista_eliminar) {
		this.lista_eliminar = lista_eliminar;
	}

	public DefaultListModel<String> getModelo_eliminar() {
		return modelo_eliminar;
	}

	public void setModelo_eliminar(DefaultListModel<String> modelo_eliminar) {
		this.modelo_eliminar = modelo_eliminar;
	}

	public JTextField getCampo_filtro() {
		return campo_filtro;
	}

	public void setCampo_filtro(JTextField campo_filtro) {
		this.campo_filtro = campo_filtro;
	}

	public JLabel getIndicador_id() {
		return indicador_id;
	}

	public void setIndicador_id(JLabel indicador_id) {
		this.indicador_id = indicador_id;
	}

	public JLabel getIndicador_nombre() {
		return indicador_nombre;
	}

	public void setIndicador_nombre(JLabel indicador_nombre) {
		this.indicador_nombre = indicador_nombre;
	}

	public JLabel getIndicador_busqueda() {
		return indicador_busqueda;
	}

	public void setIndicador_busqueda(JLabel indicador_busqueda) {
		this.indicador_busqueda = indicador_busqueda;
	}

	public JScrollPane getBarra_lista() {
		return barra_lista;
	}

	public void setBarra_lista(JScrollPane barra_lista) {
		this.barra_lista = barra_lista;
	}

	public JButton getBoton_nombre() {
		return boton_nombre;
	}

	public void setBoton_nombre(JButton boton_nombre) {
		this.boton_nombre = boton_nombre;
	}

	public JButton getBoton_id() {
		return boton_id;
	}

	public void setBoton_id(JButton boton_id) {
		this.boton_id = boton_id;
	}

	public JButton getBoton_seleccionar() {
		return boton_seleccionar;
	}

	public void setBoton_seleccionar(JButton boton_seleccionar) {
		this.boton_seleccionar = boton_seleccionar;
	}

	public JLabel getNombre_pokemon() {
		return nombre_pokemon;
	}

	public void setNombre_pokemon(JLabel nombre_pokemon) {
		this.nombre_pokemon = nombre_pokemon;
	}

	public JLabel getNombre_pokemon_panel() {
		return nombre_pokemon_panel;
	}

	public void setNombre_pokemon_panel(JLabel nombre_pokemon_panel) {
		this.nombre_pokemon_panel = nombre_pokemon_panel;
	}

	public ImagenPokemon getImg_pokemon() {
		return img_pokemon;
	}

	public void setImg_pokemon(ImagenPokemon img_pokemon) {
		this.img_pokemon = img_pokemon;
	}
}
