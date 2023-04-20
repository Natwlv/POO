package personaServicio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import personaEntidad.Entidad;

public class Servicio {

	Scanner leer = new Scanner(System.in).useDelimiter("\n");

	public Entidad crearPersona() {
		Entidad persona = new Entidad();

		System.out.println("Ingrese nombre");
		persona.setNombre(leer.next());

		System.out.println("FECHA DE NACIMIENTO:");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Ingrese DÍA: ");
		int dia = leer.nextInt();

		System.out.print("Ingrese MES: ");
		int mes = leer.nextInt();

		System.out.print("Ingrese AÑO: ");
		int anio = leer.nextInt();

		Date fecha = new Date(anio - 1900, mes - 1, dia);

		String fechaFormat2 = sdf.format(fecha);
		System.out.println("Fecha ingresada: " + fechaFormat2);

		persona.setFechaNacimiento(fecha);

		return persona;
	}

	public int calcularEdad(Entidad persona) {
		Date fechaActual = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaFormat = sdf.format(fechaActual);
		persona.getFechaNacimiento();

		persona.setEdad(fechaActual.getYear() - persona.getFechaNacimiento().getYear());
		int edad = persona.getEdad();

		System.out.println("Edad: " + persona.getEdad());
		return edad;
	}

	public boolean menorQue(Entidad persona, int edad1) {
		boolean menor = false;

		if (edad1 > persona.getEdad()) {
			menor = false;
		} else {
			menor = true;
		}
		return menor;
	}

	public void mostrarPersona(Entidad persona) {
		System.out.println(persona.toString());
	}
}
