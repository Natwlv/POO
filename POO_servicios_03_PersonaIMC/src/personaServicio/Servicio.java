package personaServicio;

import java.util.Scanner;

import personaEntidad.Entidad;

public class Servicio {

	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	Entidad persona = new Entidad();

	public Entidad crearPersona() {
		System.out.println("Nombre");
		persona.setNombre(leer.next());
		do {
			System.out.println("Sexo (M-H-O)");
			persona.setSexo(leer.next().toUpperCase());
			if (!persona.getSexo().equalsIgnoreCase("M") && !persona.getSexo().equalsIgnoreCase("H")
					&& !persona.getSexo().equalsIgnoreCase("O")) {
				System.out.println("Carácter no válido.");
			}
		} while (!persona.getSexo().equalsIgnoreCase("M") && !persona.getSexo().equalsIgnoreCase("H")
				&& !persona.getSexo().equalsIgnoreCase("O"));

		System.out.println("Edad");
		persona.setEdad(leer.nextInt());
		System.out.println("Peso");
		persona.setPeso(leer.nextDouble());
		System.out.println("Altura");
		persona.setAltura(leer.nextDouble());
		return persona;

	}


	public boolean esMayorDeEdad(Entidad persona) {
        return (persona.getEdad()>= 18);

	}

	public double calcularIMC(Entidad persona) {
		double imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());

		if (imc < 20) {
			imc= -1;
		} else if (imc >= 20 || imc <= 25) {
			imc= 0;

		} else if (imc > 25) {
			imc= 1;

		}
		return imc;
	}
}
