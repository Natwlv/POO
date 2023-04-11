package circunsferencia.entidades;

public class circunsferenciaEntidades {
	
	private double radio;

	public circunsferenciaEntidades() {
	}

		
	public circunsferenciaEntidades(double radio) {
		this.radio = radio;
		
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

		

	@Override
	public String toString() {
		return "circunsferenciaEntidades [radio=" + radio + "]";
	}


}
