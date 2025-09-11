package Actividad4;

public class NodoEmpleado {
    Empleado empleado;
    NodoEmpleado izquierda, derecha;

    public NodoEmpleado(Empleado empleado) {
        this.empleado = empleado;
        this.izquierda = null;
        this.derecha = null;
    }
}
