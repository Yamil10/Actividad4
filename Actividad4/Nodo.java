package Actividad4;

class Nodo {
    int clave;       // Clave (ASCII o hash del nombre)
    String nombre;   // Nombre original
    Nodo izquierda, derecha;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.clave = generarClave(nombre); // convertir a número
        izquierda = derecha = null;
    }

    // 🔹 Función para convertir un nombre a clave (ASCII simple)
    private int generarClave(String nombre) {
        int suma = 0;
        for (char c : nombre.toCharArray()) {
            suma += (int) c;  // suma valores ASCII
        }
        return suma;
        // 🔸 Si prefieres hash, usa: return nombre.hashCode();
    }
}
