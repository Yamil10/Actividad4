package Actividad4;

public class NodoEmpleado {
    int id;
    String nombre;
    NodoEmpleado izquierda, derecha;

    public NodoEmpleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izquierda = null;
        this.derecha = null;
    }

    @Override
    public String toString() {
        return "ID:" + id + " Nombre:" + nombre;
    }
}
