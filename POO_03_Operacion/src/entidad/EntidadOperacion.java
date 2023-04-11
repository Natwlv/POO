package entidad;

public class EntidadOperacion {
	
	private int num1;
	private int num2;
	
	//constructores
	public EntidadOperacion() {

	}
	public EntidadOperacion(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	

	
	//get & set. Get encapsula los datos
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum1() {
		return num1;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum2() {
		return num2;
	}




	@Override
	public String toString() {
		return "EntidadOperacion [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
	

}
