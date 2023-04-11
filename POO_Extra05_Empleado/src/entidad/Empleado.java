package entidad;

import java.util.Scanner;

public class Empleado {

	private String nombre;
	private int edad;
	private double salario;

	public Empleado() {
	}

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void calcularAumento() {
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese nombre");
		this.setNombre(leer.next());
		System.out.println("Ingrese edad");
		this.setEdad(leer.nextInt());
		System.out.println("Ingrese salario");
		this.setSalario(leer.nextDouble());

		if (this.getEdad() > 30) {
			System.out.println("Le corresponde un 10% de aumento");
			double saldoactualizado = (this.getSalario() * 0.10) + this.getSalario();
			System.out.println("Su salario actualizado es $" + saldoactualizado);
		} else {
			System.out.println("Le corresponde un 5% de aumento");
			double saldoactualizado = (this.getSalario() * 0.05) + this.getSalario();
			System.out.println("Su salario actualizado es $" + saldoactualizado);

		}

		leer.close();

	}

}
