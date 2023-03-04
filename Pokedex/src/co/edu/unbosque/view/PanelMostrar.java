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
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PanelMostrar extends JPanel {

	private JPanel panel_lista;
	private JLabel bg;
	private Font fuente;
	private JList<String> lista_n;
	private DefaultListModel<String> modelo;
	private JTextField campo_nombre, campo_id;
	private JLabel indicador_id, indicador_nombre, indicador_busqueda;
	private JScrollPane barra_lista;
	private JButton boton_nombre, boton_id, boton_seleccionar;

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
<<<<<<< Updated upstream
		bg.setBounds(0, 0, 360, 500);

		// filtros para buscar

		indicador_busqueda = new JLabel();
		indicador_busqueda.setBounds(420, 5, 260, 20);
		indicador_busqueda.setText("BUSCAR POKEMON POR:");
		indicador_busqueda.setForeground(Color.WHITE);
		indicador_busqueda.setFont(fuente);
		indicador_busqueda.setFont(indicador_busqueda.getFont().deriveFont(Font.BOLD, 12));

		indicador_nombre = new JLabel();
		indicador_nombre.setText("NOMBRE: ");
		indicador_nombre.setBounds(370, 30, 120, 20);
		indicador_nombre.setForeground(Color.WHITE);
		indicador_nombre.setFont(fuente);
		indicador_nombre.setFont(indicador_nombre.getFont().deriveFont(Font.BOLD, 10));

		campo_nombre = new JTextField();
		campo_nombre.setBounds(450, 35, 100, 14);
		campo_nombre.setFont(fuente);
		campo_nombre.setFont(campo_nombre.getFont().deriveFont(Font.BOLD, 12));
		campo_nombre.setEditable(true);

		boton_nombre = new JButton();
		boton_nombre.setBounds(555, 35, 14, 14);
		boton_nombre.setBackground(Color.RED);

		indicador_id = new JLabel();
		indicador_id.setText("ID: ");
		indicador_id.setBounds(585, 30, 120, 20);
		indicador_id.setForeground(Color.WHITE);
		indicador_id.setFont(fuente);
		indicador_id.setFont(indicador_id.getFont().deriveFont(Font.BOLD, 10));

		campo_id = new JTextField();
		campo_id.setBounds(615, 35, 70, 14);
		campo_id.setFont(fuente);
		campo_id.setFont(campo_id.getFont().deriveFont(Font.BOLD, 12));
		campo_id.setEditable(true);

		boton_id = new JButton();
		boton_id.setBounds(690, 35, 14, 14);
		boton_id.setBackground(Color.RED);
=======
		bg.setBounds(5,6,360,440);
>>>>>>> Stashed changes
		
		boton_seleccionar = new JButton();
		boton_seleccionar.setBounds(450,427,200,20);
		boton_seleccionar.setBackground(Color.RED);
		boton_seleccionar.setText("SELECCIONAR");
		boton_seleccionar.setForeground(Color.WHITE);
		boton_seleccionar.setFont(fuente);
		boton_seleccionar.setFont(boton_seleccionar.getFont().deriveFont(Font.BOLD,12));

		// panel lista de pokemones
		panel_lista = new JPanel();
<<<<<<< Updated upstream
		panel_lista.setBounds(371, 60, 340, 360);
=======
		panel_lista.setBounds(360, 6, 340, 440);
>>>>>>> Stashed changes
		panel_lista.setBackground(Color.RED);
		panel_lista.setLayout(null);

		lista_n = new JList<>();
		lista_n.setBounds(20, 0, 320, 360);
		lista_n.setFont(fuente);
		lista_n.setFont(lista_n.getFont().deriveFont(Font.BOLD,15));

		barra_lista = new JScrollPane(lista_n);
		barra_lista.setBounds(0, 0, 340, 365);
		
		modelo = new DefaultListModel<>();
		lista_n.setModel(modelo);

		add(panel_lista);
		add(indicador_busqueda);
		add(indicador_nombre);
		add(campo_nombre);
		add(boton_nombre);
		add(indicador_id);
		add(campo_id);
		add(boton_id);
		add(boton_seleccionar);
		panel_lista.add(barra_lista);
		add(bg);
		setVisible(true);

	}

	public JLabel getIndicador_busqueda() {
		return indicador_busqueda;
	}

	public void setIndicador_busqueda(JLabel indicador_busqueda) {
		this.indicador_busqueda = indicador_busqueda;
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

	public JTextField getCampo_nombre() {
		return campo_nombre;
	}

	public void setCampo_nombre(JTextField campo_nombre) {
		this.campo_nombre = campo_nombre;
	}

	public JTextField getCampo_id() {
		return campo_id;
	}

	public void setCampo_id(JTextField campo_id) {
		this.campo_id = campo_id;
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
