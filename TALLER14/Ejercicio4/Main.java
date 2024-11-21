package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo coche1 = new Coche("Renault", "Sandero 2018");
        Vehiculo bicicleta1 = new Bicicleta("Bikers","Blanca");

        vehiculo1.mover();
        coche1.mover();
        bicicleta1.mover();
    }
}

