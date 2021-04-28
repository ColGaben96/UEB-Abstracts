package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Animalitos;
import co.edu.unbosque.view.Interfaz;

public class Controlador {
	
	private Animalitos mundo = new Animalitos();
	private Interfaz interfaz = new Interfaz();
	
	public Controlador() {
		Consola();
	}
	
	public void Consola() {
		boolean activo = true;
		while(activo == true) {
			try {
				int comando = Integer.parseInt(interfaz.input(System.in, "Insert name here", interfaz.ayuda(), JOptionPane.PLAIN_MESSAGE));
				switch(comando) {
				default:
					interfaz.output("Error", "Ha ocurrido un error inesperado", JOptionPane.ERROR_MESSAGE);
					break;
				case 0:
					activo = false;
					break;
				case 1:
					interfaz.output("Operacion Finalizada", mundo.getCanino().alimentar(), JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					interfaz.output("Operacion Finalizada", mundo.getFelino().alimentar(), JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			} catch (Exception e) {
				interfaz.output("Error", "Ha ocurrido un error inesperado\n"+e.fillInStackTrace(), JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
