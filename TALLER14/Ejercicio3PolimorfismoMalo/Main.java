package Ejercicio3PolimorfismoMalo;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche1 = new Coche();
        coche1.moverse();
        coche1.sonarPito();  // Esto dará error de compilación.
    }
}
