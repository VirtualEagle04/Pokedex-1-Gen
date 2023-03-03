package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCRUD extends JPanel{

	private JButton agregar, eliminar, mostrar;
	private JLabel agregar_sh, eliminar_sh, mostrar_sh;
	private Font fuente;
	
	public PanelCRUD() {
		
		try {
			fuente = Font.createFont(Font.TRUETYPE_FONT, new File("src/Assets/Font/Pokemon Classic.ttf"));
		}catch (FontFormatException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		setSize(720, 50);
		setLocation(0,0);
		setBackground(Color.RED);
		setLayout(null);
		
		agregar = new JButton("Agregar");
		agregar.setBounds(65, 11, 145, 30);
		agregar.setContentAreaFilled(false);
		agregar.setBorderPainted(false);
		agregar.setFocusable(false);
		agregar.setForeground(Color.WHITE);
		agregar.setFont(fuente);
		agregar.setFont(agregar.getFont().deriveFont(Font.PLAIN, 15));
		
		agregar_sh = new JLabel("Agregar");
		agregar_sh.setBounds(86, 13, 145, 30);
		agregar_sh.setFont(fuente);
		agregar_sh.setForeground(Color.BLACK);
		agregar_sh.setFont(agregar.getFont().deriveFont(Font.PLAIN, 15));
		
		eliminar = new JButton("Eliminar");
		eliminar.setBounds(290, 11, 145, 30);
		eliminar.setContentAreaFilled(false);
		eliminar.setBorderPainted(false);
		eliminar.setFocusable(false);
		eliminar.setForeground(Color.WHITE);
		eliminar.setFont(fuente);
		eliminar.setFont(eliminar.getFont().deriveFont(Font.PLAIN, 15));
		
		eliminar_sh = new JLabel("Eliminar");
		eliminar_sh.setBounds(317, 13, 145, 30);
		eliminar_sh.setFont(fuente);
		eliminar_sh.setForeground(Color.BLACK);
		eliminar_sh.setFont(eliminar_sh.getFont().deriveFont(Font.PLAIN, 15));
		
		mostrar = new JButton("Mostrar");
		mostrar.setBounds(495, 11, 165, 30);
		mostrar.setContentAreaFilled(false);
		mostrar.setBorderPainted(false);
		mostrar.setFocusable(false);
		mostrar.setForeground(Color.WHITE);
		mostrar.setFont(fuente);
		mostrar.setFont(mostrar.getFont().deriveFont(Font.PLAIN, 15));
		
		mostrar_sh = new JLabel("Mostrar");
		mostrar_sh.setBounds(527, 13, 145, 30);
		mostrar_sh.setFont(fuente);
		mostrar_sh.setForeground(Color.BLACK);
		mostrar_sh.setFont(mostrar_sh.getFont().deriveFont(Font.PLAIN, 15));
		
		
		add(agregar);
		add(agregar_sh);
		add(eliminar);
		add(eliminar_sh);
		add(mostrar);
		add(mostrar_sh);
		setVisible(true);
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getMostrar() {
		return mostrar;
	}

	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}
	
	
	
	
	
}
