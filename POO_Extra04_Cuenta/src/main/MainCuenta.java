package main;

import entidad.Cuenta;

public class MainCuenta {

	public static void main(String[] args) {
		/*
		 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
		 *  Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
		 *  dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
		 *  después de realizar una transacción de retiro.

		 */
		
		Cuenta cuenta1 = new Cuenta();
		cuenta1.retirarDinero();

	}

}
