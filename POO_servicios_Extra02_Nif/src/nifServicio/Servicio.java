package nifServicio;

import java.util.Scanner;

import nifEntidad.Entidad;

public class Servicio {
	static Scanner leer = new Scanner(System.in).useDelimiter("\n");
	Entidad nif = new Entidad();
	
	public void crearNif() {
		System.out.println("Ingrese DNI");
		nif.setDni(leer.nextLong());
		
		
		int resto = (int) nif.getDni() % 23;
		System.out.println(resto);
		String [] array = {"T","R","W","A","G","M", "Y", "F", "P", "D", "X", "B", "N", "J","Z","S","Q","V","H", "L", "C","K", "E"};
		nif.setDigito(array[resto]); 
		}
	
	public void mostrar() {
		
		System.out.println("NIF:");
		System.out.println(nif.getDni()+"-"+ nif.getDigito());
	}
	
}
