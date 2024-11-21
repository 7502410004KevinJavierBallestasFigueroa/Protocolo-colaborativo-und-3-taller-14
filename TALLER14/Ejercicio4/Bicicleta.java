package Ejercicio4;

public class Bicicleta extends Vehiculo {
    public String marca;
    public String color;

    public Bicicleta(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta "+marca+" "+color+ " va a 15 km/h.");
    }
}
