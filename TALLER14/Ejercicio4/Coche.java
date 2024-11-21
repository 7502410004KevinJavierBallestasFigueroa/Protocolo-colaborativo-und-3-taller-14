package Ejercicio4;

public class Coche extends Vehiculo {
    public String marca;
    public String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        System.out.println("El coche "+marca+" "+modelo+ " se mueve a 130 km/h.");
    }
}

