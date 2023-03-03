package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelAgregar extends JPanel{
	
	private JPanel panel_agregar, panel_creacion;
	private JLabel ind_id, ind_nombre, ind_hp, ind_atk, ind_def, ind_satk, ind_sdef, ind_vel, ind_tipo, ind_tipo_sec, ind_descripcion; //Indicadores
	private JTextField campo_id, campo_nombre, campo_hp, campo_atk, campo_def, campo_satk, campo_sdef, campo_vel; //Campos
	private JTextArea campo_descripcion;
	private JComboBox<String> campo_tipo, campo_tipo_sec; 
	private JButton confirmar;
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
		
		ind_hp = new JLabel("HP");
		ind_hp.setBounds(30, 50, 100, 15);
		ind_hp.setFont(fuente);
		ind_hp.setFont(ind_hp.getFont().deriveFont(Font.BOLD, 15));
		
		campo_hp = new JTextField();
		campo_hp.setEditable(true);
		campo_hp.setBounds(135, 50, 60, 20);
		campo_hp.setFont(fuente);
		campo_hp.setFont(campo_hp.getFont().deriveFont(Font.BOLD, 15));
		
		ind_atk = new JLabel("ATK");
		ind_atk.setBounds(30, 70, 100, 15);
		ind_atk.setFont(fuente);
		ind_atk.setFont(ind_atk.getFont().deriveFont(Font.BOLD, 15));
		
		campo_atk = new JTextField();
		campo_atk.setEditable(true);
		campo_atk.setBounds(135, 70, 60, 20);
		campo_atk.setFont(fuente);
		campo_atk.setFont(campo_atk.getFont().deriveFont(Font.BOLD, 15));
		
		ind_def = new JLabel("DEF");
		ind_def.setBounds(30, 90, 100, 15);
		ind_def.setFont(fuente);
		ind_def.setFont(ind_def.getFont().deriveFont(Font.BOLD, 15));
		
		campo_def = new JTextField();
		campo_def.setEditable(true);
		campo_def.setBounds(135, 90, 60, 20);
		campo_def.setFont(fuente);
		campo_def.setFont(campo_def.getFont().deriveFont(Font.BOLD, 15));
		
		ind_satk = new JLabel("SP.ATK");
		ind_satk.setBounds(30, 110, 100, 15);
		ind_satk.setFont(fuente);
		ind_satk.setFont(ind_satk.getFont().deriveFont(Font.BOLD, 15));
		
		campo_satk = new JTextField();
		campo_satk.setEditable(true);
		campo_satk.setBounds(135, 110, 60, 20);
		campo_satk.setFont(fuente);
		campo_satk.setFont(campo_satk.getFont().deriveFont(Font.BOLD, 15));
		
		ind_sdef = new JLabel("SP.DEF");
		ind_sdef.setBounds(30, 130, 100, 15);
		ind_sdef.setFont(fuente);
		ind_sdef.setFont(ind_sdef.getFont().deriveFont(Font.BOLD, 15));
		
		campo_sdef = new JTextField();
		campo_sdef.setEditable(true);
		campo_sdef.setBounds(135, 130, 60, 20);
		campo_sdef.setFont(fuente);
		campo_sdef.setFont(campo_sdef.getFont().deriveFont(Font.BOLD, 15));
		
		ind_vel = new JLabel("VEL");
		ind_vel.setBounds(30, 150, 60, 15);
		ind_vel.setFont(fuente);
		ind_vel.setFont(ind_vel.getFont().deriveFont(Font.BOLD, 15));
		
		campo_vel = new JTextField();
		campo_vel.setEditable(true);
		campo_vel.setBounds(135, 150, 60, 20);
		campo_vel.setFont(fuente);
		campo_vel.setFont(campo_vel.getFont().deriveFont(Font.BOLD, 15));
		
		ind_tipo = new JLabel("TIPO");
		ind_tipo.setBounds(30, 170, 70, 15);
		ind_tipo.setFont(fuente);
		ind_tipo.setFont(ind_tipo.getFont().deriveFont(Font.BOLD, 15));
		
		String[] tipos = {"Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma",
				"Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psiquico", "Roca",
				"Siniestro", "Tierra", "Veneno", "Volador"};
		
		campo_tipo = new JComboBox(tipos);
		campo_tipo.setBounds(135, 170, 150, 20);
		campo_tipo.setFont(fuente);
		campo_tipo.setFont(campo_tipo.getFont().deriveFont(Font.BOLD, 12));
		
		ind_tipo_sec = new JLabel("2' TIPO");
		ind_tipo_sec.setBounds(30, 192, 195, 15);
		ind_tipo_sec.setFont(fuente);
		ind_tipo_sec.setFont(ind_tipo_sec.getFont().deriveFont(Font.BOLD, 15));
		
		String[] tipos_sec = {"Sin 2' Tipo", "Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma",
				"Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psiquico", "Roca",
				"Siniestro", "Tierra", "Veneno", "Volador"};
		
		campo_tipo_sec = new JComboBox<String>(tipos_sec);
		campo_tipo_sec.setBounds(135, 192, 150, 20);
		campo_tipo_sec.setFont(fuente);
		campo_tipo_sec.setFont(campo_tipo_sec.getFont().deriveFont(Font.BOLD, 12));
		
		ind_descripcion = new JLabel("DESCRIPCION");
		ind_descripcion.setBounds(30, 213, 195, 15);
		ind_descripcion.setFont(fuente);
		ind_descripcion.setFont(ind_descripcion.getFont().deriveFont(Font.BOLD, 15));
		
		campo_descripcion = new JTextArea();
		campo_descripcion.setEditable(true);
		campo_descripcion.setBounds(30, 233, 270, 120);
		campo_descripcion.setBackground(Color.LIGHT_GRAY);
		campo_descripcion.setLineWrap(true);
		campo_descripcion.setWrapStyleWord(true);
		campo_descripcion.setFont(fuente);
		campo_descripcion.setFont(campo_descripcion.getFont().deriveFont(Font.BOLD, 12));
		
		confirmar = new JButton("CREAR");
		confirmar.setBounds(95, 360, 150, 20);
		confirmar.setBackground(Color.RED);
		confirmar.setForeground(Color.WHITE);
		confirmar.setFont(fuente);
		confirmar.setFont(confirmar.getFont().deriveFont(Font.BOLD, 15));
		
		panel_creacion = new JPanel();
		panel_creacion.setBounds(0,0, 330, 380);
		panel_creacion.setBackground(Color.WHITE);
		panel_creacion.setLayout(null);
		add(ind_id);
		add(campo_id);
		add(ind_nombre);
		add(campo_nombre);
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
		add(campo_descripcion);
		add(confirmar);
		
		panel_agregar = new JPanel();
		panel_agregar.setBounds(5, 6, 360, 380);
		panel_agregar.setBackground(Color.RED);
		panel_agregar.setLayout(null);
		panel_agregar.add(panel_creacion);
		
		add(panel_agregar);
		setVisible(true);
	}
	
}
