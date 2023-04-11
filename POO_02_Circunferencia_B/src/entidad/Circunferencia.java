package entidad;

import java.util.Scanner;

public class Circunferencia {
	
	private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        Scanner leer =new Scanner(System.in);
        this.setRadio(leer.nextDouble());
        leer.close();
       
    }
    public void area(){
        double area= Math.PI*Math.pow(radio,2);
        System.out.println("El area es: " + area);

    }
    
    

    public void perimetro() {
        double perimetro= 2*Math.PI*radio;
        System.out.println("El perimetro es: " + perimetro);
            }

}
