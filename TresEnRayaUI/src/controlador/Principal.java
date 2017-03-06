package controlador;

import java.awt.EventQueue;
import vista.TresEnRayaUI;
import modelo.Modelo;
import vista.TresEnRayaUI;
import controlador.Control;

public class Principal {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresEnRayaUI frame = new TresEnRayaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
