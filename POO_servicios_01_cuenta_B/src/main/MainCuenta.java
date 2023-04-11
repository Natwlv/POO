package main;

import entidad.Entidad;
import servicio.Servicio;

public class MainCuenta {

	public static void main(String[] args) {
		
		Servicio cuenta = new Servicio();
		Entidad cuenta1 = cuenta.crearCuenta();
		
		
		cuenta.ingresarDinero(cuenta1);
		cuenta.retirarDinero(cuenta1);
		cuenta.extraccionRapida(cuenta1);
		cuenta.consultarSaldo(cuenta1);
		cuenta.consultarDatos(cuenta1);

	}

}
