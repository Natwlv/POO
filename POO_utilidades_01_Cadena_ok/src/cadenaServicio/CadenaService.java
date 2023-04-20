package cadenaServicio;

import java.util.Scanner;

import cadenaEntidad.Cadena;

public class CadenaService {

	static Scanner leer = new Scanner(System.in).useDelimiter("\n");
	Cadena frase = new Cadena();

	public Cadena crearFrase() {

		System.out.println("Ingrese una frase");
		frase.setFrase(leer.next());
		frase.setLongitud(frase.getFrase().length());
		System.out.println("Longitud de la frase ingresada: " + frase.getLongitud());

		return new Cadena(frase.getFrase(), frase.getLongitud());
	}

	public void mostrarVocales() {
		int vocales = 0;
		for (int i = 0; i < frase.getLongitud(); i++) {
			if ((frase.getFrase().charAt(i) == 'a') || (frase.getFrase().charAt(i) == 'e')
					|| (frase.getFrase().charAt(i) == 'i') || (frase.getFrase().charAt(i) == 'o')
					|| (frase.getFrase().charAt(i) == 'u')) {
				vocales++;
			}
		}
		System.out.println("La frase  [" + frase.getFrase() + "] contiene " + vocales + " vocales");
	}

	public void invertirFrase() {
		String invertida = "";

		for (int i = frase.getLongitud() - 1; i >= 0; i--) { // Recorro la frase original del final al inicio
			invertida += frase.getFrase().charAt(i); // concateno cada carácter a la frase invertida
		}
		
		System.out.println("Cadena original: " + frase.getFrase());
		System.out.println("Cadena invertida: " + invertida);
	}

	public void vecesRepetido() {
		System.out.println("Ingrese un caracter a buscar");
		String letra = leer.next();
		int posicion;
		int contLetra = 0;
		
		posicion = frase.getFrase().indexOf(letra);// se busca la primera vez que aparece
		while (posicion != -1) { // mientras se encuentre el caracter
			contLetra++; // se cuenta			
			posicion = frase.getFrase().indexOf(letra, posicion + 1); // se sigue buscando a partir de la posición siguiente a la encontrada
		}
		System.out.println("El caracter [" + letra + "] se repite " + contLetra + " veces");

	}

	public void compararLongitud() {

		System.out.println("Ingrese una nueva frase a comparar");
		String nuevaFrase = leer.next();
		int comparacion = nuevaFrase.compareTo(frase.getFrase());
		
		if (comparacion == 0) {
			System.out.println("La frase original y la frase ingresada tienen la misma cantidad de caracteres");
			System.out.println("Longitud frase original: " + frase.getLongitud());
			System.out.println("Longitud frase nueva: " + nuevaFrase.length());
		} else if (comparacion < 0) {
			System.out.println("La frase ingresada tiene más caracteres que la frase original");
			System.out.println("Longitud frase original: " + frase.getLongitud());
			System.out.println("Longitud frase nueva: " + nuevaFrase.length());
		} else {
			System.out.println("La frase original tiene más caracteres que la nueva frase ingresada");
			System.out.println("Longitud frase original: " + frase.getLongitud());
			System.out.println("Longitud frase nueva: " + nuevaFrase.length());
		}
	}

	public void unirFrases() {
		System.out.println("Ingrese una nueva frase a unir");
		String nuevaFrase = " " + leer.next();
		System.out.println("Frase unida:");
		System.out.println(frase.getFrase().concat(nuevaFrase));
	}

	public void reemplazar() {
		System.out.println("Ingrese caracter que reemplazará la letra a");
		String letra = leer.next();
		String fraseResultante = frase.getFrase().replaceAll("a", letra);
		System.out.println("La frase resultante es: " + fraseResultante);
	}

	public boolean contiene() {
		//boolean tiene = false;
		System.out.println("Ingrese una letra a buscar");
		String letra = leer.next();
		boolean tiene = true;
		
		System.out.println(frase.getFrase().contains(letra));		
		
		
		return tiene;
	}
	
	/*   public void contiene2() {
	        System.out.println("Escriba la letra que desea saber si se encuentra en la frase");
	        String letra = leer.next();
	        System.out.println(frase.getFrase().contains(letra));
	    }
*/
}
