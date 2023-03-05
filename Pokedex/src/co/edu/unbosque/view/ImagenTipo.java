package co.edu.unbosque.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImagenTipo extends JLabel{

	private BufferedImage img;
	private Image dimg;
	private ImageIcon imageIcon;
	
	public ImagenTipo() {	
	}
	
	public void cargarImagen(String directorio) {
		try {
			img = ImageIO.read(new File(directorio));
		}catch (IOException e) {
		}
		dimg = img.getScaledInstance(95, 36, Image.SCALE_FAST);
		imageIcon = new ImageIcon(dimg);
		//Imagen ^
		
		setIcon(imageIcon);
	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}
	
}
