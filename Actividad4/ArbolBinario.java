package Actividad4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {
    private NodoEmpleado raiz;
    private PrintWriter logWriter;

    public ArbolBinario() {
        raiz = null;
        logWriter = null;
    }

    public ArbolBinario(String logFile) throws IOException {
        raiz = null;
        logWriter = new PrintWriter(new FileWriter(logFile, true));
    }

    private void log(String msg) {
        System.out.println(msg);
        if (logWriter != null) {
            logWriter.println(msg);
            logWriter.flush();
        }
    }

    public void cerrarLog() {
        if (logWriter != null) logWriter.close();
    }

    /* ---------------- Inserción ---------------- */
    public void insertar(int id, String nombre) {
        log("[INSERT] ID=" + id + " Nombre=" + nombre);
        raiz = insertarRec(raiz, id, nombre);
    }

    private NodoEmpleado insertarRec(NodoEmpleado nodo, int id, String nombre) {
        if (nodo == null) {
            return new NodoEmpleado(id, nombre);
        }
        if (id < nodo.id) nodo.izquierda = insertarRec(nodo.izquierda, id, nombre);
        else if (id > nodo.id) nodo.derecha = insertarRec(nodo.derecha, id, nombre);
        else log("[INSERT] ID duplicado: " + id + " — no se inserta.");
        return nodo;
    }

    /* ---------------- Búsqueda ---------------- */
    public NodoEmpleado buscar(int id) {
        NodoEmpleado r = buscarRec(raiz, id);
        log("[SEARCH] ID=" + id + " -> " + (r == null ? "NO ENCONTRADO" : r));
        return r;
    }

    private NodoEmpleado buscarRec(NodoEmpleado nodo, int id) {
        if (nodo == null) return null;
        if (id == nodo.id) return nodo;
        if (id < nodo.id) return buscarRec(nodo.izquierda, id);
        return buscarRec(nodo.derecha, id);
    }

    /* ---------------- Eliminación ---------------- */
    public void eliminar(int id) {
        raiz = eliminarRec(raiz, id);
    }

    private NodoEmpleado eliminarRec(NodoEmpleado nodo, int id) {
        if (nodo == null) return null;
        if (id < nodo.id) nodo.izquierda = eliminarRec(nodo.izquierda, id);
        else if (id > nodo.id) nodo.derecha = eliminarRec(nodo.derecha, id);
        else {
            if (nodo.izquierda == null) return nodo.derecha;
            if (nodo.derecha == null) return nodo.izquierda;
            NodoEmpleado sucesor = obtenerMin(nodo.derecha);
            nodo.id = sucesor.id;
            nodo.nombre = sucesor.nombre;
            nodo.derecha = eliminarRec(nodo.derecha, sucesor.id);
        }
        return nodo;
    }

    private NodoEmpleado obtenerMin(NodoEmpleado nodo) {
        while (nodo.izquierda != null) nodo = nodo.izquierda;
        return nodo;
    }

    /* ---------------- Recorridos ---------------- */
    public List<NodoEmpleado> recorridoInorden() {
        List<NodoEmpleado> res = new ArrayList<>();
        inordenRec(raiz, res);
        return res;
    }

    private void inordenRec(NodoEmpleado nodo, List<NodoEmpleado> res) {
        if (nodo == null) return;
        inordenRec(nodo.izquierda, res);
        res.add(nodo);
        inordenRec(nodo.derecha, res);
    }

    public List<NodoEmpleado> recorridoPreorden() {
        List<NodoEmpleado> res = new ArrayList<>();
        preordenRec(raiz, res);
        return res;
    }

    private void preordenRec(NodoEmpleado nodo, List<NodoEmpleado> res) {
        if (nodo == null) return;
        res.add(nodo);
        preordenRec(nodo.izquierda, res);
        preordenRec(nodo.derecha, res);
    }

    public List<NodoEmpleado> recorridoPostorden() {
        List<NodoEmpleado> res = new ArrayList<>();
        postordenRec(raiz, res);
        return res;
    }

    private void postordenRec(NodoEmpleado nodo, List<NodoEmpleado> res) {
        if (nodo == null) return;
        postordenRec(nodo.izquierda, res);
        postordenRec(nodo.derecha, res);
        res.add(nodo);
    }

    /* ---------------- Utilidades ---------------- */
    public void imprimirLista(List<NodoEmpleado> lista) {
        for (NodoEmpleado n : lista) {
            System.out.println(n);
        }
    }
}
