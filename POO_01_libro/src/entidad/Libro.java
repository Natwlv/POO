package entidad;

import java.util.Scanner;

public class Libro {

	public String ISBN;
	public String titulo;
	public String autor;
	public int numeroPaginas;

	public Libro() {

	}

	public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
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

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public void llenado() {

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese Autor");
		this.setAutor(leer.next());
		System.out.println("ISBN");
		this.setISBN(leer.next());
		System.out.println("Titulo:");
		this.setTitulo(leer.next());
		System.out.println("Paginas:");
		this.setNumeroPaginas(leer.nextInt());
		leer.close();

	}

	@Override
	public String toString() {
		return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + titulo + ", Autor=" + autor + ", N\u00fameroP\u00e1ginas="
				+ numeroPaginas + '}';
	}

}
