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

public class PanelMostrar extends JPanel {

	private JPanel panel_lista;
	private JLabel panel_lista_bg;
	private JLabel bg;
	private Font fuente;
	private JList<String> lista_n;
	private DefaultListModel<String> modelo;
	private JTextField campo_filtro;
	private JLabel indicador_id, indicador_nombre, indicador_busqueda;
	private JScrollPane barra_lista;
	private JButton boton_nombre, boton_id, boton_seleccionar;
	private JLabel nombre_pokemon, nombre_pokemon_panel;
	
	//Imagen Pokemon
	private ImagenPokemon img_pokemon;

	public PanelMostrar() {

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
		bg.setBounds(5,6,360,440);

		// filtros para buscar

		indicador_busqueda = new JLabel();
		indicador_busqueda.setBounds(420, 5, 260, 20);
		indicador_busqueda.setText("BUSCAR POKEMON POR:");
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
		boton_seleccionar.setBounds(440,427,200,20);
		boton_seleccionar.setBackground(Color.DARK_GRAY);
		boton_seleccionar.setForeground(Color.WHITE);
		boton_seleccionar.setFont(fuente);
		boton_seleccionar.setFont(boton_seleccionar.getFont().deriveFont(Font.BOLD,12));
		boton_seleccionar.setIcon(new ImageIcon("src/Assets/GUI/botonSeleccionar.png"));
		boton_seleccionar.setBorder(null);

		// panel lista de pokemones
		lista_n = new JList<>();
		lista_n.setBounds(20, 0, 320, 360);
		lista_n.setFont(fuente);
		lista_n.setFont(lista_n.getFont().deriveFont(Font.BOLD,15));
		modelo = new DefaultListModel<>();
		lista_n.setModel(modelo);
		lista_n.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		barra_lista = new JScrollPane(lista_n);
		barra_lista.setBounds(15, 0, 314, 365);
		barra_lista.setBorder(null);
		
		panel_lista_bg = new JLabel(new ImageIcon("src/Assets/GUI/panelLista.png"));
		panel_lista_bg.setBounds(0,0, 328, 360);
		
		panel_lista = new JPanel();
		panel_lista.setBounds(371, 60, 328, 360);
		panel_lista.setBackground(Color.DARK_GRAY);
		panel_lista.setLayout(null);
		panel_lista.add(barra_lista, JLayeredPane.DRAG_LAYER);
		panel_lista.add(panel_lista_bg, JLayeredPane.DEFAULT_LAYER);
		
		//Imagen Pokemon
		img_pokemon = new ImagenPokemon();
		img_pokemon.setBounds(110,135,150,150);
		//Nombre Pokemon
		nombre_pokemon_panel = new JLabel(new ImageIcon("src/Assets/GUI/nombreMostrar.png"));
		nombre_pokemon_panel.setBounds(10,355,350,88);
		nombre_pokemon_panel.setBackground(Color.BLACK);
		nombre_pokemon_panel.setForeground(Color.WHITE);
		nombre_pokemon_panel.setFont(fuente);
		nombre_pokemon_panel.setFont(nombre_pokemon_panel.getFont().deriveFont(Font.BOLD, 15));
		
		nombre_pokemon = new JLabel();
		nombre_pokemon.setBounds(25,385,320,30);
		nombre_pokemon.setForeground(Color.BLACK);
		nombre_pokemon.setFont(fuente);
		nombre_pokemon.setFont(nombre_pokemon.getFont().deriveFont(Font.BOLD, 20));
		nombre_pokemon.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(nombre_pokemon);
		add(nombre_pokemon_panel);
		add(img_pokemon);
		add(panel_lista);
		add(indicador_busqueda);
		add(indicador_nombre);
		add(campo_filtro);
		add(boton_seleccionar, JLayeredPane.DEFAULT_LAYER);
		add(bg);
		setVisible(true);

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

	public JLabel getIndicador_busqueda() {
		return indicador_busqueda;
	}

	public void setIndicador_busqueda(JLabel indicador_busqueda) {
		this.indicador_busqueda = indicador_busqueda;
	}

	public JButton getBoton_seleccionar() {
		return boton_seleccionar;
	}

	public void setBoton_seleccionar(JButton boton_seleccionar) {
		this.boton_seleccionar = boton_seleccionar;
	}

	public JScrollPane getBarra_lista() {
		return barra_lista;
	}

	public void setBarra_lista(JScrollPane barra_lista) {
		this.barra_lista = barra_lista;
	}

	public JPanel getPanel_lista() {
		return panel_lista;
	}

	public void setPanel_lista(JPanel panel_lista) {
		this.panel_lista = panel_lista;
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

	public JList<String> getLista_n() {
		return lista_n;
	}

	public void setLista_n(JList<String> lista_n) {
		this.lista_n = lista_n;
	}

	public DefaultListModel<String> getModelo() {
		return modelo;
	}

	public void setModelo(DefaultListModel<String> modelo) {
		this.modelo = modelo;
	}

}
