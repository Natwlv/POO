package entidad;

import java.util.Scanner;

public class Rectangulo {
	private int base;
	private int altura;

	public Rectangulo() {
		
	}

	public Rectangulo(int base, int altura) {
		this.base =base;
		this.altura = altura;
		
	}

	public void setbase(int base) {
		this.base = base;
	}

	public int getbase() {
		return base;

	}

	public void setaltura(int altura) {
		this.altura = altura;
	}

	public int getaltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "RectanguloEntidad [base=" + base + ", altura=" + altura + "]";
	}

	public void crearRectangulo() {
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese el valor de la base en cm");
		this.setbase(leer.nextInt());
		System.out.println("Ingrese el valor de la altura cm");
		this.setaltura(leer.nextInt());
		leer.close();
	}

	public void superficie() {
		int superficie = this.getbase() * this.getaltura();
		System.out.println("La superficie del rectángulo es de " + superficie + " cm ");

	}

	public void perimetro() {
		int perimetro = (this.getbase() + this.getaltura()) * 2;
		System.out.println("El perímetro del rectángulo es de " + perimetro + " cm ");

	}

	public void dibujarAsteriscos() {
		for (int i = 0; i < this.getbase(); i++) {

			for (int j = 0; j < this.getaltura(); j++) {

				if (i == 0 || j == 0 || j == this.getaltura() - 1 || i == this.getbase() - 1) {

					System.out.print(" *");

				} else {

					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

}
