package puntosServicio;

import java.util.Scanner;

import puntosEntidad.Entidad;

public class Servicio {
	
	/*
	 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link: 
	 */
	
	
	
	Entidad puntos = new Entidad();
	
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	
	
	public Entidad crearPuntos() {
		System.out.println("Ingrese coordenada x1");
		puntos.setX1(leer.nextInt());
		System.out.println("Ingrese coordenada y1");
		puntos.setY1(leer.nextInt());
		System.out.println("Ingrese coordenada x2");
		puntos.setX2(leer.nextInt());
		System.out.println("Ingrese coordenada y2");
		puntos.setY2(leer.nextInt());
		
		
		return puntos;
	}
	public void distanciaPuntos() {
		
		double distancia = Math.sqrt(((Math.pow(puntos.getX2()-puntos.getX1(), 2))) + ((Math.pow(puntos.getY2()-puntos.getY1(), 2))));
		System.out.println("La distancia entre los dos puntos es de " + (float) distancia);
	}
}
