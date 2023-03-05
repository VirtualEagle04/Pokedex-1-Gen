package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import co.edu.unbosque.model.PokemonDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener, ListSelectionListener {

	private VentanaPrincipal vp;
	private PokemonDAO pdao;
	private ArrayList<String> valores;

	public Controller() {

	}

	public void run() {
		vp = new VentanaPrincipal();
		pdao = new PokemonDAO();
		agregarLectores();
		valores = new ArrayList<>();
	}
	

	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		for (int i = 0; i < pdao.getLista().size(); i++) {
			
			if(vp.getPanel_mostrar().getLista_n().getSelectedValue().substring(0, 3).equals(pdao.getLista().get(i).getId())) {
				
					String directorio = "src/Assets/PokemonSprites/"+pdao.getLista().get(i).getNombre()+"_icon.png";
					vp.getPanel_mostrar().getImg_pokemon().cargarImagen(directorio);
					vp.getPanel_mostrar().getNombre_pokemon().setText(pdao.getLista().get(i).getNombre());
				
				break;
			}else {
				vp.getPanel_mostrar().getImg_pokemon().cargarImagen("src/Assets/PokemonSprites/000.png");
				vp.getPanel_mostrar().getNombre_pokemon().setText(pdao.getLista().get(i).getNombre());
			}
		}
		
	}
	public void agregarLectores() {
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
		
		//Filtros Mostrar
		vp.getPanel_mostrar().getBoton_nombre().addActionListener(this);
		vp.getPanel_mostrar().getBoton_nombre().setActionCommand("FiltroNombre");
		
		vp.getPanel_mostrar().getBoton_id().addActionListener(this);
		vp.getPanel_mostrar().getBoton_id().setActionCommand("FiltroID");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "CrudAgregar": {
			vp.getPanel_agregar().setVisible(true);
			vp.getPanel_mostrar().setVisible(false);
			vp.getPanel_eliminar().setVisible(false);

			break;
		}
		case "CrudEliminar": {
			vp.getPanel_agregar().setVisible(false);
			vp.getPanel_mostrar().setVisible(false);
			vp.getPanel_eliminar().setVisible(true);

			break;
		}
		case "CrudMostrar": {
			vp.getPanel_agregar().setVisible(false);
			vp.getPanel_mostrar().setVisible(true);
			vp.getPanel_eliminar().setVisible(false);
			
			for (int i = 0; i < pdao.getLista().size(); i++) {
				vp.getPanel_mostrar().getModelo().addElement(pdao.getLista().get(i).getId()+" "+pdao.getLista().get(i).getNombre());
				valores.add(pdao.getLista().get(i).getId()+" "+pdao.getLista().get(i).getNombre());
			}
			
			break;
		}
		case "FiltroNombre": {
			
			
			break;
		}
		case "FiltroID": {
			
			
			
			break;
		}
		case "SeleccionInfo": {
			
			
			
			break;
		}
		case "AgregConfirmar": {

			System.out.println("Agregado correctamente");

			System.out.println(vp.getPanel_agregar().getCampo_tipo_sec().getSelectedItem());

			if (vp.getPanel_agregar().getCampo_tipo_sec().getSelectedItem().equals("Sin 2' Tipo")) {

				String id = vp.getPanel_agregar().getCampo_id().getText();

				String nombre = vp.getPanel_agregar().getCampo_nombre().getText();

				String lv_temp = vp.getPanel_agregar().getCampo_lv().getText();
				int lv = Integer.parseInt(lv_temp);

				String al_temp = vp.getPanel_agregar().getCampo_al().getText();
				float al = Float.parseFloat(al_temp);

				String pe_temp = vp.getPanel_agregar().getCampo_pe().getText();
				float pe = Float.parseFloat(pe_temp);

				String hp_temp = vp.getPanel_agregar().getCampo_hp().getText();
				int hp = Integer.parseInt(hp_temp);

				String atk_temp = vp.getPanel_agregar().getCampo_atk().getText();
				int atk = Integer.parseInt(atk_temp);

				String def_temp = vp.getPanel_agregar().getCampo_def().getText();
				int def = Integer.parseInt(def_temp);

				String satk_temp = vp.getPanel_agregar().getCampo_satk().getText();
				int satk = Integer.parseInt(satk_temp);

				String sdef_temp = vp.getPanel_agregar().getCampo_sdef().getText();
				int sdef = Integer.parseInt(sdef_temp);

				String vel_temp = vp.getPanel_agregar().getCampo_vel().getText();
				int vel = Integer.parseInt(vel_temp);

				String tipo1 = vp.getPanel_agregar().getCampo_tipo().getSelectedItem() + "";
				
				String desc = vp.getPanel_agregar().getCampo_descripcion().getText();

				pdao.crearTipoIndividual(id + "", nombre, lv, al, pe, tipo1, hp, atk, def, satk, sdef, vel, desc);

				break;

			} else {

				String id = vp.getPanel_agregar().getCampo_id().getText();

				String nombre = vp.getPanel_agregar().getCampo_nombre().getText();

				String lv_temp = vp.getPanel_agregar().getCampo_lv().getText();
				int lv = Integer.parseInt(lv_temp);

				String al_temp = vp.getPanel_agregar().getCampo_al().getText();
				float al = Float.parseFloat(al_temp);

				String pe_temp = vp.getPanel_agregar().getCampo_pe().getText();
				float pe = Float.parseFloat(pe_temp);

				String hp_temp = vp.getPanel_agregar().getCampo_hp().getText();
				int hp = Integer.parseInt(hp_temp);

				String atk_temp = vp.getPanel_agregar().getCampo_atk().getText();
				int atk = Integer.parseInt(atk_temp);

				String def_temp = vp.getPanel_agregar().getCampo_def().getText();
				int def = Integer.parseInt(def_temp);

				String satk_temp = vp.getPanel_agregar().getCampo_satk().getText();
				int satk = Integer.parseInt(satk_temp);

				String sdef_temp = vp.getPanel_agregar().getCampo_sdef().getText();
				int sdef = Integer.parseInt(sdef_temp);

				String vel_temp = vp.getPanel_agregar().getCampo_vel().getText();
				int vel = Integer.parseInt(vel_temp);

				String tipo1 = vp.getPanel_agregar().getCampo_tipo().getSelectedItem() + "";

				String tipo2 = vp.getPanel_agregar().getCampo_tipo_sec().getSelectedItem() + "";

				String desc = vp.getPanel_agregar().getCampo_descripcion().getText();

				pdao.crearTipoSecundario(id + "", nombre, lv, al, pe, tipo1, tipo2, hp, atk, def, satk, sdef, vel,
						desc);

			}

			break;
		}
		
		

		default:
		}

	}

}
