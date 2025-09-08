package Actividad4;

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar nodo de forma recursiva
    public void agregarNodo(int d, String nom, String job) {
        raiz = insertarRecursivo(raiz, d, nom, job);
    }

    private Nodo insertarRecursivo(Nodo actual, int d, String nom, String job) {
        if (actual == null) {
            return new Nodo(d, nom, job);
        }
        if (d < actual.dato) {
            actual.hijoizquierdo = insertarRecursivo(actual.hijoizquierdo, d, nom, job);
        } else {
            actual.hijoderecho = insertarRecursivo(actual.hijoderecho, d, nom, job);
        }
        return actual;
    }

    // Verificar si el árbol está vacío
    public boolean estaVacio() {
        return raiz == null;
    }

    // Recorrer inorden (ya recursivo)
    public void inorden(Nodo r) {
        if (r != null) {
            inorden(r.hijoizquierdo);
            System.out.println(r);
            inorden(r.hijoderecho);
        }
    }

    // Buscar nodo de forma recursiva
    public Nodo buscarNodo(int d) {
        return buscarRecursivo(raiz, d);
    }

    private Nodo buscarRecursivo(Nodo actual, int d) {
        if (actual == null) {
            return null;
        }
        if (d == actual.dato) {
            return actual;
        }
        if (d < actual.dato) {
            return buscarRecursivo(actual.hijoizquierdo, d);
        } else {
            return buscarRecursivo(actual.hijoderecho, d);
        }
    }
}
