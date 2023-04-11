package entidad;

public class Entidad {
	
	private int numeroCuenta;
	private long dni;
	private double saldoActual;
	
	
	public Entidad() {
		
	}
	
	public Entidad( int numeroCuenta, long dni, double saldoActual) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldoActual = saldoActual;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public long getDni() {
		return dni;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	@Override
	public String toString() {
		return "entidadCuenta [numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + "]";
	}

	

}
