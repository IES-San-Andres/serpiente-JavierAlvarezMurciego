package serpiente.movimiento.prg.src;

public class Main {
	
	public static void main (String [] args) {
		
		//Creamos el menú
		//Crear la funcion imprime menú
		//LLamarla
		String[] texto = new String[2];
		texto[0]="Jugar";
		texto[1]="Salir";
	
		Menu menu1 = new Menu(2,texto,"Serpiente Creciente");
		
		

		menu1.imprimirMenu();
		
		int num = 0;
		num = Teclado.readInteger();
		
		if(num==1) {
			crearTablero();
		}else if (num==2) {
			
		}else {
			System.out.println("Error!!! Solo acepta los números 1 o 2");
			System.out.println("Porfavor, introduzca uno de esos dos números");
		}
	}
	
	public static void crearTablero() {
		
		Casilla[] vect = new Casilla[100];
		
		for (int i=0; i<1 ;i++) {
			for(int j=0; j<100 ;j++) {
				 vect[j] =  new Casilla(i,j);
			}
		}
		
		Tablero tablero1 = new Tablero(100,vect);
		tablero1.imprimirTablero();
		
	}

}
