package libro.entidades;


public class libroEntidades {
	private String titulo;
	private Integer isbn;
	private String autor;
	private int paginas;

		
	
	//constructor por defecto - vacío
	
	public libroEntidades() {
		
	}

	
	//constructor con todos los parámetros

	public libroEntidades(String titulo, Integer isbn, String autor, int paginas) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.paginas = paginas;
	}

	//get & set
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Integer getIsbn() {
		return isbn;
	}


	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getPaginas() {
		return paginas;
	}


	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	
	
	
	
	
		//toString

	@Override
	public String toString() {
		return "libroEntidades [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", paginas=" + paginas
				+ "]";
	}
	

	
	
	
}
