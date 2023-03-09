package co.edu.unbosque.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Clase que cuya unica funcion es tener la función cargarImagen()
 * @author Juan Esteban Quintero, Javier Felipe Meza, Joann Zamudio, Federico Vargas Rozo
 *
 */

public class ImagenTipo extends JLabel{

	private BufferedImage img;
	private Image dimg;
	private ImageIcon imageIcon;
	
	public ImagenTipo() {	
	}
	
	/**
	 * Dado un String directorio de una imagen .png, utiliza las clases BufferedImage e Image, para  
	 * transformar una imagen de cierto tamaño predeterminado, y ampliarla a las dimensiones deseadas.
	 * Esta funcion unicamente es para mostrar las imagenes de cada tipo dependiendo del Tipo o Tipos del Pokemon seleccionado.
	 * @param directorio String de la forma <code>"src/Assets/Bulbasaur.png"<code>.
	 */
	
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
