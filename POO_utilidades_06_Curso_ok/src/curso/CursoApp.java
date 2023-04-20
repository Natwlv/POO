package curso;

import cursoEntidad.Curso;
import cursoServicio.Servicio;

public class CursoApp {

	public static void main(String[] args) {
		
		Servicio serv = new Servicio();
		Curso per = serv.crearCurso();
		serv.calcularGananciaSemanal(per);
	}

}
