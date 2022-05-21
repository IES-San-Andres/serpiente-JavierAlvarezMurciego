package serpiente.movimiento.prg.src;

public class Tablero {

	private int numCasillas;
	private Casilla[] casillas;
	
	public Tablero(int numCasillas, Casilla[] casillas) {
		this.numCasillas = numCasillas;
		this.casillas = casillas;
	}

	public int getNumCasillas() {
		return numCasillas;
	}

	public void setNumCasillas(int numCasillas) {
		this.numCasillas = numCasillas;
	}

	public Casilla[] getCasilla() {
		return casillas;
	}

	public void setCasilla(Casilla[] casilla) {
		this.casillas = casilla;
	}
	
	public void imprimirTablero() {
		System.out.println(casillas);
	}
	
}
