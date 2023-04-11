package main;

import entidad.Libro;

public class MainLibro {

	public static void main(String[] args) {
		Libro l1 = new Libro();
        l1.llenado();
        System.out.println(l1.toString());

	}

}
