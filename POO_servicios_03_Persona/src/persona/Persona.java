package persona;

import java.util.Date;
import java.util.Scanner;

import personaEntidad.Entidad;
import personaServicio.Servicio;

public class Persona {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		Servicio serv = new Servicio();
		Entidad p1 = serv.crearPersona();
		serv.calcularEdad();
		System.out.println("Ingrese otra edad");
		int edad1 = leer.nextInt();
		
		System.out.println("Edad ingresada menor: " + serv.menorQue(edad1));
		serv.mostrarPersona(p1);

	}

}
