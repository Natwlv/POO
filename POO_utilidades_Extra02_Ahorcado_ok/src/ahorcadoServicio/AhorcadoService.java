package ahorcadoServicio;

import java.util.Scanner;

import ahorcadoEntidad.Ahorcado;

public class AhorcadoService {

	static Scanner leer = new Scanner(System.in).useDelimiter("\n");
	Ahorcado juego = new Ahorcado();

	public Ahorcado crearJuego() {

		System.out.print("Ingrese la palabra a adivinar: ");
		String palabraIngresada = leer.next().toLowerCase();
		juego.setPalabra(palabraIngresada.toCharArray());

		System.out.print("Ingrese la cantidad de oportunidades máximas: ");
		juego.setOportunidadesMaximas(leer.nextInt());
		juego.setOportunidadesRestantes(juego.getOportunidadesMaximas());
		juego.setLetrasEncontradas(0);

		return juego;
	}

	public void longitud() {
		System.out.println("La palabra a encontrar tiene " + juego.getPalabra().length + " letras");
	}

	public boolean buscar(char letra) {
		boolean encontrada = false;
		for (int i = 0; i < juego.getPalabra().length; i++) {
			if (juego.getPalabra()[i] == letra) {
				encontrada = true;
				juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
			}
		}

		if (!encontrada) {
			juego.setOportunidadesRestantes(juego.getOportunidadesRestantes() - 1);
		}

		return encontrada;
	}

	public boolean encontradas(char letra) {
		int encontradas = 0;
		for (int i = 0; i < juego.getPalabra().length; i++) {
			if (juego.getPalabra()[i] == letra) {
				encontradas++;
			}
		}

		int faltantes = juego.getPalabra().length - juego.getLetrasEncontradas();

		System.out.println("Letras encontradas: " + juego.getLetrasEncontradas() + " - Letras faltantes: " + faltantes);

		return encontradas > 0;
	}

	public void intentos() {
		System.out.println("Oportunidades restantes: " + juego.getOportunidadesRestantes());
	}

	public void juego() {
		while (juego.getOportunidadesRestantes() > 0 && juego.getLetrasEncontradas() < juego.getPalabra().length) {
			System.out.print("Ingrese una letra: ");
			char letra = leer.next().toLowerCase().charAt(0);

			if (buscar(letra)) {
				System.out.println("¡Iupi!Letra encontrada!");
			} else {
				System.out.println("Olé!!! Letra no encontrada.");
			}

			encontradas(letra);
			intentos();
		}

		if (juego.getOportunidadesRestantes() == 0) {
			System.out.println("¡Alpiste! ¡Perdiste! La palabra era: " + String.valueOf(juego.getPalabra()));
		} else {
			System.out.println("¡Qué genio! ¡Adivinaste la palabra!");
		}
	}
}
