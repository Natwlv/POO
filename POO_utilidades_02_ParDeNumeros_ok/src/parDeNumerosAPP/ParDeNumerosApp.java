package parDeNumerosAPP;

import parDeNumerosServicio.ParDeNumerosService;

public class ParDeNumerosApp {

	public static void main(String[] args) {
		
		
		ParDeNumerosService sNumeros = new ParDeNumerosService();
		sNumeros.mostrarValores();
		System.out.println("El número mayor es: " + (float)sNumeros.devolverMayor());
		sNumeros.calcularPotencia();
		sNumeros.calculaRaiz();
	}

}
