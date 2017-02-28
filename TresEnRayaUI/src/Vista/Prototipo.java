package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Prototipo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int[][] tablero = {{0,0,0},{0,0,0},{0,0,0}};
	public int[] posicionAntigua=new int[2];
	public boolean movimiento=false;
	boolean traslacion=false;
	String icono;
	public int jugada=0;
	public int ficha;
	public int posicionX, posicionY;
	public JPanel contentPane;
	public JTextField textJugadorActual;
	public JTextField textTurno;
	public JTextField textMensajes;
	public static Scanner leer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prototipo frame = new Prototipo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Prototipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 301, 197);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btn00 = new JButton("");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={0,0};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[0][0]=ficha;
						btn00.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn00.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={0,0};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn00.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.setEnabled(false);
				}
					
				
			}
		});
		btn00.setName("Boton1");
		panel.add(btn00);
		
		JButton btn01 = new JButton("");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={0,1};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[0][1]=ficha;
						btn01.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn01.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={0,1};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn01.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.disable();
				}
					
				
			}
		});
		btn01.setName("Boton2");
		panel.add(btn01);
		
		JButton btn02 = new JButton("");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={0,2};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[0][2]=ficha;
						btn02.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn02.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={0,2};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn02.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.disable();
				}
					
				
			}
		});
		btn02.setName("Boton3");
		panel.add(btn02);
		
		JButton btn10 = new JButton("");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={1,0};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[1][0]=ficha;
						btn10.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn10.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={1,0};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn10.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.disable();
				}
					
				
			}
		});
		btn10.setName("Boton4");
		panel.add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={1,1};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[1][1]=ficha;
						btn11.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn11.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={1,1};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn11.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.disable();
				}
					
				
			}
		});
		btn11.setName("Boton5");
		panel.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={1,2};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[1][2]=ficha;
						btn12.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn12.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={1,2};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn12.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.disable();
				}
					
				
			}
		});
		btn12.setName("Boton6");
		panel.add(btn12);
		
		JButton btn20 = new JButton("");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={2,0};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[2][0]=ficha;
						btn20.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn20.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={2,0};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn20.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.disable();
				}
					
				
			}
		});
		btn20.setName("Boton7");
		panel.add(btn20); 
		
		JButton btn21 = new JButton("");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={2,1};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[2][1]=ficha;
						btn21.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn21.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={2,1};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn21.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.disable();
				}
					
				
			}
		});
		btn21.setName("Boton8");
		panel.add(btn21);
		
		JButton btn22 = new JButton("");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] coordenadasUno={2,2};
				if(jugada%2==0){
					icono = "o";
				}else{
					icono = "x";
				}
				if(movimiento==true){
					if(jugada<=6&&comprobarCasillaVacia(coordenadasUno)){
						tablero[2][2]=ficha;
						btn22.setText(icono);
						movimiento=false;

					}else{
						if(comprobarFichaPropia(coordenadasUno)&&comprobarEncerrada(coordenadasUno)){
							textMensajes.setText("Elija la posición donde quiere colocar la ficha");
							movimiento=false;
							traslacion=true;
							btn22.setText("");
							
						}else{
							textMensajes.setText("La ficha que ha elegido no puede moverse");
						}
							
					}
				}else if(traslacion==true){
					int[] coordenadasDos={2,2};
					if(comprobarContigua(coordenadasUno, coordenadasDos)){
						borrarFicha(coordenadasUno);
						moverFicha(coordenadasUno, coordenadasDos);
						btn22.setText(icono);
					}		
				}else{
					textMensajes.setText("Le recomiendo leerse las intrucciones de nuevo");
				}
				
				if(comprobarLinea(tablero)){
					felicitarJugador();
					contentPane.disable();
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
		textMensajes.setBounds(0, 253, 299, 42);
		contentPane.add(textMensajes);
		textMensajes.setColumns(10);
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnComenzar.setText("Siguiente Turno");
				pasarTurno();
			}
		});
		btnComenzar.setBounds(0, 198, 301, 23);
		contentPane.add(btnComenzar);
	}
public void pasarTurno(){
	jugada++;
	textTurno.setText(String.valueOf(jugada));
	if(jugada%2==0){
		textMensajes.setText("Es el turno del jugador 2");
		textJugadorActual.setText("2");
		ficha=2;
	}else{
		textMensajes.setText("Es el turno del jugador 1");
		textJugadorActual.setText("1");
		ficha=1;
	}
	movimiento=true;
}
public boolean comprobarCasillaVacia(int[] coordenadasUno){
	if(tablero[coordenadasUno[0]][coordenadasUno[1]]==0)
		return true;
	return false;
}
public void colocarPosicion(int[] coordenadasUno) {
	tablero[coordenadasUno[0]][coordenadasUno[1]]=ficha;
}
public boolean comprobarContigua(int[] coordenadasUno, int[] coordenadasDos) {
	if((coordenadasDos[0]-coordenadasUno[0]<=1&&coordenadasDos[0]-coordenadasUno[0]>=(-1))&&(coordenadasDos[1]-coordenadasUno[1]<=1&&coordenadasDos[1]-coordenadasUno[1]>=(-1)))
		return true;
	return false;
}
public boolean comprobarFichaPropia(int[] coordenadasUno) {
	if(tablero[coordenadasUno[0]][coordenadasUno[1]]==ficha)
		return true;
	return false;
}
public boolean comprobarEncerrada(int[] coordenadasUno) {
	int acumulador=0;
	do{
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero[i].length; j++) {
			acumulador++;
			if(tablero[i][j]==0){
				int casillaLibre[]={i,j};
				if((coordenadasUno[0]-casillaLibre[0]<=1&&coordenadasUno[0]-casillaLibre[0]>=(-1))&&(coordenadasUno[1]-casillaLibre[1]<=1&&coordenadasUno[1]-casillaLibre[1]>=(-1)))
					return true;
			}
		}
	}
	}while(acumulador<=9);
	return false;
}
public void moverFicha(int[] coordenadasUno, int[] coordenadasDos){
		tablero[coordenadasDos[0]][coordenadasDos[1]]=ficha;
		borrarFicha(coordenadasUno);
		textMensajes.setText("Presiona el botón de Siguiente Turno");
		traslacion=false;
}
public void borrarFicha(int[] coordenadasUno) {
	tablero[coordenadasUno[0]][coordenadasUno[1]]=0;
}
public boolean comprobarLinea(int[][] tablero){
	return comprobarHorizontal(tablero)||comprobarVertical(tablero)||comprobarDiagonal(tablero);
}

public boolean comprobarHorizontal(int[][] tablero) {
	for (int i = 0; i < tablero.length; i++) {
		if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != 0)
			return true;
	}
	return false;
}

public boolean comprobarVertical(int[][] tablero){
	for (int j = 0; j < tablero.length; j++) {
		if (tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j] && tablero[0][j] != 0)
			return true;
	}
	return false;
}

public boolean comprobarDiagonal(int[][] tablero){
	if ((tablero[0][0]==tablero[1][1]&&tablero[1][1]==tablero[2][2]&&tablero[0][0]!=0)||
			(tablero[2][0]==tablero[1][1]&&tablero[1][1]==tablero[0][2]&&tablero[2][0]!=0)){
		return true; }
	return false;
}
public void felicitarJugador(){
	textMensajes.setText("Felicidades Jugador "+textJugadorActual.getText()+", has ganado el juego.");
}
}