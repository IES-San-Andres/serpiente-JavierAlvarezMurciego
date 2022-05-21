package serpiente.movimiento.prg.src;

public class Partida {
	private boolean ganar;
	private int puntuacion;
	private Serpiente serpiente;
	
	public Partida(boolean ganar, int puntuacion, Serpiente serpiente) {
		this.ganar = ganar;
		this.puntuacion = puntuacion;
		this.serpiente = serpiente;
	}

	public boolean isGanar() {
		return ganar;
	}

	public void setGanar(boolean ganar) {
		this.ganar = ganar;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Serpiente getSerpiente() {
		return serpiente;
	}

	public void setSerpiente(Serpiente serpiente) {
		this.serpiente = serpiente;
	}
	
	
}
