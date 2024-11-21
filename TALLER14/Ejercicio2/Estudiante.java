package Ejercicio2;

public class Estudiante extends Persona {

    public Estudiante(String nombre){
        super(nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante y me llamo "+nombre);
    }
}

