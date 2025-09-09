package Actividad4;

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinarioBusqueda arbol = null;
        try {
            arbol = new ArbolBinarioBusqueda("arbol_log.txt");
            int opcion, valor;
            do {
                System.out.println("\nMenú Árbol Binario de Búsqueda");
                System.out.println("1) Insertar valor");
                System.out.println("2) Buscar valor");
                System.out.println("3) Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el valor a insertar: ");
                        valor = sc.nextInt();
                        arbol.insertar(valor);
                        System.out.println("Valor insertado.");
                        break;
                    case 2:
                        System.out.print("Ingresa el valor a buscar: ");
                        valor = sc.nextInt();
                        boolean encontrado = arbol.buscar(valor);
                        if (encontrado) {
                            System.out.println("Valor encontrado en el árbol.");
                        } else {
                            System.out.println("Valor NO encontrado en el árbol.");
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
            if (arbol != null) {
                arbol.cerrarLog();
            }
            sc.close();
        }
    }
}