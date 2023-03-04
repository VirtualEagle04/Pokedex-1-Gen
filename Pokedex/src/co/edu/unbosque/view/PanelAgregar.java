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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelAgregar extends JPanel {

	private JPanel panel_agregar, panel_creacion;
	private JLabel ind_id, ind_nombre, ind_lv, ind_al, ind_pe, ind_hp, ind_atk, ind_def, ind_satk, ind_sdef, ind_vel,
			ind_tipo, ind_tipo_sec, ind_descripcion, unidades_m, unidades_kg; // Indicadores
	private JTextField campo_id, campo_nombre, campo_lv, campo_al, campo_pe, campo_hp, campo_atk, campo_def, campo_satk,
			campo_sdef, campo_vel; // Campos
	private JLabel bg, pregunta;
	private JTextArea campo_descripcion;
	private JComboBox<String> campo_tipo, campo_tipo_sec;
	private JScrollPane scrollpane_descripcion;
	private JButton confirmar;
	private Font fuente;

	public PanelAgregar() {

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

		ind_id = new JLabel("ID");
		ind_id.setBounds(30, 10, 100, 15);
		ind_id.setFont(fuente);
		ind_id.setFont(ind_id.getFont().deriveFont(Font.BOLD, 15));

		campo_id = new JTextField();
		campo_id.setEditable(true);
		campo_id.setBounds(135, 10, 60, 20);
		campo_id.setFont(fuente);
		campo_id.setFont(campo_id.getFont().deriveFont(Font.BOLD, 15));

		ind_nombre = new JLabel("NOMBRE");
		ind_nombre.setBounds(30, 30, 105, 15);
		ind_nombre.setFont(fuente);
		ind_nombre.setFont(ind_nombre.getFont().deriveFont(Font.BOLD, 15));

		campo_nombre = new JTextField();
		campo_nombre.setEditable(true);
		campo_nombre.setBounds(135, 30, 150, 20);
		campo_nombre.setFont(fuente);
		campo_nombre.setFont(campo_nombre.getFont().deriveFont(Font.BOLD, 12));

		ind_lv = new JLabel("LV");
		ind_lv.setBounds(30, 50, 100, 15);
		ind_lv.setFont(fuente);
		ind_lv.setFont(ind_lv.getFont().deriveFont(Font.BOLD, 15));

		campo_lv = new JTextField();
		campo_lv.setEditable(true);
		campo_lv.setBounds(135, 50, 60, 20);
		campo_lv.setFont(fuente);
		campo_lv.setFont(campo_lv.getFont().deriveFont(Font.BOLD, 15));

		ind_al = new JLabel("ALT");
		ind_al.setBounds(30, 70, 100, 20);
		ind_al.setFont(fuente);
		ind_al.setFont(ind_al.getFont().deriveFont(Font.BOLD, 15));

		campo_al = new JTextField();
		campo_al.setEditable(true);
		campo_al.setBounds(135, 70, 60, 20);
		campo_al.setFont(fuente);
		campo_al.setFont(ind_al.getFont().deriveFont(Font.BOLD, 15));
		
		unidades_m = new JLabel("m.");
		unidades_m.setBounds(197, 70, 60, 20);
		unidades_m.setFont(fuente);
		unidades_m.setFont(unidades_m.getFont().deriveFont(Font.BOLD, 15));

		ind_pe = new JLabel("PESO");
		ind_pe.setBounds(30, 90, 110, 20);
		ind_pe.setFont(fuente);
		ind_pe.setFont(ind_al.getFont().deriveFont(Font.BOLD, 15));

		campo_pe = new JTextField();
		campo_pe.setEditable(true);
		campo_pe.setBounds(135, 90, 60, 20);
		campo_pe.setFont(fuente);
		campo_pe.setFont(ind_al.getFont().deriveFont(Font.BOLD, 15));
		
		unidades_kg = new JLabel("Kg.");
		unidades_kg.setBounds(197, 90, 60, 20);
		unidades_kg.setFont(fuente);
		unidades_kg.setFont(unidades_kg.getFont().deriveFont(Font.BOLD, 15));

		ind_hp = new JLabel("HP");
		ind_hp.setBounds(30, 110, 100, 15);// 70
		ind_hp.setFont(fuente);
		ind_hp.setFont(ind_hp.getFont().deriveFont(Font.BOLD, 15));

		campo_hp = new JTextField();
		campo_hp.setEditable(true);
		campo_hp.setBounds(135, 110, 60, 20);
		campo_hp.setFont(fuente);
		campo_hp.setFont(campo_hp.getFont().deriveFont(Font.BOLD, 15));

		ind_atk = new JLabel("ATK");
		ind_atk.setBounds(30, 130, 100, 15);
		ind_atk.setFont(fuente);
		ind_atk.setFont(ind_atk.getFont().deriveFont(Font.BOLD, 15));

		campo_atk = new JTextField();
		campo_atk.setEditable(true);
		campo_atk.setBounds(135, 130, 60, 20);
		campo_atk.setFont(fuente);
		campo_atk.setFont(campo_atk.getFont().deriveFont(Font.BOLD, 15));

		ind_def = new JLabel("DEF");
		ind_def.setBounds(30, 150, 100, 15);
		ind_def.setFont(fuente);
		ind_def.setFont(ind_def.getFont().deriveFont(Font.BOLD, 15));

		campo_def = new JTextField();
		campo_def.setEditable(true);
		campo_def.setBounds(135, 150, 60, 20);
		campo_def.setFont(fuente);
		campo_def.setFont(campo_def.getFont().deriveFont(Font.BOLD, 15));

		ind_satk = new JLabel("SP.ATK");
		ind_satk.setBounds(30, 170, 100, 15);
		ind_satk.setFont(fuente);
		ind_satk.setFont(ind_satk.getFont().deriveFont(Font.BOLD, 15));

		campo_satk = new JTextField();
		campo_satk.setEditable(true);
		campo_satk.setBounds(135, 170, 60, 20);
		campo_satk.setFont(fuente);
		campo_satk.setFont(campo_satk.getFont().deriveFont(Font.BOLD, 15));

		ind_sdef = new JLabel("SP.DEF");
		ind_sdef.setBounds(30, 190, 100, 15);
		ind_sdef.setFont(fuente);
		ind_sdef.setFont(ind_sdef.getFont().deriveFont(Font.BOLD, 15));

		campo_sdef = new JTextField();
		campo_sdef.setEditable(true);
		campo_sdef.setBounds(135, 190, 60, 20);
		campo_sdef.setFont(fuente);
		campo_sdef.setFont(campo_sdef.getFont().deriveFont(Font.BOLD, 15));

		ind_vel = new JLabel("VEL");
		ind_vel.setBounds(30, 210, 60, 15);
		ind_vel.setFont(fuente);
		ind_vel.setFont(ind_vel.getFont().deriveFont(Font.BOLD, 15));

		campo_vel = new JTextField();
		campo_vel.setEditable(true);
		campo_vel.setBounds(135, 210, 60, 20);
		campo_vel.setFont(fuente);
		campo_vel.setFont(campo_vel.getFont().deriveFont(Font.BOLD, 15));

		ind_tipo = new JLabel("TIPO");
		ind_tipo.setBounds(30, 230, 70, 15);
		ind_tipo.setFont(fuente);
		ind_tipo.setFont(ind_tipo.getFont().deriveFont(Font.BOLD, 15));

		String[] tipos = { "Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma", "Fuego", "Hada", "Hielo",
				"Lucha", "Normal", "Planta", "Psiquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador" };

		campo_tipo = new JComboBox(tipos);
		campo_tipo.setBounds(135, 230, 150, 20);
		campo_tipo.setFont(fuente);
		campo_tipo.setFont(campo_tipo.getFont().deriveFont(Font.BOLD, 12));

		ind_tipo_sec = new JLabel("2' TIPO");
		ind_tipo_sec.setBounds(30, 250, 195, 15);
		ind_tipo_sec.setFont(fuente);
		ind_tipo_sec.setFont(ind_tipo_sec.getFont().deriveFont(Font.BOLD, 15));

		String[] tipos_sec = { "Sin 2' Tipo", "Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma", "Fuego",
				"Hada", "Hielo", "Lucha", "Normal", "Planta", "Psiquico", "Roca", "Siniestro", "Tierra", "Veneno",
				"Volador" };

		campo_tipo_sec = new JComboBox<String>(tipos_sec);
		campo_tipo_sec.setBounds(135, 251, 150, 20);
		campo_tipo_sec.setFont(fuente);
		campo_tipo_sec.setFont(campo_tipo_sec.getFont().deriveFont(Font.BOLD, 12));
		
		scrollpane_descripcion = new JScrollPane();
		scrollpane_descripcion.setBounds(30, 320, 270, 85);

		ind_descripcion = new JLabel("DESCRIPCION");
		ind_descripcion.setBounds(30, 290, 195, 15);
		ind_descripcion.setFont(fuente);
		ind_descripcion.setFont(ind_descripcion.getFont().deriveFont(Font.BOLD, 15));

		campo_descripcion = new JTextArea();
		campo_descripcion.setEditable(true);
		campo_descripcion.setBounds(30, 320, 270, 85);
		campo_descripcion.setBackground(Color.LIGHT_GRAY);
		campo_descripcion.setLineWrap(true);
		campo_descripcion.setWrapStyleWord(true);
		campo_descripcion.setFont(fuente);
		campo_descripcion.setFont(campo_descripcion.getFont().deriveFont(Font.BOLD, 12));
		scrollpane_descripcion.setViewportView(campo_descripcion);

		confirmar = new JButton();
		confirmar.setLayout(null);
		confirmar.setBounds(95, 420, 150, 20);
		confirmar.setForeground(Color.BLACK);
		confirmar.setFont(fuente);
		confirmar.setFont(confirmar.getFont().deriveFont(Font.BOLD, 15));
		confirmar.setIcon(new ImageIcon("src/Assets/GUI/confirmarbg.png"));
		confirmar.setBorder(null);

		panel_creacion = new JPanel();
		panel_creacion.setBounds(0, 0, 330, 440);
		panel_creacion.setBackground(Color.WHITE);
		panel_creacion.setLayout(null);
		add(ind_id);
		add(campo_id);
		add(ind_nombre);
		add(campo_nombre);
		add(ind_lv);
		add(campo_lv);
		add(ind_al);
		add(campo_al);
		add(unidades_m);
		add(ind_pe);
		add(campo_pe);
		add(unidades_kg);
		add(ind_hp);
		add(campo_hp);
		add(ind_atk);
		add(campo_atk);
		add(ind_def);
		add(campo_def);
		add(ind_satk);
		add(campo_satk);
		add(ind_sdef);
		add(campo_sdef);
		add(ind_vel);
		add(campo_vel);
		add(ind_tipo);
		add(campo_tipo);
		add(ind_tipo_sec);
		add(campo_tipo_sec);
		add(ind_descripcion);
		add(scrollpane_descripcion);
		add(confirmar);
		
		bg = new JLabel(new ImageIcon("src/Assets/GUI/bg.gif"));
		bg.setBounds(365, 6, 334, 440);

		//Imagen v
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/Assets/GUI/question.png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(195, 200, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		//Imagen ^
		
		pregunta = new JLabel(imageIcon);
		pregunta.setBounds(335, 40, 390, 400);

		panel_agregar = new JPanel();
		panel_agregar.setBounds(5, 6, 360, 440);
		panel_agregar.setBackground(Color.RED);
		panel_agregar.setLayout(null);
		panel_agregar.add(panel_creacion);

		add(pregunta, JLayeredPane.DRAG_LAYER);
		add(bg, JLayeredPane.PALETTE_LAYER);
		add(panel_agregar);
		setVisible(true);
	}

	public JLabel getInd_al() {
		return ind_al;
	}

	public void setInd_al(JLabel ind_al) {
		this.ind_al = ind_al;
	}

	public JLabel getInd_pe() {
		return ind_pe;
	}

	public void setInd_pe(JLabel ind_pe) {
		this.ind_pe = ind_pe;
	}

	public JTextField getCampo_al() {
		return campo_al;
	}

	public void setCampo_al(JTextField campo_al) {
		this.campo_al = campo_al;
	}

	public JTextField getCampo_pe() {
		return campo_pe;
	}

	public void setCampo_pe(JTextField campo_pe) {
		this.campo_pe = campo_pe;
	}

	public JPanel getPanel_agregar() {
		return panel_agregar;
	}

	public void setPanel_agregar(JPanel panel_agregar) {
		this.panel_agregar = panel_agregar;
	}

	public JPanel getPanel_creacion() {
		return panel_creacion;
	}

	public void setPanel_creacion(JPanel panel_creacion) {
		this.panel_creacion = panel_creacion;
	}

	public JLabel getInd_id() {
		return ind_id;
	}

	public void setInd_id(JLabel ind_id) {
		this.ind_id = ind_id;
	}

	public JLabel getInd_nombre() {
		return ind_nombre;
	}

	public void setInd_nombre(JLabel ind_nombre) {
		this.ind_nombre = ind_nombre;
	}

	public JLabel getInd_lv() {
		return ind_lv;
	}

	public void setInd_lv(JLabel ind_lv) {
		this.ind_lv = ind_lv;
	}

	public JLabel getInd_hp() {
		return ind_hp;
	}

	public void setInd_hp(JLabel ind_hp) {
		this.ind_hp = ind_hp;
	}

	public JLabel getInd_atk() {
		return ind_atk;
	}

	public void setInd_atk(JLabel ind_atk) {
		this.ind_atk = ind_atk;
	}

	public JLabel getInd_def() {
		return ind_def;
	}

	public void setInd_def(JLabel ind_def) {
		this.ind_def = ind_def;
	}

	public JLabel getInd_satk() {
		return ind_satk;
	}

	public void setInd_satk(JLabel ind_satk) {
		this.ind_satk = ind_satk;
	}

	public JLabel getInd_sdef() {
		return ind_sdef;
	}

	public void setInd_sdef(JLabel ind_sdef) {
		this.ind_sdef = ind_sdef;
	}

	public JLabel getInd_vel() {
		return ind_vel;
	}

	public void setInd_vel(JLabel ind_vel) {
		this.ind_vel = ind_vel;
	}

	public JLabel getInd_tipo() {
		return ind_tipo;
	}

	public void setInd_tipo(JLabel ind_tipo) {
		this.ind_tipo = ind_tipo;
	}

	public JLabel getInd_tipo_sec() {
		return ind_tipo_sec;
	}

	public void setInd_tipo_sec(JLabel ind_tipo_sec) {
		this.ind_tipo_sec = ind_tipo_sec;
	}

	public JLabel getInd_descripcion() {
		return ind_descripcion;
	}

	public void setInd_descripcion(JLabel ind_descripcion) {
		this.ind_descripcion = ind_descripcion;
	}

	public JTextField getCampo_id() {
		return campo_id;
	}

	public void setCampo_id(JTextField campo_id) {
		this.campo_id = campo_id;
	}

	public JTextField getCampo_nombre() {
		return campo_nombre;
	}

	public void setCampo_nombre(JTextField campo_nombre) {
		this.campo_nombre = campo_nombre;
	}

	public JTextField getCampo_lv() {
		return campo_lv;
	}

	public void setCampo_lv(JTextField campo_lv) {
		this.campo_lv = campo_lv;
	}

	public JTextField getCampo_hp() {
		return campo_hp;
	}

	public void setCampo_hp(JTextField campo_hp) {
		this.campo_hp = campo_hp;
	}

	public JTextField getCampo_atk() {
		return campo_atk;
	}

	public void setCampo_atk(JTextField campo_atk) {
		this.campo_atk = campo_atk;
	}

	public JTextField getCampo_def() {
		return campo_def;
	}

	public void setCampo_def(JTextField campo_def) {
		this.campo_def = campo_def;
	}

	public JTextField getCampo_satk() {
		return campo_satk;
	}

	public void setCampo_satk(JTextField campo_satk) {
		this.campo_satk = campo_satk;
	}

	public JTextField getCampo_sdef() {
		return campo_sdef;
	}

	public void setCampo_sdef(JTextField campo_sdef) {
		this.campo_sdef = campo_sdef;
	}

	public JTextField getCampo_vel() {
		return campo_vel;
	}

	public void setCampo_vel(JTextField campo_vel) {
		this.campo_vel = campo_vel;
	}

	public JTextArea getCampo_descripcion() {
		return campo_descripcion;
	}

	public void setCampo_descripcion(JTextArea campo_descripcion) {
		this.campo_descripcion = campo_descripcion;
	}

	public JComboBox<String> getCampo_tipo() {
		return campo_tipo;
	}

	public void setCampo_tipo(JComboBox<String> campo_tipo) {
		this.campo_tipo = campo_tipo;
	}

	public JComboBox<String> getCampo_tipo_sec() {
		return campo_tipo_sec;
	}

	public void setCampo_tipo_sec(JComboBox<String> campo_tipo_sec) {
		this.campo_tipo_sec = campo_tipo_sec;
	}

	public JButton getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(JButton confirmar) {
		this.confirmar = confirmar;
	}

	public Font getFuente() {
		return fuente;
	}

	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}

}
