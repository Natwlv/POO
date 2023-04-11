package Main;

import Entidad.entidadCuenta;
import Servicio.servicioCuenta;

public class cuenta {

	public static void main(String[] args) {
		servicioCuenta cuenta = new servicioCuenta();
		entidadCuenta cuenta1 = cuenta.crearCuenta();
		
		
		cuenta.ingresarDinero(cuenta1);
		cuenta.retirarDinero(cuenta1);
		cuenta.extraccionRapida(cuenta1);
		cuenta.consultarSaldo(cuenta1);
		cuenta.consultarDatos(cuenta1);
		
		
		cuenta1 = null;
	}

}
