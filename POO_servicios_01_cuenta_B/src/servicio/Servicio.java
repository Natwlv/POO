package servicio;

import java.util.Scanner;

import entidad.Entidad;

public class Servicio {

	private Scanner leer = new Scanner(System.in).useDelimiter("\n");

	Entidad cuentaUno = new Entidad();

	public Entidad crearCuenta() {
		System.out.println("Ingrese el número de cuenta");
		cuentaUno.setNumeroCuenta(leer.nextInt());
		System.out.println("Ingrese su DNI (sin puntos ni espacios");
		cuentaUno.setDni(leer.nextInt());
		System.out.println("Ingrese su saldo actual");
		cuentaUno.setSaldoActual(leer.nextInt());

		return new Entidad(cuentaUno.getNumeroCuenta(), cuentaUno.getDni(), cuentaUno.getSaldoActual());
	}

	public void ingresarDinero(Entidad saldoActual) {
		System.out.println("Ingrese la cantidad de dinero a depositar");
		double ingreso = (leer.nextDouble());
		saldoActual.setSaldoActual(saldoActual.getSaldoActual() + ingreso);
		System.out.println("Su saldo actual es $" + saldoActual.getSaldoActual());

	}

	public void retirarDinero(Entidad saldoActual) {
		System.out.println("Ingrese la cantidad de dinero a retirar");
		double retiro = (leer.nextDouble());
		saldoActual.setSaldoActual(saldoActual.getSaldoActual() - retiro);

		if (retiro > saldoActual.getSaldoActual()) {
			saldoActual.setSaldoActual(0);
			System.out.println("la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en: "
					+ saldoActual.getSaldoActual());

		} else {
			System.out.println("Su saldo actual después de la extracción es $ " + saldoActual.getSaldoActual());

		}

	}

	public void extraccionRapida(Entidad saldoActual) {
		System.out.println("Cuánto dinero quiere retirar?");
		double extraccion = (leer.nextDouble());

		do {

			if (extraccion > (saldoActual.getSaldoActual() * 0.2)) {
				System.out.println("No puede retirar un monto mayor al 20% de su saldo actual");
				System.out.println("Vuelva a ingresar dinero a retirar");
				extraccion = (leer.nextDouble());
				saldoActual.setSaldoActual(saldoActual.getSaldoActual() - extraccion);

			} else {
				saldoActual.setSaldoActual(saldoActual.getSaldoActual() - extraccion);

			}
		} while (extraccion > (saldoActual.getSaldoActual() * 0.2));
		System.out.println("Su saldo actual después de la extracción rápida es $ " + saldoActual.getSaldoActual());

	}

	public void consultarSaldo(Entidad saldoActual) {
		System.out.println("Su saldo disponible es $ " + saldoActual.getSaldoActual());
	}

	public void consultarDatos(Entidad saldoActual) {
		System.out.println("======================");

		System.out.println("DATOS DE LA CUENTA");
		System.out.println("======================");
		System.out.println("Número de cuenta: " + cuentaUno.getNumeroCuenta());
		System.out.println("DNI: " + cuentaUno.getDni());
		System.out.println("Saldo: " + saldoActual.getSaldoActual());

	}
}