package persona;

import personaEntidad.Entidad;
import personaServicio.Servicio;

public class Persona {

	public static void main(String[] args) {
		double[] promImc = new double[4];
		boolean[] promEdad = new boolean[4];
		Entidad[] personas = new Entidad[4];

		Servicio sv = new Servicio();

		for (int i = 0; i < personas.length; i++) {
			personas[i] = sv.crearPersona();
			promImc[i] = sv.calcularIMC(personas[i]);
			promEdad[i] = sv.esMayorDeEdad(personas[i]);
		}

		double prom1 = 0, prom2 = 0, prom3 = 0, prom4 = 0, prom5 = 0;

		for (int i = 0; i < promEdad.length; i++) {
			if (promImc[i] == -1) {
				prom1++;

			} else if (promImc[i] == 0) {
				prom2++;

			} else if (promImc[i] == 1) {
				prom3++;
			}
			if (promEdad[i]) {
				prom4++;
			} else if (!promEdad[i]) {
				prom5++;
			}

		}
		System.out.println("El " + (int) (prom1 / promImc.length * 100) + "% están por debajo de su peso ideal");
		System.out.println("El " + (int) (prom2 / promImc.length * 100) + "% están en su peso ideal");
		System.out.println("El " + (int) (prom3 / promImc.length * 100) + "% están por encima de su peso ideal");
		System.out.println("El " + (int) (prom4 / promEdad.length * 100) + "% son mayores de edad");
		System.out.println("El " + (int) (prom5 / promEdad.length * 100) + "% son menores de edad");

	}

}
