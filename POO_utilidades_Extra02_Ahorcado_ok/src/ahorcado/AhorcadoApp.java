package ahorcado;

import ahorcadoServicio.AhorcadoService;

public class AhorcadoApp {

	public static void main(String[] args) {
		
		AhorcadoService ahorcado = new AhorcadoService();
	    ahorcado.crearJuego();
	    ahorcado.longitud();
	    ahorcado.intentos();
	    ahorcado.juego();

	}

}
