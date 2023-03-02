package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelCRUD panel_crud;
	private PanelAgregar panel_agregar;
	private PanelMostrar panel_mostrar;

	public VentanaPrincipal() {
		setTitle("Pokedex");
		ImageIcon img = new ImageIcon("src/Assets/PokemonSprites/Bulbasaur_icon.png");
		setIconImage(img.getImage());
		setSize(720, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setFocusable(true);
		
		panel_crud = new PanelCRUD();
		panel_agregar = new PanelAgregar();
		panel_mostrar = new PanelMostrar();
		
		add(panel_crud);
		add(panel_agregar).setVisible(false);
		add(panel_mostrar);
		setVisible(true);
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
	
	
	
	
	
}
