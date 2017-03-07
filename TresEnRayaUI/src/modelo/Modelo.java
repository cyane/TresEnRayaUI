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
	int[] posicionAntigua=new int[2];
	
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

	
	public int[] getPosicionAntigua() {
		return posicionAntigua;
	}
	public void setPosicionAntigua(int[] posicionAntigua) {
		this.posicionAntigua = posicionAntigua;
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
	
	public void ponerFichac(int coordenadaUno, int coordenadaDos) { //pone el primer circulo
		tablero[coordenadaUno][coordenadaDos] = 1;
	}
	
	public boolean comprobarCasillaVacia(int coordenadaUno,int coordenadaDos) {
		if (tablero[coordenadaUno][coordenadaDos] == 0) {
			return true;
		}
		return false;
	}
	public void vaciarFicha(int moverUno, int moverDos){
		tablero[moverUno][moverDos]=0;
	}
	
	public boolean estaEnElTablero(int i, int j) {
		return i>=0&&i<=2&&j>=0&&j<=2;
	}
	public boolean fichaVacía(int moverUno, int moverDos){
	    int[] fichaMovida={moverUno,moverDos};
	    if(tablero[fichaMovida[0]][fichaMovida[1]]==0)
	      return false;
	    return true;
	  }
	  public boolean fichaPropia(int moverUno, int moverDos){
	    int[] fichaMovida={moverUno,moverDos};
	    if(tablero[fichaMovida[0]][fichaMovida[1]]!=turno)
	      return false;
	    return true;  
	  }
	  public boolean fichaEncerrada(int moverUno, int moverDos) {
	    int[] fichaMovida={moverUno,moverDos};
	    for (int i = fichaMovida[0]-1; i < fichaMovida[0]+2; i++) {
	      for (int j = fichaMovida[1]-1; j < fichaMovida[1]+2; j++) {
	        if(estaEnElTablero(i,j)){
	          if(tablero[i][j]==0){
	            return false;
	          }
	        }
	      }  
	    }
	  return true;
	  }  
	public boolean comprobarCasillaLindante(int posicionFinalX, int posicionFinalY) {
		int[] posicionFinal={posicionFinalX,posicionFinalY};
			  if((posicionFinal[0]-posicionAntigua[0]<=1&&posicionFinal[0]-posicionAntigua[0]>=(-1))&&(posicionFinal[1]-posicionAntigua[1]<=1&&posicionFinal[1]-posicionAntigua[1]>=(-1))){
				   return true;  
			  }else{
				  return false;
			  }
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
