package ahorcadoEntidad;

public class Ahorcado {

	private char[] palabra;
	private int letrasEncontradas;
	private int oportunidadesMaximas;
	private int oportunidadesRestantes;

	public Ahorcado() {
	}

	public Ahorcado(char[] palabra, int letrasEncontradas, int oportunidadesMaximas, int oportunidadesRestantes) {
		this.palabra = palabra;
		this.letrasEncontradas = letrasEncontradas;
		this.oportunidadesMaximas = oportunidadesMaximas;
		this.oportunidadesRestantes = oportunidadesRestantes;
	}

	public char[] getPalabra() {
		return palabra;
	}

	public void setPalabra(char[] palabra) {
		this.palabra = palabra;
	}

	public int getLetrasEncontradas() {
		return letrasEncontradas;
	}

	public void setLetrasEncontradas(int letrasEncontradas) {
		this.letrasEncontradas = letrasEncontradas;
	}

	public int getOportunidadesMaximas() {
		return oportunidadesMaximas;
	}

	public void setOportunidadesMaximas(int oportunidadesMaximas) {
		this.oportunidadesMaximas = oportunidadesMaximas;
	}

	public int getOportunidadesRestantes() {
		return oportunidadesRestantes;
	}

	public void setOportunidadesRestantes(int oportunidadesRestantes) {
		this.oportunidadesRestantes = oportunidadesRestantes;
	}

}
