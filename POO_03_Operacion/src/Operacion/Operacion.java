package operacion;

import java.util.Scanner;


public class Operacion {

	private int num1;
	private int num2;

	// constructores
	public Operacion() {

	}

	public Operacion(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// get & set. Get encapsula los datos

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum2() {
		return num2;
	}

	@Override
	public String toString() {
		return "EntidadOperacion [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
	Scanner leer = new Scanner(System.in).useDelimiter("\n");

	public void crearOperacion() {
		System.out.println("Ingrese 2 números");
		this.setNum1(leer.nextInt());
		this.setNum2(leer.nextInt());				
	}


	public void sumar() {
		int suma = this.getNum1() + this.getNum2();
		System.out.println(this.getNum1() + " + " + this.getNum2() + " = "+suma);

	}
	
	public void restar() {
		int resta = this.getNum1() - this.getNum2();
		System.out.println(this.getNum1() + " - " + this.getNum2() + " = "+resta);
		
	}
	
	public void multiplicar() {
		int multiplo = this.getNum1() * this.getNum2();
		if (this.getNum1() == 0 || this.getNum2()== 0) {
			System.out.println(this.getNum1() + " x " + this.getNum2() + " = "+multiplo);
			System.out.println("Error el resultado da 0");

		} else {
			System.out.println(this.getNum1() + " x " + this.getNum2() + " = "+multiplo);

		}
	}
	
	public void dividir() {
		double divido = (double)this.getNum1() / (double)this.getNum2();
		if (this.getNum1() == 0 || this.getNum2()== 0) {
			System.out.println("Error. No se puede dividir por 0");

		} else {
			System.out.println(this.getNum1() + " / " + this.getNum2() + " = "+divido);

		}

	}

}
