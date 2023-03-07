package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelCRUD panel_crud;
	private PanelAgregar panel_agregar;
	private PanelMostrar panel_mostrar;
	private PanelEliminar panel_eliminar;
	private PanelInfo panel_info;

	public VentanaPrincipal() {
		setTitle("POKEDEX");
		ImageIcon img = new ImageIcon("src/Assets/PokemonInfoSprites/006.png");
		setIconImage(img.getImage());
		setSize(720, 540);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setFocusable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel_crud = new PanelCRUD();
		panel_agregar = new PanelAgregar();
		panel_mostrar = new PanelMostrar();
		panel_eliminar = new PanelEliminar();
		panel_info = new PanelInfo();
		
		add(panel_crud);
		add(panel_agregar).setVisible(false);
		add(panel_mostrar).setVisible(true);
		add(panel_eliminar).setVisible(false);
		add(panel_info).setVisible(false);
		setVisible(true);
	}
	
	

	public PanelInfo getPanel_info() {
		return panel_info;
	}



	public void setPanel_info(PanelInfo panel_info) {
		this.panel_info = panel_info;
	}



	public PanelCRUD getPanel_crud() {
		return panel_crud;
	}

	public void setPanel_crud(PanelCRUD panel_crud) {
		this.panel_crud = panel_crud;
	}

	public PanelAgregar getPanel_agregar() {
		return panel_agregar;
	}

	public void setPanel_agregar(PanelAgregar panel_agregar) {
		this.panel_agregar = panel_agregar;
	}

	public PanelMostrar getPanel_mostrar() {
		return panel_mostrar;
	}

	public void setPanel_mostrar(PanelMostrar panel_mostrar) {
		this.panel_mostrar = panel_mostrar;
	}

	public PanelEliminar getPanel_eliminar() {
		return panel_eliminar;
	}

	public void setPanel_eliminar(PanelEliminar panel_eliminar) {
		this.panel_eliminar = panel_eliminar;
	}
	
	
	
	
	
	
	
}
