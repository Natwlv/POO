package cuentaBancariaApp;

import cuentaBancaria.CuentaBancaria;
import cuentaBancariaServicio.CuentaBancariaServicio;

public class CuentaBancariaApp {

	public static void main(String[] args) {
		
		CuentaBancariaServicio sCuenta = new CuentaBancariaServicio();
		CuentaBancaria cuentaA = sCuenta.crearCuenta();
		sCuenta.menuCuenta(cuentaA);
		

	}

}
