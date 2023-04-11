package libro.servicios;

import java.util.Scanner;

import libro.entidades.libroEntidades;

public class libroServicios {
	 Scanner leer = new Scanner(System.in).useDelimiter("\n");

	 
	 public libroEntidades datosLibros() {
		 
		 //instancio el objeto
		 
		 libroEntidades libro1 = new libroEntidades();
		 
		 //pido datos para llenar los atributos
		 
		 System.out.println("Ingrese el título del libro");
		 libro1.setTitulo(leer.next());
		 
		 System.out.println("Ingrese el ISBN");
		 libro1.setIsbn(leer.nextInt());
		 
		 System.out.println("Ingrese el nombre del autor");
		 libro1.setAutor(leer.next());
		 
		 System.out.println("Ingrese cantidad de páginas del libro");
		 libro1.setPaginas(leer.nextInt());;
	
		 return libro1;
		 
	 }

}
