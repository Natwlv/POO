package nif;

import nifServicio.Servicio;

public class nifMain {

	public static void main(String[] args) {
		Servicio serv = new Servicio();
		serv.crearNif();
		serv.mostrar();

	}

}
