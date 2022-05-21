package serpiente.movimiento.prg.src;

public class Comida {
	private boolean visible;
	private Casilla casilla;
	
	public Comida(boolean visible, Casilla casilla) {
		this.visible = visible;
		this.casilla = casilla;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Casilla getCasilla() {
		return casilla;
	}

	public void setCasilla(Casilla casilla) {
		this.casilla = casilla;
	}
	
	
}
