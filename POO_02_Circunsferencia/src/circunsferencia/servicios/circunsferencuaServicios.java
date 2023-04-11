package circunsferencia.servicios;

import java.util.Scanner;
import circunsferencia.entidades.circunsferenciaEntidades;

public class circunsferencuaServicios {
	static Scanner leer = new Scanner(System.in).useDelimiter("\n");

	circunsferenciaEntidades radio1 = new circunsferenciaEntidades();

	
	public circunsferenciaEntidades crearCircunferencia() {
				
		System.out.println("Ingrese el radio de la circunsferencia");
		radio1.setRadio(leer.nextDouble());
				
		return radio1;
	}
	public void area(circunsferenciaEntidades radio1 ) {
		double area1 =2 * Math.PI * Math.pow(radio1.getRadio(),2);
		System.out.println("El área de la circunsferencia es: " + area1);
		
	}
	public void perimetro(circunsferenciaEntidades radio1) {
		double perimetro1 = 2 * Math.PI * radio1.getRadio();
		System.out.println("El perímetro de la circunsferencia es: " + perimetro1);

	}
	
}
