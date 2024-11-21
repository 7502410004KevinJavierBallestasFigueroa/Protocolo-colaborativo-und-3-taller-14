package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona estudiante1 = new Estudiante("Alberto");
        Persona profesor1 = new Profesor("Andrea");

        persona1.presentarse();
        estudiante1.presentarse();
        profesor1.presentarse();
    }
}

