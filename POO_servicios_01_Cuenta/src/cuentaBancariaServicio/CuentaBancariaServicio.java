package cuentaBancariaServicio;

import java.util.Scanner;

import cuentaBancaria.CuentaBancaria;

public class CuentaBancariaServicio {
	Scanner leer = new Scanner(System.in).useDelimiter("\n");

	public CuentaBancaria crearCuenta() {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		System.out.println("Número de cuenta:");
		cuenta1.setNumeroCuenta(leer.nextInt());
		System.out.println("DNI:");
		cuenta1.setDniCliente(leer.nextLong());
		System.out.println("Saldo actual:");
		cuenta1.setSaldoActual(leer.nextDouble());
		System.out.println("Su cuenta se ha creado correctamente");
		return cuenta1;
	}

	public void menuCuenta(CuentaBancaria cuenta1) {
		int opcion = 0;
		do {
			System.out.println("");
			System.out.println("-------------MENÚ------------");
			System.out.println("1.Ingresar dinero");
			System.out.println("2.Retirar dinero");
			System.out.println("3.Extracción rápida");
			System.out.println("4.Consultar saldo");
			System.out.println("5.Consultar datos de la cuenta");
			System.out.println("6.Salir");
			opcion = leer.nextInt();
			System.out.println("-----------------------------");
			System.out.println("");

			switch (opcion) {
			case 1:
				ingresar(cuenta1);
				break;

			case 2:
				retirar(cuenta1);
				break;
			case 3:
				extraccionRapida(cuenta1);
				break;

			case 4:
				consultarSaldo(cuenta1);
				break;
			case 5:
				consultarDatos(cuenta1);
				break;
			case 6:
				System.out.println("Operación finalizada");
				break;

			default:
				System.out.println("Opción inválida.");
				break;
			}
		} while (opcion != 6);
	}

	public double ingresar(CuentaBancaria cuenta1) {
		System.out.println("Cantidad de dinero a depositar:");
		double deposito = leer.nextDouble();
		cuenta1.setSaldoActual(deposito + cuenta1.getSaldoActual());
		System.out.println("Saldo actualizado: $" + cuenta1.getSaldoActual());

		return cuenta1.getSaldoActual();
	}

	public double retirar(CuentaBancaria cuenta1) {

		System.out.println("Cantidad de dinero a retirar:");
		double retiro = leer.nextDouble();

		if (retiro > cuenta1.getSaldoActual()) {
			System.out.println("No posee saldo suficiente");
			System.out.println("Se ha extraído el total de la cuenta");
			cuenta1.setSaldoActual(0);
			System.out.println("Saldo actual: $" + cuenta1.getSaldoActual());

		} else {
			System.out.println("Operación ralizada con éxito");
			cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
			System.out.println("Saldo actualizado: $" + cuenta1.getSaldoActual());
		}
		return cuenta1.getSaldoActual();
	}

	public double extraccionRapida(CuentaBancaria cuenta1) {

		System.out.println("Saldo actual: $" + cuenta1.getSaldoActual());
		System.out.println("Cantidad de dinero a retirar:");
		double extraccion = leer.nextDouble();
		if (extraccion > (cuenta1.getSaldoActual() * 0.20)) {
			System.out.println("Operación cancelada. Sólo puede retirar hasta un 20% de su saldo actual");
		} else {
			System.out.println("Operación ralizada con éxito");
			cuenta1.setSaldoActual(cuenta1.getSaldoActual() - extraccion);
			System.out.println("Saldo actualizado: $" + cuenta1.getSaldoActual());
		}

		return cuenta1.getSaldoActual();
	}

	public void consultarSaldo(CuentaBancaria cuenta1) {

		System.out.println("Saldo disponible en la cuenta: $" + cuenta1.getSaldoActual());

	}

	public void consultarDatos(CuentaBancaria cuenta1) {

		System.out.println("------------DATOS CUENTA------------");
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("DNI: " + cuenta1.getDniCliente());
		System.out.println("Saldo: $" + cuenta1.getSaldoActual());
		System.out.println("------------------------------------");

	}
}
