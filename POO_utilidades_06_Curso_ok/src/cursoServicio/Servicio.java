package cursoServicio;

import java.util.Scanner;

import cursoEntidad.Curso;

public class Servicio {

	Scanner leer = new Scanner(System.in).useDelimiter("\n");

	public void cargarAlumnos(Curso curso) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese nombre del alumno " + (i + 1));
			curso.getAlumnos()[i] = leer.next();
		}
		System.out.println("LISTA DE ALUMNOS:");
		System.out.println("==================");

		for (int i = 0; i < 5; i++) {
			System.out.println("Alumno " + (i + 1) + ": [" + curso.getAlumnos()[i] + "] ");

		}

	}

	public Curso crearCurso() {
		Curso curso = new Curso();

		cargarAlumnos(curso);
		System.out.println("Ingrese nombre del curso");
		curso.setNombreCurso(leer.next());
		System.out.println("Ingrese turno del curso");
		curso.setTurno(leer.next());
		System.out.println("Ingrese precio por hora");
		curso.setPrecioPorHora(leer.nextInt());
		System.out.println("Ingrese cantidad de horas por día");
		curso.setCantidadHorasPorDia(leer.nextInt());
		System.out.println("Ingrese cantidad de días por semana");
		curso.setCantidadDiasPorSemana(leer.nextInt());

		return curso;

	}

	public void calcularGananciaSemanal(Curso curso) {
		int ganancia = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length
				* curso.getCantidadDiasPorSemana();

		System.out.println("La ganacia semanal del curso es $" + ganancia);

	}

	
}
