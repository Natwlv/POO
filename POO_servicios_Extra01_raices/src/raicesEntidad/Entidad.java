package raicesEntidad;

public class Entidad {
	private int a = 2;
	private int b = 3;
	private int c = 1;
	
	
	public Entidad() {
	}
	public Entidad(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Entidad \n[a=" + a + ", \nb=" + b + ", \nc=" + c + "]";
	}
		


}
