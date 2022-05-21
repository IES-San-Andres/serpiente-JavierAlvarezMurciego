package serpiente.movimiento.prg.src;

public class Serpiente {
	private int tamanio;
	private Movimiento[] movimientos;
	private Casilla [] casillas;
	private int R;
	private int G;
	private int B;
	
	public Serpiente(int tamanio, Movimiento[] movimientos, Casilla[] casillas, int r, int g, int b) {
		this.tamanio = tamanio;
		this.movimientos = movimientos;
		this.casillas = casillas;
		R = r;
		G = g;
		B = b;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Movimiento[] getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(Movimiento[] movimientos) {
		this.movimientos = movimientos;
	}

	public Casilla[] getCasillas() {
		return casillas;
	}

	public void setCasillas(Casilla[] casillas) {
		this.casillas = casillas;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}
	
	
}
