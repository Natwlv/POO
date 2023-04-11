package cafetera.Servicio;

import java.util.Scanner;

import cafetera.Entidad.CafeteraEntidad;

public class CafeteraServicio {
	
	private Scanner leer = new Scanner(System.in).useDelimiter("\n");
	
	
	public CafeteraEntidad crearCafetera() {
		
		CafeteraEntidad cafetera = new CafeteraEntidad();
		System.out.println("Ingrese la capacidad de la cafetera");
	    cafetera.setCapacidadMaxima(leer.nextInt());
	    System.out.println("Ingrese la cantidad actual de café");
	    cafetera.setCantidadActual(leer.nextInt());
	    
	    return cafetera;
	}
	
	
	//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima

	public void llenarCafetera(CafeteraEntidad cantidadActual) {
		cantidadActual.setCantidadActual(cantidadActual.getCapacidadMaxima());
		System.out.println("La cafetera está llena con " + cantidadActual.getCantidadActual() + " ml");
		
	}
	/*
	 * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
	 */
	public void servirTaza(CafeteraEntidad cantidadActual) {
		System.out.println("Ingrese tamaño de la taza vacía");
		int taza = leer.nextInt();
		if (taza > cantidadActual.getCantidadActual()) {
			System.out.println("No alcanzó para llenar la taza");
			System.out.println("Solo se sirvió " + cantidadActual.getCantidadActual() + " ml");
		} else if (cantidadActual.getCantidadActual() > taza){
			cantidadActual.setCantidadActual(cantidadActual.getCantidadActual() - taza);
			System.out.println("Se llenó la taza con " + taza + " ml");

		} else if (cantidadActual.getCantidadActual() < taza) {
			System.out.println("Se llenó la taza con " + cantidadActual.getCantidadActual() + " ml");

		}
		
	}
	
	//Método vaciarCafetera(): pone la cantidad de café actual en cero.
	
	public void vaciarCafetera(CafeteraEntidad cantidadActual) {
		
		cantidadActual.setCantidadActual(0);
		System.out.println("Se vació la cafetera");

	}
	
	//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
	//recibe y se añade a la cafetera la cantidad de café indicada.
	
	public void agregarCafe(CafeteraEntidad cantidadActual) {
		System.out.println("Ingrese una cantidad de café");
		int cafe = leer.nextInt();
		cantidadActual.setCantidadActual(cantidadActual.getCantidadActual() + cafe);
		
	}
}
