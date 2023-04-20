package servicio;

import java.util.Scanner;

import entidad.Meses;

public class MesesServicio {

	public void comenzarJuego(Meses juego) {
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		System.out.println(juego.getMesSecreto());
		System.out.println("Adivine el mes secreto");
		System.out.println("Introduzca el nombre del mes:");
		String mesAdivinar = leer.next();
		
		do {
						
			if (mesAdivinar.equalsIgnoreCase(juego.getMesSecreto())) {
				System.out.println("¡Ha acertado!");
			} else {
				System.out.println("Nop! Incoreccto. Intente con otro mes:");
				mesAdivinar = leer.next();
			}
		} while (!mesAdivinar.equalsIgnoreCase(juego.getMesSecreto()));
		System.out.println("¡Ha acertado!");
		leer.close();

	}

}
