package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	
	private VentanaPrincipal vp;
	private Scanner sc;
	
	public Controller() {
		
	}
	public void run() {
		vp = new VentanaPrincipal();
		agregarLectores();
		sc = new Scanner(System.in);
	}
	
	public void agregarLectores() {
		vp.getPanel_crud().getAgregar().addActionListener(this);
		vp.getPanel_crud().getAgregar().setActionCommand("CrudAgregar");
		
		vp.getPanel_crud().getEliminar().addActionListener(this);
		vp.getPanel_crud().getEliminar().setActionCommand("CrudEliminar");
		
		vp.getPanel_crud().getActualizar().addActionListener(this);
		vp.getPanel_crud().getActualizar().setActionCommand("CrudActualizar");
		
		vp.getPanel_crud().getMostrar().addActionListener(this);
		vp.getPanel_crud().getMostrar().setActionCommand("CrudMostrar");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "CrudAgregar": {
			System.out.println("Agregar");
			
			
			break;
		}
		case "CrudEliminar": {
			System.out.println("Eliminar");
			break;
		}
		case "CrudActualizar": {
			System.out.println("Actualizar");
			break;
		}
		case "CrudMostrar": {
			System.out.println("Mostrar");
			break;
		}
		
		default:
		}
		
	}
}
