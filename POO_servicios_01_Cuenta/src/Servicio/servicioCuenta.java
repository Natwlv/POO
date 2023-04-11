package Servicio;

import java.util.Scanner;
import Entidad.entidadCuenta;

public class servicioCuenta {
	private Scanner leer = new Scanner(System.in).useDelimiter("\n");

	public entidadCuenta crearCuenta() {
		entidadCuenta cuentaUno = new entidadCuenta();

		System.out.println("Ingrese el número de cuenta");
		cuentaUno.setNumeroCuenta(leer.nextInt());
		System.out.println("Ingrese su DNI (sin puntos ni espacios)");
		cuentaUno.setDni(leer.nextInt());
		System.out.println("Ingrese su saldo actual");
		cuentaUno.setSaldoActual(leer.nextInt());

		return cuentaUno;
	}

	public void ingresarDinero(entidadCuenta cuentaUno) {
		System.out.println("Ingrese la cantidad de dinero a depositar");
		cuentaUno.setSaldoActual(cuentaUno.getSaldoActual() + leer.nextDouble());
		System.out.println("Su saldo actual es $" + cuentaUno.getSaldoActual());

	}

	public void retirarDinero(entidadCuenta cuentaUno) {
		System.out.println("Ingrese la cantidad de dinero a retirar");
		double retiro = (leer.nextDouble());

		if (retiro > cuentaUno.getSaldoActual()) {
			cuentaUno.setSaldoActual(0);
			System.out.println("la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en: "
					+ cuentaUno.getSaldoActual());

		} else {
			cuentaUno.setSaldoActual(cuentaUno.getSaldoActual() - retiro);
			System.out.println("Su saldo actual después de la extracción es $ " + cuentaUno.getSaldoActual());

		}

	}

	public void extraccionRapida(entidadCuenta cuentaUno) {
		System.out.println("Cuánto dinero quiere retirar?");
		double extraccion = (leer.nextDouble());

		do {

			if (extraccion > (cuentaUno.getSaldoActual() * 0.2)) {
				System.out.println("No puede retirar un monto mayor al 20% de su saldo actual");
				System.out.println("Vuelva a ingresar dinero a retirar");
				extraccion = (leer.nextDouble());

			}
			if (extraccion < (cuentaUno.getSaldoActual() * 0.2)) {
				cuentaUno.setSaldoActual(cuentaUno.getSaldoActual() - extraccion);

			}
		} while (extraccion > (cuentaUno.getSaldoActual() * 0.2));
		System.out.println("Su saldo actual después de la extracción rápida es $ " + cuentaUno.getSaldoActual());

	}

	public void consultarSaldo(entidadCuenta cuentaUno) {
		System.out.println("Su saldo disponible es $ " + cuentaUno.getSaldoActual());
	}

	public void consultarDatos(entidadCuenta cuentaUno) {
		System.out.println("======================");

		System.out.println("DATOS DE LA CUENTA");
		System.out.println("======================");
		System.out.println("Número de cuenta: " + cuentaUno.getNumeroCuenta());
		System.out.println("DNI: " + cuentaUno.getDni());
		System.out.println("Saldo: $" + cuentaUno.getSaldoActual());

	}

}
