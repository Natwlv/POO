package personaServicio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import personaEntidad.Entidad;

public class Servicio {
	
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	Entidad persona = new Entidad();

public Entidad crearPersona(){
				
		
		System.out.println("Ingrese nombre");
		persona.setNombre(leer.next());
		 
		System.out.println("Ingrese fecha de nacimiento");
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Ingrese DÍA");
		int dia = leer.nextInt();
			 
		System.out.println("Ingrese MES");
		int mes = leer.nextInt();

		System.out.println("Ingrese AÑO");
		int anio = leer.nextInt();
			 
		Date fecha = new Date(anio-1900,mes-1,dia);
			
			 
		String fechaFormat2 = sdf.format(fecha);
		System.out.println("fecha ingresada: " +fechaFormat2);
			 

		persona.setFechaNacimiento(fecha);
		 
		return persona;
	}

public void calcularEdad() {
	Date fechaActual = new Date();		
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	String fechaFormat = sdf.format(fechaActual);
	persona.getFechaNacimiento();
	
	persona.setEdad(fechaActual.getYear() - persona.getFechaNacimiento().getYear());

	System.out.println("Edad: " + persona.getEdad());
}

public boolean menorQue(int edad1) {
	boolean menor = false;

	if(edad1 > persona.getEdad()) {
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
