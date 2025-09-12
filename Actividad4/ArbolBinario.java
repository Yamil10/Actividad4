package Actividad4;

public class ArbolBinario {
    private NodoEmpleado raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(Empleado empleado) {
        raiz = insertarRec(raiz, empleado);
    }

    private NodoEmpleado insertarRec(NodoEmpleado nodo, Empleado empleado) {
        if (nodo == null) return new NodoEmpleado(empleado);

        if (empleado.id < nodo.empleado.id) {
            nodo.izquierda = insertarRec(nodo.izquierda, empleado);
        } else if (empleado.id > nodo.empleado.id) {
            nodo.derecha = insertarRec(nodo.derecha, empleado);
        }
        return nodo;
    }

    public Empleado buscar(int id) {
        return buscarRec(raiz, id);
    }

    private Empleado buscarRec(NodoEmpleado nodo, int id) {
        if (nodo == null) return null;
        if (id == nodo.empleado.id) return nodo.empleado;
        return id < nodo.empleado.id
                ? buscarRec(nodo.izquierda, id)
                : buscarRec(nodo.derecha, id);
    }

    public boolean eliminar(int id) {
        if (buscar(id) == null) {
            return false; // No existe
        }
        raiz = eliminarRec(raiz, id);
        return true;
    }

    private NodoEmpleado eliminarRec(NodoEmpleado nodo, int id) {
        if (nodo == null) return null;

        if (id < nodo.empleado.id) {
            nodo.izquierda = eliminarRec(nodo.izquierda, id);
        } else if (id > nodo.empleado.id) {
            nodo.derecha = eliminarRec(nodo.derecha, id);
        } else {
            if (nodo.izquierda == null) return nodo.derecha;
            if (nodo.derecha == null) return nodo.izquierda;

            NodoEmpleado sucesor = obtenerMin(nodo.derecha);
            nodo.empleado = sucesor.empleado;
            nodo.derecha = eliminarRec(nodo.derecha, sucesor.empleado.id);
        }
        return nodo;
    }

    private NodoEmpleado obtenerMin(NodoEmpleado nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    public void inorden() {
        System.out.print("Recorrido Inorden: ");
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(NodoEmpleado nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierda);
            System.out.print(nodo.empleado + " ");
            inordenRec(nodo.derecha);
        }
    }

    public void preorden() {
        System.out.print("Recorrido Preorden: ");
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(NodoEmpleado nodo) {
        if (nodo != null) {
            System.out.print(nodo.empleado + " ");
            preordenRec(nodo.izquierda);
            preordenRec(nodo.derecha);
        }
    }

    public void postorden() {
        System.out.print("Recorrido Postorden: ");
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(NodoEmpleado nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierda);
            postordenRec(nodo.derecha);
            System.out.print(nodo.empleado + " ");
        }
    }
}
