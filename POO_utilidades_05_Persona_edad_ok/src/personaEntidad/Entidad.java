package personaEntidad;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entidad {


	private String nombre;
	private Date fechaNacimiento;
	private int edad;

	
	public Entidad() {
		
	}
	
	public Entidad(String nombre, Date fechaNacimiento) {
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		String fechaFormat = sdf.format(fechaNacimiento);

		return "Entidad \n[nombre= " + nombre + " \nfechaNacimiento= " + fechaFormat + "]";
	}
	
	
}
