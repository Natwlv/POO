package Servicios;

import java.util.Scanner;

import entidad.EntidadOperacion;

public class serviciosOperacion {
	static Scanner leer = new Scanner(System.in).useDelimiter("\n");
	EntidadOperacion obj1 = new EntidadOperacion();

	
	public EntidadOperacion crearOperacion() {
		System.out.println("Ingrese 2 números");
		obj1.setNum1(leer.nextInt());
		obj1.setNum2(leer.nextInt());
		
		//EntidadOperacion op1 = new EntidadOperacion(obj1.getNum1(), obj1.getNum2());
		return new EntidadOperacion(obj1.getNum1(), obj1.getNum2());
		
		
	}


	public void sumar() {
		int suma = obj1.getNum1() + obj1.getNum2();
		System.out.println(obj1.getNum1() + " + " + obj1.getNum2() + " = "+suma);

	}
	
	public void restar() {
		int resta = obj1.getNum1() - obj1.getNum2();
		System.out.println(obj1.getNum1() + " - " + obj1.getNum2() + " = "+resta);
		
	}
	
	public void multiplicar() {
		int multiplo = obj1.getNum1() * obj1.getNum2();
		if (obj1.getNum1() == 0 || obj1.getNum2()== 0) {
			System.out.println(obj1.getNum1() + " x " + obj1.getNum2() + " = "+multiplo);
			System.out.println("Error el resultado da 0");

		} else {
			System.out.println(obj1.getNum1() + " x " + obj1.getNum2() + " = "+multiplo);

		}
	}
	
	public void dividir() {
		double divido = (double)obj1.getNum1() / (double)obj1.getNum2();
		if (obj1.getNum1() == 0 || obj1.getNum2()== 0) {
			System.out.println("Error. No se puede dividir por 0");

		} else {
			System.out.println(obj1.getNum1() + " / " + obj1.getNum2() + " = "+divido);

		}

	}
	

}
