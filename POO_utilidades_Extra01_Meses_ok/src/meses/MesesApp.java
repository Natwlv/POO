package meses;

import entidad.Meses;
import servicio.MesesServicio;

public class MesesApp {

	public static void main(String[] args) {
		
		MesesServicio sMeses = new MesesServicio();
		Meses juego = new Meses();
		sMeses.comenzarJuego(juego);
		
	}
}
