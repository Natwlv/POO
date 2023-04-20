package arreglo;

import arregloService.ArregloService;

public class ArregloApp {

	public static void main(String[] args) {
		
		ArregloService sArreglo = new ArregloService();
		
		double[] arregloA = new double[50];
		double[] arregloB = new double[20];
		sArreglo.inicializarA(arregloA);
		System.out.println("Arreglo A");
		sArreglo.mostrar(arregloA);
		sArreglo.ordenar(arregloA);
		System.out.println("Arreglo A ordenado");
		sArreglo.mostrar(arregloA);
		sArreglo.inicializarB(arregloB, arregloA);
		System.out.println("Arreglo B");
		sArreglo.mostrar(arregloB);

	}

}
