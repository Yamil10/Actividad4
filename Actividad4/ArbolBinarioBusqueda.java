package Actividad4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArbolBinarioBusqueda {
    Nodo raiz;
    private PrintWriter logWriter;

    public ArbolBinarioBusqueda(String logFile) throws IOException {
        raiz = null;
        logWriter = new PrintWriter(new FileWriter(logFile, true));
    }

    // Insertar un nombre
    public void insertar(String nombre) {
        raiz = insertarRec(raiz, nombre);
        log("Insertado: " + nombre+" el 9/09/2025");
    }

    private Nodo insertarRec(Nodo raiz, String nombre) {
        if (raiz == null) {
            return new Nodo(nombre);
        }
        int clave = generarClave(nombre);

        if (clave < raiz.clave)
            raiz.izquierda = insertarRec(raiz.izquierda, nombre);
        else if (clave > raiz.clave)
            raiz.derecha = insertarRec(raiz.derecha, nombre);

        return raiz;
    }

    // Buscar un nombre
    public boolean buscar(String nombre) {
        boolean encontrado = buscarRec(raiz, nombre);
        log("Búsqueda de " + nombre + ": " + (encontrado ? "ENCONTRADO" : "NO ENCONTRADO"));
        return encontrado;
    }

    private boolean buscarRec(Nodo raiz, String nombre) {
        if (raiz == null) return false;

        int clave = generarClave(nombre);

        if (raiz.clave == clave && raiz.nombre.equals(nombre)) return true;
        return clave < raiz.clave ?
                buscarRec(raiz.izquierda, nombre) :
                buscarRec(raiz.derecha, nombre);
    }

    // Generar clave ASCII
    private int generarClave(String nombre) {
        int suma = 0;
        for (char c : nombre.toCharArray()) {
            suma += (int) c;
        }
        return suma;
    }

    // Log
    private void log(String mensaje) {
        logWriter.println(mensaje);
        logWriter.flush();
    }

    public void cerrarLog() {
        if (logWriter != null) logWriter.close();
    }
}
