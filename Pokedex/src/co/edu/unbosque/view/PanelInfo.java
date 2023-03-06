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
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelInfo extends JPanel {

	private ImagenTipo tipo1_img, tipo2_img;
	private ImagenPokemon img_pokemon;
	private JLabel id, nombre, hp, atk, def, satk, sdef, vel, lv, peso, alt;
	private JTextArea desc;
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

			// Imagen v
			BufferedImage img = null;
			try {
				img = ImageIO.read(new File("src/Assets/GUI/panelInfo.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			Image dimg = img.getScaledInstance(707, 452, Image.SCALE_FAST);
			ImageIcon imageIcon = new ImageIcon(dimg);
			// Imagen ^

		bg = new JLabel(imageIcon);
		bg.setBounds(-10, -20, 720, 490);

		img_pokemon = new ImagenPokemon();
		img_pokemon.setBounds(102, 70, 150, 150);

		id = new JLabel();
		id.setBounds(10, 15, 120, 23);
		id.setFont(fuente);
		id.setFont(id.getFont().deriveFont(Font.BOLD, 18));

		nombre = new JLabel();
		nombre.setBounds(140, 18, 200, 20);
		nombre.setFont(fuente);
		nombre.setFont(nombre.getFont().deriveFont(Font.BOLD, 15));

		hp = new JLabel();
		hp.setBounds(490, 18, 200, 23);
		hp.setFont(fuente);
		hp.setFont(hp.getFont().deriveFont(Font.BOLD + Font.ITALIC, 20));
		hp.setHorizontalAlignment(SwingConstants.CENTER);

		atk = new JLabel();
		atk.setBounds(545, 75, 200, 23);
		atk.setFont(fuente);
		atk.setFont(atk.getFont().deriveFont(Font.BOLD, 15));
		atk.setHorizontalAlignment(SwingConstants.CENTER);

		def = new JLabel();
		def.setBounds(545, 115, 200, 23);
		def.setFont(fuente);
		def.setFont(def.getFont().deriveFont(Font.BOLD, 15));
		def.setHorizontalAlignment(SwingConstants.CENTER);

		satk = new JLabel();
		satk.setBounds(545, 156, 200, 23);
		satk.setFont(fuente);
		satk.setFont(satk.getFont().deriveFont(Font.BOLD, 15));
		satk.setHorizontalAlignment(SwingConstants.CENTER);

		sdef = new JLabel();
		sdef.setBounds(545, 197, 200, 23);
		sdef.setFont(fuente);
		sdef.setFont(sdef.getFont().deriveFont(Font.BOLD, 15));
		sdef.setHorizontalAlignment(SwingConstants.CENTER);

		vel = new JLabel();
		vel.setBounds(545, 237, 200, 23);
		vel.setFont(fuente);
		vel.setFont(vel.getFont().deriveFont(Font.BOLD, 15));
		vel.setHorizontalAlignment(SwingConstants.CENTER);

		lv = new JLabel();
		lv.setBounds(545, 282, 200, 23);
		lv.setFont(fuente);
		lv.setFont(lv.getFont().deriveFont(Font.BOLD, 15));
		lv.setHorizontalAlignment(SwingConstants.CENTER);
		
		tipo1_img = new ImagenTipo();
		tipo1_img.setBounds(490, 320, 95, 36);
		
		tipo2_img = new ImagenTipo();
		tipo2_img.setBounds(592, 320, 95, 36);

		peso = new JLabel();
		peso.setBounds(545, 365, 200, 23);
		peso.setFont(fuente);
		peso.setFont(peso.getFont().deriveFont(Font.BOLD, 15));
		peso.setHorizontalAlignment(SwingConstants.CENTER);

		alt = new JLabel();
		alt.setBounds(545, 405, 200, 23);
		alt.setFont(fuente);
		alt.setFont(alt.getFont().deriveFont(Font.BOLD, 15));
		alt.setHorizontalAlignment(SwingConstants.CENTER);

		desc = new JTextArea();
		desc.setBounds(20, 280, 334, 160);
		desc.setEditable(false);
		desc.setBorder(null);
		desc.setOpaque(false);
		desc.setForeground(Color.BLACK);
		desc.setLineWrap(true);
		desc.setWrapStyleWord(true);
		desc.setFont(fuente);
		desc.setFont(desc.getFont().deriveFont(Font.BOLD, 12));

		add(id);
		add(nombre);
		add(img_pokemon);
		add(hp);
		add(atk);
		add(def);
		add(satk);
		add(sdef);
		add(vel);
		add(lv);
		add(tipo1_img);
		add(tipo2_img);
		add(peso);
		add(alt);
		add(desc);
		add(bg, JLayeredPane.DEFAULT_LAYER);

	}

	public ImagenTipo getTipo1_img() {
		return tipo1_img;
	}

	public void setTipo1_img(ImagenTipo tipo1_img) {
		this.tipo1_img = tipo1_img;
	}

	public ImagenTipo getTipo2_img() {
		return tipo2_img;
	}

	public void setTipo2_img(ImagenTipo tipo2_img) {
		this.tipo2_img = tipo2_img;
	}

	public JLabel getId() {
		return id;
	}

	public void setId(JLabel id) {
		this.id = id;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getHp() {
		return hp;
	}

	public void setHp(JLabel hp) {
		this.hp = hp;
	}

	public JLabel getAtk() {
		return atk;
	}

	public void setAtk(JLabel atk) {
		this.atk = atk;
	}

	public JLabel getDef() {
		return def;
	}

	public void setDef(JLabel def) {
		this.def = def;
	}

	public JLabel getSatk() {
		return satk;
	}

	public void setSatk(JLabel satk) {
		this.satk = satk;
	}

	public JLabel getSdef() {
		return sdef;
	}

	public void setSdef(JLabel sdef) {
		this.sdef = sdef;
	}

	public JLabel getVel() {
		return vel;
	}

	public void setVel(JLabel vel) {
		this.vel = vel;
	}

	public JLabel getLv() {
		return lv;
	}

	public void setLv(JLabel lv) {
		this.lv = lv;
	}

	public JLabel getPeso() {
		return peso;
	}

	public void setPeso(JLabel peso) {
		this.peso = peso;
	}

	public JLabel getAlt() {
		return alt;
	}

	public void setAlt(JLabel alt) {
		this.alt = alt;
	}

	public JTextArea getDesc() {
		return desc;
	}

	public void setDesc(JTextArea desc) {
		this.desc = desc;
	}

	public ImagenPokemon getImg_pokemon() {
		return img_pokemon;
	}

	public void setImg_pokemon(ImagenPokemon img_pokemon) {
		this.img_pokemon = img_pokemon;
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

}
