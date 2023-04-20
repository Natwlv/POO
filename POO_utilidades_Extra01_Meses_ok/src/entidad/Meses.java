package entidad;

import java.util.Random;

public class Meses {
	private  String[] meses = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
			"agosto", "septiembre", "octubre", "noviembre", "diciembre" };
	private String mesSecreto;

	public Meses() {
		int index = new Random().nextInt(meses.length);
		this.mesSecreto = meses[index];

	}

	public Meses(String mesSecreto) {
		this.mesSecreto = mesSecreto;
	}

	public String getMesSecreto() {
		return mesSecreto;
	}

	public void setMesSecreto(String mesSecreto) {
		this.mesSecreto = mesSecreto;
	}

	public String[] getMeses() {
		return meses;
	}

}