package servicio;

import java.util.Scanner;

import entidad.RectanguloEntidad;

public class rectanguloServicio {
	
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	
	RectanguloEntidad objt1 = new RectanguloEntidad();
	
	
	public RectanguloEntidad crearRectangulo() {
		System.out.println("Ingrese el valor de la base en cm");
		objt1.setbase(leer.nextInt());
		System.out.println("Ingrese el valor de la altura cm");
		objt1.setaltura(leer.nextInt());
		
		
		return new RectanguloEntidad(objt1.getbase(), objt1.getaltura());
	}
	
	public void superficie() {
		int superficie = objt1.getbase() * objt1.getaltura();
		System.out.println("La superficie del rectángulo es de " + superficie + " cm ");

	}
	
	public void perimetro() {
		int perimetro = (objt1.getbase() + objt1.getaltura()) * 2;
		System.out.println("El perímetro del rectángulo es de " + perimetro + " cm ");

	}
	
	public void dibujarAsteriscos() {
	     for (int i = 0; i < objt1.getbase(); i++) {
	        	
	            for (int j = 0; j < objt1.getaltura(); j++) {
	            	
	                if (i == 0 || j == 0 || j == objt1.getaltura() - 1 || i == objt1.getbase() - 1) {
	                	
	                    System.out.print(" *");
	                    
	                } else {
	                	
	                    System.out.print("  ");
	                }
	                
	            }
	            System.out.println();
	        }
	}
}
