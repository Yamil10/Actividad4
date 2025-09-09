package Actividad4;

class Nodo {
    int clave;     
    String nombre; 
    Nodo izquierda, derecha;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.clave = generarClave(nombre); 
        izquierda = derecha = null;
    }

    private int generarClave(String nombre) {
        int suma = 0;
        for (char c : nombre.toCharArray()) {
            suma += (int) c;  // suma valores ASCII
        }
        return suma;
    }
}
