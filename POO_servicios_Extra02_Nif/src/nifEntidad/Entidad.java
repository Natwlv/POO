package nifEntidad;

public class Entidad {
	
	
	private long dni;
	private String letra;
	private String digito;
	
	public Entidad() {
		
	}


	public Entidad(long dni, String letra) {
		this.dni = dni;
		this.letra = letra;
	}


	public long getDni() {
		return dni;
	}


	public String getDigito() {
		return digito;
	}


	public void setDigito(String digito) {
		this.digito = digito;
	}


	public void setDni(long dni) {
		this.dni = dni;
	}


	public String getLetra() {
		return letra;
	}


	public void setLetra(String letra) {
		this.letra = letra;
	}
	

}
