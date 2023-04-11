package entidad;

import java.util.Scanner;

public class Juego {
	private int numJugador1;
	private int numJugador2;
	private int intentosJugador2;
	private int victoriasJugador1;
	private int victoriasJugador2;

	public Juego() {
	}

	public Juego(int numJugador1, int numJugador2, int intentosJugador2, int victoriasJugador1, int victoriasJugador2) {
		this.numJugador1 = numJugador1;
		this.numJugador2 = numJugador2;
		this.intentosJugador2 = intentosJugador2;
		this.victoriasJugador1 = victoriasJugador1;
		this.victoriasJugador2 = victoriasJugador2;
	}

	public int getNumJugador1() {
		return numJugador1;
	}

	public void setNumJugador1(int numJugador1) {
		this.numJugador1 = numJugador1;
	}

	public int getNumJugador2() {
		return numJugador2;
	}

	public void setNumJugador2(int numJugador2) {
		this.numJugador2 = numJugador2;
	}

	public int getIntentosJugador2() {
		return intentosJugador2;
	}

	public void setIntentosJugador2(int intentosJugador2) {
		this.intentosJugador2 = intentosJugador2;
	}

	public int getVictoriasJugador1() {
		return victoriasJugador1;
	}

	public void setVictoriasJugador1(int victoriasJugador1) {
		this.victoriasJugador1 = victoriasJugador1;
	}

	public int getVictoriasJugador2() {
		return victoriasJugador2;
	}

	public void setVictoriasJugador2(int victoriasJugador2) {
		this.victoriasJugador2 = victoriasJugador2;
	}

	public void iniciarJuego() {
		Scanner leer = new Scanner(System.in);
		boolean seguirJugando = true;

		while (seguirJugando) {
			// Jugador 1 elige un número
			System.out.println("Jugador 1, elige un número entre 1 y 100:");
			this.setNumJugador1(leer.nextInt());

			// Jugador 2 elije el número de intentos
			System.out.println("Elija cantidad de intentos para adivinar el número elegido del jugador 1");
			this.setIntentosJugador2(leer.nextInt());

			// El jugador 2 intenta adivinar el número
			while (this.intentosJugador2 > 0) {
				System.out.println("Jugador 2: Adivine el número (quedan " + intentosJugador2 + " intentos restantes)");
				this.setNumJugador2(leer.nextInt());
				this.intentosJugador2--;
				// si adivina
				if (this.getNumJugador2() == this.getNumJugador1()) {
					System.out.println("¡Correcto! El número era " + this.getNumJugador1());
					this.victoriasJugador2++;
					break;

					// si no adivina
				} else if (this.getNumJugador2() > this.getNumJugador1()) {
					System.out.println("Más bajo.");
				} else {
					System.out.println("Más alto.");
				}
			}

			// Si el jugador 2 se queda sin intentos, gana el jugador 1
			if (this.getIntentosJugador2() == 0 && (this.getNumJugador2() != this.getNumJugador1())) {
				System.out.println("El jugador 2 se ha quedado sin intentos. Gana el jugador 1");
				this.victoriasJugador1++;
			}

			// Preguntar si los jugadores quieren seguir jugando
			System.out.println("¿Quieren seguir jugando? (S/N)");
			String respuesta = leer.next();

			if (respuesta.equalsIgnoreCase("N")) {
				seguirJugando = false;
			}
		}
		leer.close();

	}

	public void estadisticas() {
		// Imprimir estadísticas
		System.out.println("Estadísticas:");
		System.out.println("Jugador 1 ha ganado " + this.getVictoriasJugador1() + " veces");
		System.out.println("Jugador 2 ha ganado " + this.getVictoriasJugador2() + " veces con "
				+ this.getIntentosJugador2() + " intentos");

	}
}