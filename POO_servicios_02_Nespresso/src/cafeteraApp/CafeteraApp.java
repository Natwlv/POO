package cafeteraApp;

import cafetera.Cafetera;
import cafeteraServicio.CafeteraServicio;

public class CafeteraApp {

	public static void main(String[] args) {
		
		CafeteraServicio sCafetera = new CafeteraServicio();
		Cafetera cafe = sCafetera.crearCafetera();
		sCafetera.menuCafetera(cafe);

	}

}
