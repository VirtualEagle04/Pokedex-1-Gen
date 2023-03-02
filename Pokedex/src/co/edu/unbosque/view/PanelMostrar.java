package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class PanelMostrar extends JPanel{
	
	private JPanel panel_lista;
	private JList<String> lista_pokemones;
	private ArrayList<String> id_nombre;
	private JLabel bg;
	private Font fuente;
	
	public PanelMostrar() {
		
		try {
			fuente = Font.createFont(Font.TRUETYPE_FONT, new File("src/Assets/Font/Pokemon Classic.ttf"));
		}catch (FontFormatException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		setBounds(0, 50, 720, 670);
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		bg = new JLabel(new ImageIcon("src/Assets/GUI/bg.gif"));
		bg.setBounds(0,0,360,500);
		
		panel_lista = new JPanel();
		panel_lista.setBounds(360, 6, 340, 380);
		panel_lista.setBackground(Color.RED);
		panel_lista.setLayout(null);
		
		
		add(panel_lista);
		add(bg);
		setVisible(true);
		
	}

	public ArrayList<String> getId_nombre() {
		return id_nombre;
	}

	public void setId_nombre(ArrayList<String> id_nombre) {
		this.id_nombre = id_nombre;
	}
	
	

}
