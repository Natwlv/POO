package dateApp;

import fechaService.FechaService;

public class DateApp {

	public static void main(String[] args) {
		
		
		FechaService sFecha = new FechaService();
		sFecha.diferencia(sFecha.fechaActual(), sFecha.fechaNacimiento());

	}

}
