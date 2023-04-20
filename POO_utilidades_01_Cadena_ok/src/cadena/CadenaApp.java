package cadena;

import cadenaServicio.CadenaService;

public class CadenaApp {

	public static void main(String[] args) {

		CadenaService servicio = new CadenaService();
		servicio.crearFrase();
		servicio.mostrarVocales();
		servicio.invertirFrase();
		servicio.vecesRepetido();
		servicio.compararLongitud();
		servicio.unirFrases();
		servicio.reemplazar();
		servicio.contiene();

	}
		

}
