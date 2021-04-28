package co.edu.unbosque.view;

import java.io.InputStream;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public String input(InputStream systemIn, String title, String message, int messageType) {
		return JOptionPane.showInputDialog(null, message, title, messageType);
	}
	public void output(String title, String message, int messageType) {
		 JOptionPane.showMessageDialog(null, message, title, messageType);
	}
	public String ayuda() {
		return "0. Salir\n"
				+ "1. Alimentar al canino\n"
				+ "2. Alimentar al felino";
	}

}
