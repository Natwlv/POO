package rectangulo;

import servicio.rectanguloServicio;

public class RectanguloMain {

	public static void main(String[] args) {

		rectanguloServicio rect = new rectanguloServicio();
		rect.crearRectangulo();
		rect.superficie();
		rect.perimetro();
		rect.dibujarAsteriscos();

	}

}
