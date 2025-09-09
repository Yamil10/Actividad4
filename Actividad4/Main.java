package Actividad4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinarioBusqueda arbol = null;
        try {
            arbol = new ArbolBinarioBusqueda("arbol_log.txt");
            int opcion;
            String nombre;
            do {
                System.out.println("\nMenú Árbol Binario de Búsqueda");
                System.out.println("1) Insertar nombre");
                System.out.println("2) Buscar nombre");
                System.out.println("3) Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el nombre a insertar: ");
                        nombre = sc.nextLine();
                        arbol.insertar(nombre);
                        System.out.println("Nombre insertado");
                        break;
                    case 2:
                        System.out.print("Ingresa el nombre a buscar: ");
                        nombre = sc.nextLine();
                        boolean encontrado = arbol.buscar(nombre);
                        if (encontrado) {
                            System.out.println(nombre + " está en el árbol.");
                        } else {
                            System.out.println(nombre + " NO está en el árbol.");
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } while (opcion != 3);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de log: " + e.getMessage());
        } finally {
            if (arbol != null) arbol.cerrarLog();
            sc.close();
        }
    }
}
