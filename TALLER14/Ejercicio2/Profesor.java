package Ejercicio2;

public class Profesor extends Persona {

    public Profesor(String nombre){
        super(nombre);
    }
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor y me llamo "+nombre);
    }
}
