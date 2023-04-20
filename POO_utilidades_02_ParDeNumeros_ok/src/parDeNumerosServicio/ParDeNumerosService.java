package parDeNumerosServicio;

import parDeNumeros.ParDeNumeros;

public class ParDeNumerosService {

	ParDeNumeros numeros = new ParDeNumeros();

	public void mostrarValores() {
		System.out.println("Número 1: " + (float) numeros.getNum1());
		System.out.println("Número 2: " + (float) numeros.getNum2());
	}


	public double devolverMayor() {
		double num = Math.max(numeros.getNum1(), numeros.getNum2());
		return num;
	}

	public void calcularPotencia() {
		double potencia = Math.pow(Math.abs(Math.max(numeros.getNum1(), numeros.getNum2())),
				Math.abs(Math.min(numeros.getNum1(), numeros.getNum2())));
		System.out.println("La potencia del mayor valor elevado al menor número es: " + (float)potencia);
	}

	public void calculaRaiz() {
		double numMenor = Math.abs(Math.min(numeros.getNum1(), numeros.getNum2()));
		double raiz = Math.sqrt(numMenor);
		System.out.println("la raíz cuadrada del menor de los dos valores es " + (float)raiz);
	}

}
