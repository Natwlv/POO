package cafeteraServicio;

import java.util.Scanner;

import cafetera.Cafetera;

public class CafeteraServicio {
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	
	
	public Cafetera crearCafetera() {
		Cafetera cafe1 = new Cafetera();
		cafe1.setCantidadActual(500);
		cafe1.setCapacidadMaxima(2000);
		System.out.println("Cantidad de café actual: " + cafe1.getCantidadActual()+ " ml");
		System.out.println("Capacidad máxima de la cafetera: " + cafe1.getCapacidadMaxima()+ " ml");
		return cafe1;
		
	}


	public void menuCafetera(Cafetera cafe1) {
		int opcion = 0;
		do {
			System.out.println("");
			System.out.println("-------------MENÚ------------");
			System.out.println("1.Llenar cafetera");
			System.out.println("2.Servir taza");
			System.out.println("3.Vaciar cafetera");
			System.out.println("4.Agregar café");
			System.out.println("5.Salir");
			opcion = leer.nextInt();
			System.out.println("-----------------------------");
			System.out.println("");

			switch (opcion) {
			case 1:
				llenarCafetera(cafe1);
				break;

			case 2:
				servirTaza(cafe1);
				break;
			case 3:
				vaciarCafetera(cafe1);
				break;
			case 4:
				agregarCafe(cafe1);
				break;
			case 5:
				System.out.println("Operación finalizada");
				break;

			default:
				System.out.println("Opción inválida.");
				break;
			}
		} while (opcion != 5);
	}
	
	public int llenarCafetera(Cafetera cafe1) {
		cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
		System.out.println("La cafetera se ha llenado");
		return cafe1.getCantidadActual();
	}

	public int servirTaza(Cafetera cafe1) {

		System.out.println("Ingrese tamaño de la taza");
		int taza = leer.nextInt();

		if (taza > cafe1.getCantidadActual()) {
			System.out.println("La taza no se llenó.");
			System.out.println("Se sirvió solo " + cafe1.getCantidadActual() + " ml");
			System.out.println("La cafetera está vacía");
			cafe1.setCantidadActual(0);

		} else {
			System.out.println("La taza se ha llenado");
			cafe1.setCantidadActual(cafe1.getCantidadActual()-taza);
			System.out.println("Quedan en la cafetera " + (cafe1.getCantidadActual()) + " ml");
		}

		return cafe1.getCantidadActual();

	}

	public int vaciarCafetera(Cafetera cafe1) {
		cafe1.setCantidadActual(0);
		System.out.println("La cafetera se ha vaciado");
		return cafe1.getCantidadActual();
	}

	public int agregarCafe(Cafetera cafe1) {
		System.out.println("Ingrese cantidad de cafe");
		cafe1.setCantidadActual(leer.nextInt() + cafe1.getCantidadActual());
		System.out.println("Cantidad de café en cafetera: " + cafe1.getCantidadActual());
		return cafe1.getCantidadActual();
	}
}
