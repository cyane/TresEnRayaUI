package other;

import java.awt.EventQueue;

public class Main extends TresEnRayaUI{
	Logica logica=new Logica();
	AccionBotones accion=new AccionBotones(this);

		public Main(){
			btn00.addActionListener(accion);
			btn01.addActionListener(accion);
			btn02.addActionListener(accion);
			btn10.addActionListener(accion);
			btn11.addActionListener(accion);
			btn12.addActionListener(accion);
			btn20.addActionListener(accion);
			btn21.addActionListener(accion);
			btn22.addActionListener(accion);
		}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
