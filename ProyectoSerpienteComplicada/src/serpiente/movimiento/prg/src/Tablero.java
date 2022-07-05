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
		
		for(int i=0;i<casillas.length;i++ ) {
			if(i%10==0) {
				System.out.print("\n");
				System.out.print("|");
			}
			if(i>=90 && i<=99) {
				System.out.print("_");
			}
			if(i>=0 && i<=9) {
				System.out.print("-");
			}
			System.out.print(" ");
			if((i+1)%10==0) {
				System.out.print("|");
				System.out.print("\t");
			}

		}
		
	}
	
}
