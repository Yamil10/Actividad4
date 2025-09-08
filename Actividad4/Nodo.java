package Actividad4;

public class Nodo {
    int dato;
    String nombre;
    String trabajo;
    Nodo hijoizquierdo, hijoderecho;

    public Nodo(int d, String nom, String job) {
        this.dato = d;
        this.nombre = nom;
        this.trabajo = job;
        this.hijoizquierdo = null;
        this.hijoderecho = null;
    }

    @Override
    public String toString() {
        return "ID: " + dato + " | Nombre: " + nombre + " | Trabajo: " + trabajo;
    }
}
