package fechaService;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	
	public Date fechaNacimiento() {
		System.out.println("FECHA NACIMIENTO");
		System.out.print("Día:");
		int dia = leer.nextInt();
		System.out.print("Mes:");
		int mes = leer.nextInt();
		System.out.print("Año:");
		int anio = leer.nextInt();
		Date fecha = new Date(anio-1900,mes-1,dia);
		return fecha;
	}

	
	public Date fechaActual() {
		Date fechaActual = new Date();
		return fechaActual;
	}
	
	public int diferencia(Date fecha, Date fechaActual) {
		int diferencia = (fechaActual.getYear()) - fecha.getYear();
		System.out.println("Edad: " + Math.abs(diferencia));
		return diferencia;

		
	}
}
