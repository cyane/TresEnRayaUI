package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import modelo.Modelo;
import vista.TresEnRayaUI;
import controlador.Control;

public class TresEnRayaUI extends JFrame {

	private JPanel contentPane;
	private JTextField textJugadorActual;
	private JTextField textTurno;
	protected JTextField textMensajes;

	public TresEnRayaUI() {
		Modelo modelo=new Modelo();
		//s
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setBounds(100, 100, 317, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 301, 216);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		JButton btn01 = new JButton("");
		JButton btn02 = new JButton("");
		JButton btn10 = new JButton("");
		JButton btn11 = new JButton("");
		JButton btn12 = new JButton("");
		JButton btn20 = new JButton("");
		JButton btn21 = new JButton("");
		JButton btn22 = new JButton("");
		
		
		JButton btn00 = new JButton("");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(0, 0)){ //si esta vacia
						modelo.ponerFicha(0, 0);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn00.setText("X");}else{btn00.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(0, 0);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn00.setText("X");}else{btn00.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(0, 0)){
							modelo.setPoner(true);
							btn00.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn00.setName("Boton1");
		panel.add(btn00);
		

		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(0, 1)){ //si esta vacia
						modelo.ponerFicha(0, 1);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn01.setText("X");}else{btn01.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(0, 1);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn01.setText("X");}else{btn01.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(0, 1)){
							modelo.setPoner(true);
							btn01.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn01.setName("Boton2");
		panel.add(btn01);
		
		
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(0, 2)){ //si esta vacia
						modelo.ponerFicha(0, 2);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn02.setText("X");}else{btn02.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(0, 2);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn02.setText("X");}else{btn02.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(0, 2)){
							modelo.setPoner(true);
							btn02.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn02.setName("Boton3");
		panel.add(btn02);
		
	
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(1, 0)){ //si esta vacia
						modelo.ponerFicha(1, 0);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn10.setText("X");}else{btn10.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(1, 0);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn10.setText("X");}else{btn10.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(1, 0)){
							modelo.setPoner(true);
							btn10.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn10.setName("Boton4");
		panel.add(btn10);
		
		
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(1, 1)){ //si esta vacia
						modelo.ponerFicha(1, 1);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn11.setText("X");}else{btn11.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(1, 1);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn11.setText("X");}else{btn11.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(1,1)){
							modelo.setPoner(true);
							btn11.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn11.setName("Boton5");
		panel.add(btn11);
		
	
		btn12.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(1, 2)){ //si esta vacia
						modelo.ponerFicha(1, 2);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn12.setText("X");}else{btn12.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(1, 2);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn12.setText("X");}else{btn12.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(1, 2)){
							modelo.setPoner(true);
							btn12.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn12.setName("Boton6");
		panel.add(btn12);
		
		
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(2, 0)){ //si esta vacia
						modelo.ponerFicha(2, 0);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn20.setText("X");}else{btn20.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(2, 0);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn20.setText("X");}else{btn20.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(2, 0)){
							modelo.setPoner(true);
							btn20.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn20.setName("Boton7");
		panel.add(btn20);
		
		
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(2, 1)){ //si esta vacia
						modelo.ponerFicha(2, 1);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn21.setText("X");}else{btn21.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(2, 1);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn21.setText("X");}else{btn21.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(2, 1)){
							modelo.setPoner(true);
							btn21.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn21.setName("Boton8");
		panel.add(btn21);
		
	
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.getCont()==2){btn11.setText("O"); modelo.ponerFichac(1, 1);};
				textMensajes.setText("");
				if(modelo.getCont()<7){
					if(modelo.comprobarCasillaVacia(2, 2)){ //si esta vacia
						modelo.ponerFicha(2, 2);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn22.setText("X");}else{btn22.setText("O");}
						if(modelo.getCont()==7){textMensajes.setText("Seleccione una ficha a mover");}
					}else{ //si no esta vacia
						textMensajes.setText("Casilla ocupada. Seleccione otra");
					}
				}else{ //despues del turno 6
					textMensajes.setText("Seleccione una ficha a mover");
					if(modelo.getPoner()){	
						modelo.ponerFicha(2, 2);
						modelo.setCont(modelo.getCont()+1);
						textJugadorActual.setText(String.valueOf(modelo.cambiarJugador()));
						textTurno.setText(String.valueOf((modelo.getCont())));
						if(modelo.getTurno()==1){btn22.setText("X");}else{btn22.setText("O");}
						modelo.setPoner(false);
					}else{
						if(modelo.fichaAMover(2, 2)){
							modelo.setPoner(true);
							btn22.setText("");
							textMensajes.setText("Seleccione donde ponerla");
						}
					}
				}
				if(modelo.TresEnLinea()&&modelo.getCont()>5){
					textMensajes.setText("Ha perdido, Jugador: "+modelo.getTurno());
					btn00.setEnabled(false);	btn01.setEnabled(false);	btn02.setEnabled(false);
					btn10.setEnabled(false);	btn11.setEnabled(false);	btn12.setEnabled(false);
					btn20.setEnabled(false);	btn21.setEnabled(false);	btn22.setEnabled(false);
				}
			}
		});
		btn22.setName("boton9");
		panel.add(btn22);
		
		JLabel lblJugadorActual = new JLabel("Jugador Actual");
		lblJugadorActual.setBounds(10, 227, 93, 20);
		contentPane.add(lblJugadorActual);
		
		textJugadorActual = new JTextField();
		textJugadorActual.setEditable(false);
		textJugadorActual.setBounds(102, 227, 52, 20);
		contentPane.add(textJugadorActual);
		textJugadorActual.setColumns(10);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setBounds(152, 227, 78, 20);
		contentPane.add(lblTurno);
		
		textTurno = new JTextField();
		textTurno.setEditable(false);
		textTurno.setBounds(217, 227, 52, 20);
		contentPane.add(textTurno);
		textTurno.setColumns(10);
		
		textMensajes = new JTextField();
		textMensajes.setName("Mensajes");
		textMensajes.setEditable(false);
		textMensajes.setBounds(2, 254, 299, 42);
		contentPane.add(textMensajes);
		textMensajes.setColumns(10);
	}

}
