package cafetera;

import cafetera.Entidad.CafeteraEntidad;
import cafetera.Servicio.CafeteraServicio;

public class CafeteraMain {

	public static void main(String[] args) {
		
		CafeteraServicio unCafe = new CafeteraServicio();
		CafeteraEntidad cafe = unCafe.crearCafetera();
		unCafe.llenarCafetera(cafe);
		unCafe.vaciarCafetera(cafe);
		unCafe.agregarCafe(cafe);
		unCafe.servirTaza(cafe);
		
		
		
		cafe=null;  // porque dejamos de usar el objeto. Garbage collector
	}

}
