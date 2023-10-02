package co.edu.uniquindio.prestamouq.model;

public class Objeto {
    private String nombre;

    public Objeto() {
    }

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + "'}";
    }
}


