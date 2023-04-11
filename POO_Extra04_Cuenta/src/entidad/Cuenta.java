package entidad;

import java.util.Scanner;

public class Cuenta {

	private double saldo;
	private String titular;

	public Cuenta() {
	}

	public Cuenta(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Cuenta \n[saldo=" + saldo + ", \ntitular=" + titular + "]";
	}

	public void retirarDinero() {
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		boolean extraccion = true;

		this.setSaldo(Math.random() * 10000);
		System.out.println("Ingrese titular de la cuenta");
		this.setTitular(leer.next());
		while (extraccion) {
			System.out.println("Su saldo es : " + (float) this.getSaldo());

			System.out.println("Cuánto dinero desea retirar");
			double retiro = leer.nextDouble();

			if (retiro > this.getSaldo()) {
				System.out.println("No posee cantidad suficiente para esa extracción de dinero");
			} else {
				this.setSaldo(this.getSaldo() - retiro);
				System.out.println("Operación exitosa. Su saldo es: " + (float) this.getSaldo());
			}
			System.out.println("Desea realizar una nueva extracción? S/N");
			String respuesta = leer.next().toLowerCase();
			if (respuesta.equalsIgnoreCase("N")) {
				extraccion = false;
			}
		}
		leer.close();

	}

}
