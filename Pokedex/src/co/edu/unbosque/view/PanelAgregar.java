package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;

public class PanelAgregar extends JPanel{
	
	private Font fuente;
	
	public PanelAgregar() {
		
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
		
		setVisible(true);
	}
	
}
