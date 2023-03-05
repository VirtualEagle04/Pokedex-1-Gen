package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PanelInfo extends JPanel{

	private JLabel tipo1_img, tipo2_img;
	private JLabel bg;
	private Font fuente;
	
	public PanelInfo() {
		
		try {
			fuente = Font.createFont(Font.TRUETYPE_FONT, new File("src/Assets/Font/Pokemon Classic.ttf"));
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		setBounds(0, 50, 720, 490);
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
				//Imagen v
				BufferedImage img = null;
				try {
					img = ImageIO.read(new File("src/Assets/GUI/panelInfoBg3.png"));
				}catch (IOException e) {
					e.printStackTrace();
				}
				Image dimg = img.getScaledInstance(707, 452, Image.SCALE_FAST);
				ImageIcon imageIcon = new ImageIcon(dimg);
				//Imagen ^
		
		bg = new JLabel(imageIcon);
		bg.setBounds(-10, -20, 720, 490);

		add(bg, JLayeredPane.DEFAULT_LAYER);
		
		
	}
	
}
