package entidad;

public class RectanguloEntidad {

	private int base;
	private int altura;
	
	
	
	public RectanguloEntidad() {
		
	}
	
	public RectanguloEntidad(int base, int altura) {
		this.base =base;
		this.altura = altura;
		
	}

	public void setbase(int base) {
		this.base = base;
	}
	
	public int getbase() {
		return base;
		
	}
	
	public void setaltura(int altura) {
		this.altura = altura;
	}
	
	public int getaltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "RectanguloEntidad [base=" + base + ", altura=" + altura + "]";
	}
	
	
}
