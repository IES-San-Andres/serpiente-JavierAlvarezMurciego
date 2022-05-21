package serpiente.movimiento.prg.src;

public class Menu {
	private int numOpciones;
	private String [] opciones;
	private String titulo;
	
	public Menu(int numOpciones, String[] opciones, String titulo) {
		this.numOpciones = numOpciones;
		this.opciones = opciones;
		this.titulo = titulo;
	}

	public int getNumOpciones() {
		return numOpciones;
	}

	public void setNumOpciones(int numOpciones) {
		this.numOpciones = numOpciones;
	}

	public String[] getOpciones() {
		return opciones;
	}

	public void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void imprimirMenu() {
		System.out.println(titulo);
		
		for(int i=0; i<opciones.length; i++) {
			System.out.println((i+1)+"-"+opciones[i]);
		}
		
		
	}
	
}
