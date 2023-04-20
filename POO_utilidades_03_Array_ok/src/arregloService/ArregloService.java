package arregloService;

import java.util.Arrays;

public class ArregloService {

	public void inicializarA(double[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Math.random() * 9;
		}
		System.out.println("");

	}

	public void mostrar(double[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("[" + (float) arreglo[i] + "] ");
		}
		System.out.println("");
	}

	public void ordenar(double[] arreglo) {
		Arrays.sort(arreglo);
		System.out.println("");

	}

	public void inicializarB(double[] arregloB, double[] arregloA) {
		for (int i = 0; i < 10; i++) {
			arregloB[i] = arregloA[i];
		}
		for (int i = 10; i < arregloB.length; i++) {
			arregloB[i] = 0.5;
		}
		System.out.println("");

	}
}
