package main;

import entidad.Rectangulo;

public class MainRectangulo {

	public static void main(String[] args) {

		Rectangulo rectangulo1 = new Rectangulo();
		rectangulo1.setLado1(4);
		rectangulo1.setLado2(6);
		rectangulo1.calcularArea(rectangulo1.getLado1(), rectangulo1.getLado2());
		System.out.println("El área del rectángulo es " + rectangulo1.getLado1() + " x " + rectangulo1.getLado2()
				+ " = " + rectangulo1.calcularArea(4, 6));
	}

}
