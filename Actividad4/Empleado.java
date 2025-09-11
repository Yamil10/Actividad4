package Actividad4;

public class Empleado {
    int id;
    String nombre;
    String puesto;

    public Empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "[" + id + " - " + nombre + " - " + puesto + "]";
    }
}
