package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import co.edu.unbosque.model.PokemonDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener, ListSelectionListener {

	private VentanaPrincipal vp;
	private PokemonDAO pdao;
	private boolean check;
	private boolean id_check;
	private boolean nombre_check;
	private ArrayList<String> valores;
	
	//Valores Creacion
	private String id, nombre;
	private int lv, hp, atk, def, satk, sdef, vel;
	private float al, pe;

	public Controller() {

	}

	public void run() {
		vp = new VentanaPrincipal();
		pdao = new PokemonDAO();
		agregarLectores();
		valores = new ArrayList<>();
		check = false;

		// Inicializando Lista
		for (int i = 0; i < pdao.getLista().size(); i++) {
			vp.getPanel_mostrar().getModelo()
					.addElement(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
			valores.add(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
		}
		
	}

	public void agregarLectores() {
		
		//Filtros Agregar
		vp.getPanel_agregar().getCampo_id().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) { filtrarID(); }

			@Override
			public void removeUpdate(DocumentEvent e) { filtrarID(); }

			@Override
			public void changedUpdate(DocumentEvent e) {}

		});
		
		vp.getPanel_agregar().getCampo_nombre().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) { filtrarNombre(); }

			@Override
			public void removeUpdate(DocumentEvent e) { filtrarNombre(); }

			@Override
			public void changedUpdate(DocumentEvent e) {}
		});
		
		
		
		//Filtro Mostrar
		vp.getPanel_mostrar().getCampo_filtro().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) { filtrarMostrar(); }

			@Override
			public void removeUpdate(DocumentEvent e) { filtrarMostrar(); }

			@Override
			public void changedUpdate(DocumentEvent e) {}

		});

		vp.getPanel_mostrar().getLista_n().addListSelectionListener(this);

		vp.getPanel_crud().getAgregar().addActionListener(this);
		vp.getPanel_crud().getAgregar().setActionCommand("CrudAgregar");

		vp.getPanel_agregar().getConfirmar().addActionListener(this);
		vp.getPanel_agregar().getConfirmar().setActionCommand("AgregConfirmar");

		vp.getPanel_crud().getEliminar().addActionListener(this);
		vp.getPanel_crud().getEliminar().setActionCommand("CrudEliminar");

		vp.getPanel_crud().getMostrar().addActionListener(this);
		vp.getPanel_crud().getMostrar().setActionCommand("CrudMostrar");

		vp.getPanel_mostrar().getBoton_seleccionar().addActionListener(this);
		vp.getPanel_mostrar().getBoton_seleccionar().setActionCommand("SeleccionInfo");

	}
	
	//Filtros ID
	public void filtrarID() {
		String textfiltro = vp.getPanel_agregar().getCampo_id().getText();
		filtrarValoresID(textfiltro);
	}
	
	public void filtrarValoresID(String filtro) {
		for (int i = 0; i < pdao.getLista().size(); i++) {
			if(pdao.getLista().get(i).getId().equalsIgnoreCase(filtro)) {
				vp.getPanel_agregar().getCampo_id().setForeground(Color.RED);
				id_check = false;
				break;
			}else {
				vp.getPanel_agregar().getCampo_id().setForeground(Color.BLACK);
				id_check = true;
			}
		}
	}
	
	//Filtos Nombre
	public void filtrarNombre() {
		String textfiltro = vp.getPanel_agregar().getCampo_nombre().getText();
		filtrarValoresNombre(textfiltro);
	}
	
	public void filtrarValoresNombre(String filtro) {
		for (int i = 0; i < pdao.getLista().size(); i++) {
			if(pdao.getLista().get(i).getNombre().equalsIgnoreCase(filtro)) {
				vp.getPanel_agregar().getCampo_nombre().setForeground(Color.RED);
				nombre_check = false;
				break;
			}else {
				vp.getPanel_agregar().getCampo_nombre().setForeground(Color.BLACK);
				nombre_check = true;
			}
		}
	}
		
	//Filtros Lista
	public void filtrarMostrar() {
		String textfiltro = vp.getPanel_mostrar().getCampo_filtro().getText();
		filtrarModelo((DefaultListModel<String>) vp.getPanel_mostrar().getLista_n().getModel(), textfiltro);
	}

	public void filtrarModelo(DefaultListModel<String> modelo, String filtro) {
		modelo.clear();
		for (int i = 0; i < valores.size(); i++) {
			String s = valores.get(i);
			if (s.toLowerCase().contains(filtro.toLowerCase())) {
				modelo.addElement(s);
			}
		}
	}
	
	

	@Override
	public void valueChanged(ListSelectionEvent e) {
		for (int i = 0; i < pdao.getLista().size(); i++) {

			try {
				if (vp.getPanel_mostrar().getLista_n().getSelectedValue().substring(0, 3).equals(pdao.getLista().get(i).getId())) {

					String directorio = "src/Assets/PokemonSprites/" + pdao.getLista().get(i).getNombre() + "_icon.png";
					vp.getPanel_mostrar().getImg_pokemon().cargarImagen(directorio);
					vp.getPanel_mostrar().getNombre_pokemon().setText(pdao.getLista().get(i).getNombre());

					break;
				} else {
					vp.getPanel_mostrar().getImg_pokemon().cargarImagen("src/Assets/PokemonSprites/000.png");
					vp.getPanel_mostrar().getNombre_pokemon().setText(pdao.getLista().get(i).getNombre());
				}
			}catch (NullPointerException e1) {
				
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "CrudAgregar": {
			vp.getPanel_agregar().setVisible(true);
			vp.getPanel_mostrar().setVisible(false);
			vp.getPanel_eliminar().setVisible(false);
			vp.getPanel_info().getDesc().setVisible(false);

			check = false;

			break;
		}
		case "CrudEliminar": {
			vp.getPanel_agregar().setVisible(false);
			vp.getPanel_mostrar().setVisible(false);
			vp.getPanel_eliminar().setVisible(true);

			check = false;

			break;
		}
		case "CrudMostrar": {
			vp.getPanel_agregar().setVisible(false);
			vp.getPanel_mostrar().setVisible(true);
			vp.getPanel_eliminar().setVisible(false);

			if (check) {
				for (int i = 0; i < pdao.getLista().size(); i++) {
					vp.getPanel_mostrar().getModelo().addElement(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
					valores.add(pdao.getLista().get(i).getId() + " " + pdao.getLista().get(i).getNombre());
					check = false;
				}
			}
			break;
		}
		case "ElimConfirmar": {
			check = true;
			break;
		}
		case "FiltroNombre": {

			break;
		}
		case "FiltroID": {

			break;
		}
		case "SeleccionInfo": {
			String sel = "";
			
			vp.getPanel_info().setVisible(true);
			vp.getPanel_agregar().setVisible(false);
			vp.getPanel_eliminar().setVisible(false);
			vp.getPanel_mostrar().setVisible(false);
			
			vp.getPanel_info().getDesc().setVisible(true);

			try {
				sel = vp.getPanel_mostrar().getLista_n().getSelectedValue();
			}catch (NullPointerException e1) {}
			
			for (int i = 0; i < pdao.getLista().size(); i++) {
				if (pdao.getLista().get(i).getId().equals(sel.substring(0, 3))) {
					vp.getPanel_info().getImg_pokemon().cargarImagen("src/Assets/PokemonInfoSprites/" + sel.substring(0, 3) + ".png");
					vp.getPanel_info().getId().setText("No." + pdao.getLista().get(i).getId());
					vp.getPanel_info().getNombre().setText(pdao.getLista().get(i).getNombre().toUpperCase());
					vp.getPanel_info().getHp().setText(String.valueOf(pdao.getLista().get(i).getHp()) + "/"+ String.valueOf(pdao.getLista().get(i).getHp()));
					vp.getPanel_info().getAtk().setText(String.valueOf(pdao.getLista().get(i).getAtaque()));
					vp.getPanel_info().getDef().setText(String.valueOf(pdao.getLista().get(i).getDefensa()));
					vp.getPanel_info().getSatk().setText(String.valueOf(pdao.getLista().get(i).getAtk_especial()));
					vp.getPanel_info().getSdef().setText(String.valueOf(pdao.getLista().get(i).getDef_especial()));
					vp.getPanel_info().getVel().setText(String.valueOf(pdao.getLista().get(i).getVelocidad()));
					vp.getPanel_info().getLv().setText(String.valueOf(pdao.getLista().get(i).getLv()));
					vp.getPanel_info().getTipo1_img().cargarImagen("src/Assets/Tipos/tipo" + pdao.getLista().get(i).getTipo() + ".png");

					if (pdao.getLista().get(i).getTipo_sec() == null) {
						vp.getPanel_info().getTipo2_img().cargarImagen("src/Assets/Tipos/tipoNada.png");
					} else {
						vp.getPanel_info().getTipo2_img()
								.cargarImagen("src/Assets/Tipos/tipo" + pdao.getLista().get(i).getTipo_sec() + ".png");
					}
					vp.getPanel_info().getPeso().setText(String.valueOf(pdao.getLista().get(i).getPeso()));
					vp.getPanel_info().getAlt().setText(String.valueOf(pdao.getLista().get(i).getAltura()));
					vp.getPanel_info().getDesc().setText(pdao.getLista().get(i).getDescripcion());
					break;
				} else {
					vp.getPanel_info().getImg_pokemon().cargarImagen("src/Assets/PokemonSprites/000.png");
				}
			}
			
			vp.getPanel_mostrar().setModelo(vp.getPanel_mostrar().getModelo());
			vp.getPanel_mostrar().getLista_n().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			vp.getPanel_mostrar().getModelo().clear();
			for (int i = 0; i < valores.size(); i++) {
				vp.getPanel_mostrar().getModelo().addElement(valores.get(i));
			}
			vp.getPanel_mostrar().getCampo_filtro().setText("");

			break;
		}
		case "AgregConfirmar": {
			int validacion = 0;

			if (vp.getPanel_agregar().getCampo_tipo_sec().getSelectedItem().equals("Sin 2' Tipo")) {

				if(id_check) {
					id = vp.getPanel_agregar().getCampo_id().getText();
					validacion++;
				}
				
				if(nombre_check) {
					nombre = vp.getPanel_agregar().getCampo_nombre().getText();
					validacion++;
				}
				
				try {
					vp.getPanel_agregar().getCampo_lv().setForeground(Color.BLACK);
					String lv_temp = vp.getPanel_agregar().getCampo_lv().getText();
					lv = Integer.parseInt(lv_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_lv().setForeground(Color.RED);
					
				}

				try {
					vp.getPanel_agregar().getCampo_al().setForeground(Color.BLACK);
					String al_temp = vp.getPanel_agregar().getCampo_al().getText();
					al = Float.parseFloat(al_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_al().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_pe().setForeground(Color.BLACK);
					String pe_temp = vp.getPanel_agregar().getCampo_pe().getText();
					pe = Float.parseFloat(pe_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_pe().setForeground(Color.RED);

				}
				
				try {
					vp.getPanel_agregar().getCampo_hp().setForeground(Color.BLACK);
					String hp_temp = vp.getPanel_agregar().getCampo_hp().getText();
					hp = Integer.parseInt(hp_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_hp().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_atk().setForeground(Color.BLACK);
					String atk_temp = vp.getPanel_agregar().getCampo_atk().getText();
					atk = Integer.parseInt(atk_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_atk().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_def().setForeground(Color.BLACK);
					String def_temp = vp.getPanel_agregar().getCampo_def().getText();
					def = Integer.parseInt(def_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_def().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_satk().setForeground(Color.BLACK);
					String satk_temp = vp.getPanel_agregar().getCampo_satk().getText();
					satk = Integer.parseInt(satk_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_satk().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_sdef().setForeground(Color.BLACK);
					String sdef_temp = vp.getPanel_agregar().getCampo_sdef().getText();
					sdef = Integer.parseInt(sdef_temp);
					validacion++;
				}catch (NumberFormatException e2){
					vp.getPanel_agregar().getCampo_sdef().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_vel().setForeground(Color.BLACK);
					String vel_temp = vp.getPanel_agregar().getCampo_vel().getText();
					vel = Integer.parseInt(vel_temp);
					validacion++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_vel().setForeground(Color.RED);
					
				}
				

				String tipo1 = vp.getPanel_agregar().getCampo_tipo().getSelectedItem() + "";

				String desc = vp.getPanel_agregar().getCampo_descripcion().getText();
				
				if(validacion == 11) {
					pdao.crearTipoIndividual(id + "", nombre, lv, al, pe, tipo1, hp, atk, def, satk, sdef, vel, desc);
					vp.getPanel_mostrar().getModelo().addElement(id+" "+nombre);
					valores.add(id+" "+nombre);
					check = false;
					vp.getPanel_mostrar().setVisible(true);
					vp.getPanel_agregar().setVisible(false);
					vp.getPanel_agregar().getCampo_id().setText("");
					vp.getPanel_agregar().getCampo_nombre().setText("");
					vp.getPanel_agregar().getCampo_lv().setText("");
					vp.getPanel_agregar().getCampo_hp().setText("");
					vp.getPanel_agregar().getCampo_atk().setText("");
					vp.getPanel_agregar().getCampo_def().setText("");
					vp.getPanel_agregar().getCampo_satk().setText("");
					vp.getPanel_agregar().getCampo_sdef().setText("");
					vp.getPanel_agregar().getCampo_vel().setText("");
					vp.getPanel_agregar().getCampo_al().setText("");
					vp.getPanel_agregar().getCampo_pe().setText("");
					vp.getPanel_agregar().getCampo_descripcion().setText("");
					vp.getPanel_agregar().getCampo_tipo().setSelectedIndex(0);
					vp.getPanel_agregar().getCampo_tipo_sec().setSelectedIndex(0);
					
				}
				break;

			} else {
				int validacion2 = 0;
				
				if(id_check) {
					id = vp.getPanel_agregar().getCampo_id().getText();
					validacion2++;
				}
				
				if(nombre_check) {
					nombre = vp.getPanel_agregar().getCampo_nombre().getText();
					validacion2++;
				}

				try {
					vp.getPanel_agregar().getCampo_lv().setForeground(Color.BLACK);
					String lv_temp = vp.getPanel_agregar().getCampo_lv().getText();
					lv = Integer.parseInt(lv_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_lv().setForeground(Color.RED);
					
				}

				try {
					vp.getPanel_agregar().getCampo_al().setForeground(Color.BLACK);
					String al_temp = vp.getPanel_agregar().getCampo_al().getText();
					al = Float.parseFloat(al_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_al().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_pe().setForeground(Color.BLACK);
					String pe_temp = vp.getPanel_agregar().getCampo_pe().getText();
					pe = Float.parseFloat(pe_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_pe().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_hp().setForeground(Color.BLACK);
					String hp_temp = vp.getPanel_agregar().getCampo_hp().getText();
					hp = Integer.parseInt(hp_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_hp().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_atk().setForeground(Color.BLACK);
					String atk_temp = vp.getPanel_agregar().getCampo_atk().getText();
					atk = Integer.parseInt(atk_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_atk().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_def().setForeground(Color.BLACK);
					String def_temp = vp.getPanel_agregar().getCampo_def().getText();
					def = Integer.parseInt(def_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_def().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_satk().setForeground(Color.BLACK);
					String satk_temp = vp.getPanel_agregar().getCampo_satk().getText();
					satk = Integer.parseInt(satk_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_satk().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_sdef().setForeground(Color.BLACK);
					String sdef_temp = vp.getPanel_agregar().getCampo_sdef().getText();
					sdef = Integer.parseInt(sdef_temp);
					validacion2++;
				}catch (NumberFormatException e2){
					vp.getPanel_agregar().getCampo_sdef().setForeground(Color.RED);
					
				}
				
				try {
					vp.getPanel_agregar().getCampo_vel().setForeground(Color.BLACK);
					String vel_temp = vp.getPanel_agregar().getCampo_vel().getText();
					vel = Integer.parseInt(vel_temp);
					validacion2++;
				}catch (NumberFormatException e2) {
					vp.getPanel_agregar().getCampo_vel().setForeground(Color.RED);
					
				}

				String tipo1 = vp.getPanel_agregar().getCampo_tipo().getSelectedItem() + "";

				String tipo2 = vp.getPanel_agregar().getCampo_tipo_sec().getSelectedItem() + "";

				String desc = vp.getPanel_agregar().getCampo_descripcion().getText();
				
				if(validacion2 == 11) {
					pdao.crearTipoSecundario(id + "", nombre, lv, al, pe, tipo1, tipo2, hp, atk, def, satk, sdef, vel, desc);
					vp.getPanel_mostrar().getModelo().addElement(id+" "+nombre);
					valores.add(id+" "+nombre);
					check = false;
					vp.getPanel_mostrar().setVisible(true);
					vp.getPanel_agregar().setVisible(false);
					vp.getPanel_agregar().getCampo_id().setText("");
					vp.getPanel_agregar().getCampo_nombre().setText("");
					vp.getPanel_agregar().getCampo_lv().setText("");
					vp.getPanel_agregar().getCampo_hp().setText("");
					vp.getPanel_agregar().getCampo_atk().setText("");
					vp.getPanel_agregar().getCampo_def().setText("");
					vp.getPanel_agregar().getCampo_satk().setText("");
					vp.getPanel_agregar().getCampo_sdef().setText("");
					vp.getPanel_agregar().getCampo_vel().setText("");
					vp.getPanel_agregar().getCampo_al().setText("");
					vp.getPanel_agregar().getCampo_pe().setText("");
					vp.getPanel_agregar().getCampo_descripcion().setText("");
					vp.getPanel_agregar().getCampo_tipo().setSelectedIndex(0);
					vp.getPanel_agregar().getCampo_tipo_sec().setSelectedIndex(0);
				}

				
				
			}

			break;
		}

		default:
		}

	}

}
