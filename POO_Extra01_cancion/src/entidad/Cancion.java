package entidad;

import java.util.Scanner;

public class Cancion {
	private String titulo;
	private String autor;
	public Cancion() {
	}
	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void crearCancion() {
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("Ingrese nombre de la canción");
		this.setTitulo(leer.next());
		System.out.println("Ingrese nombre del autor");
		this.setAutor(leer.next());
		leer.close();
		
	}
	@Override
	public String toString() {
		return "Cancion \n[titulo=" + titulo + ", \nautor=" + autor + "]";
	}

}
