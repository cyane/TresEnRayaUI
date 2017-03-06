package modelo;
import modelo.Modelo;
import vista.TresEnRayaUI;
import controlador.Control;


public class Modelo {
	private int[][] tablero = new int[3][3] ;
	private int turno = 2;
	private int cont = 2;
	private int[] fichaMovida=new int[2];
	private int[] coordenadas = { 0, 0 };
	private boolean Poner;
	int coordenadaAntiguaX; 
	int coordenadaAntiguaY;
	int[] posicionAntigua={coordenadaAntiguaX,coordenadaAntiguaY};
	
	public boolean getPoner() {
		return Poner;
	}
	public void setPoner(boolean Poner) {
		this.Poner = Poner;
	}
	public int[][] getTablero() {
		return tablero;
	}
	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}
	public void setCoordenadaAntiguaX(int coordenadaAntiguaX) {
		this.coordenadaAntiguaX=coordenadaAntiguaX;
	}
	public void setCoordenadaAntiguaY(int coordenadaAntiguaY) {
		this.coordenadaAntiguaY=coordenadaAntiguaY;
	}
	
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public int[] getFichaMovida() {
		return fichaMovida;
	}
	public void setFichaMovida(int[] fichaMovida) {
		this.fichaMovida = fichaMovida;
	}
	
	public int[] getCoordenadas() {
		return coordenadas;
	}
	public void setCoordenadas(int[] coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	
	public int cambiarJugador() {
		if (getTurno() == 1) {
			setTurno(getTurno() + 1);
		} else {
			setTurno(getTurno() - 1);
		}
		return getTurno();
	}

	
	public void ponerFicha(int coordenadaUno, int coordenadaDos) {
		tablero[coordenadaUno][coordenadaDos] = turno;
	}
	
	public void ponerFichac(int coordenadaUno, int coordenadaDos) {
		tablero[coordenadaUno][coordenadaDos] = 1;
	}
	
	public boolean comprobarCasillaVacia(int coordenadaUno,int coordenadaDos) {
		if (tablero[coordenadaUno][coordenadaDos] == 0) {
			return true;
		}
		return false;
	}
	
	
	public boolean fichaAMover(int moverUno, int moverDos) {
		int[] fichaMovida={moverUno,moverDos};
		if (tablero[fichaMovida[0]][fichaMovida[1]]==0) {
			System.out.println("Esta casilla esta vacia");
			return false;
		}else if(tablero[fichaMovida[0]][fichaMovida[1]]!=turno){
			System.out.println("Esa ficha no le pertenece");
			return false;
		}else if(fichaEncerrada(fichaMovida)){
			return false;
		}
		tablero[moverUno][moverDos]=0;
		return true;
	}
	public boolean fichaEncerrada(int[] fichaMovida) {
		for (int i = fichaMovida[0]-1; i < fichaMovida[0]+2; i++) {
			for (int j = fichaMovida[1]-1; j < fichaMovida[1]+2; j++) {
				if(estaEnElTablero(i,j)){
					if(tablero[i][j]==0){
						return false;
					}
				}
			}	
		}
	System.out.println("ficha encerrada. Seleccione otra");
	return true;
	}

	public boolean estaEnElTablero(int i, int j) {
		return i>=0&&i<=2&&j>=0&&j<=2;
	}
	public boolean comprobarCasillaLindante(int posicionFinalX, int posicionFinalY) {
		int[] posicionFinal={posicionFinalX,posicionFinalY};
		// TODO rellenar
		return true;
	}


public  boolean TresEnLinea( ){
return TresEnFila()||TresEnColumna()||TresEnDiagonal();
}

public  boolean TresEnFila( ) {
	for (int i = 0; i < tablero.length; i++) {
		if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != 0)
			return true;
	}
	return false;
}

public  boolean TresEnColumna( ) {
	for (int i = 0; i < tablero.length; i++) {
		if(tablero[0][i]==tablero[1][i]&&tablero[1][i]==tablero[2][i]&&tablero[0][i]!=0){
			return true;
		}
	}
	return false;
}

public  boolean TresEnDiagonal( ) {
	return Diagonal()||DiagonalINV();
}


public  boolean Diagonal() {
	boolean bandera = true;
	for (int i = 0; i < tablero.length - 1 && bandera; i++) {
		int j = i;
		bandera = (tablero[i][j] == tablero[i + 1][j + 1]);
	}
	return bandera;
}
public  boolean DiagonalINV( ) {
	boolean bandera = true;
	for (int i = 0,j = tablero.length-1-i; i < tablero.length - 1 
			&& bandera; i++,j--) {
		bandera = (tablero[i][j] == tablero[i + 1][j - 1]);
	}
	return bandera;
}

	
}
