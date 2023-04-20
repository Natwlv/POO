package persona;


import personaEntidad.Entidad;
import personaServicio.Servicio;

public class Persona {

	public static void main(String[] args) {
		Servicio serv = new Servicio();
		Entidad p1 = serv.crearPersona();
		serv.calcularEdad(p1);
		Entidad p2 = serv.crearPersona();
		int edad2 = serv.calcularEdad(p2);
		
	
		System.out.println("Edad ingresada menor: " + serv.menorQue(p1, edad2));
		serv.mostrarPersona(p1);
		serv.mostrarPersona(p2);

	}

}
