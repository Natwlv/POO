package raicesServicio;

import raicesEntidad.Entidad;

public class Servicio {
	
	Entidad raiz = new Entidad();
	
	public double getDiscriminante() {
		double discriminante = (Math.pow(raiz.getB(), 2))-4*raiz.getA()*raiz.getC();
		System.out.println(discriminante);
		return discriminante;
	}
	
	public boolean tieneRaices() {
		boolean raices = false;
		if (getDiscriminante() >= 0) {
			raices = true;
		} else {
			raices=false;
		} 
		
		return raices;
	}
	
	public boolean tieneRaiz() {
		boolean raiz = false;
		if (getDiscriminante() == 0) {
			raiz = true;
		} else {
			raiz = false;
		}
		return raiz;
	}
	
	public void obtenerRaices() {
		if (tieneRaices() == true) {
			System.out.println("Raíces:");
			System.out.println(tieneRaices());}			
		}
		
	public void obtenerRaiz() {
		if (tieneRaiz() == true) {
			System.out.println("Raíz:");
			System.out.println(tieneRaices());
				
		} else {
			System.out.println("No tiene una única solución posible");}
		}
	
	public void calcular() {
		tieneRaices();
		tieneRaiz();
		obtenerRaices();
		obtenerRaiz();

		double ecuacion = (-raiz.getB() + Math.sqrt(Math.pow(raiz.getB(),2))-(4*raiz.getA()*raiz.getC())) / (2*raiz.getA());
		System.out.println("resultado ecuación: " +ecuacion);
	}

}
