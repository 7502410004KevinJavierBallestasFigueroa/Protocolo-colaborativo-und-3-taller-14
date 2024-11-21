package Ejercicio1;

public class Figura {
    private String unidades;

    public Figura(String unidades) {
        this.unidades = unidades;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public double calcularArea() {
        return 0;
    }

    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea() + getUnidades());
    }
}
