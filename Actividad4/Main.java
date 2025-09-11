package Actividad4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol;
        try {
            arbol = new ArbolBinario("log_empleados.txt");
        } catch (IOException e) {
            System.out.println("No se pudo abrir archivo de log, se usará solo consola.");
            arbol = new ArbolBinario();
        }

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ GESTIÓN DE EMPLEADOS =====");
            System.out.println("1) Insertar empleado");
            System.out.println("2) Buscar empleado");
            System.out.println("3) Eliminar empleado");
            System.out.println("4) Mostrar recorrido Inorden");
            System.out.println("5) Mostrar recorrido Preorden");
            System.out.println("6) Mostrar recorrido Postorden");
            System.out.println("7) Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del empleado: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese nombre del empleado: ");
                    String nombre = sc.nextLine();
                    arbol.insertar(id, nombre);
                    break;
                case 2:
                    System.out.print("Ingrese ID a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();
                    NodoEmpleado encontrado = arbol.buscar(idBuscar);
                    if (encontrado != null)
                        System.out.println("Empleado encontrado: " + encontrado);
                    else
                        System.out.println("Empleado NO encontrado.");
                    break;
                case 3:
                    System.out.print("Ingrese ID a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    arbol.eliminar(idEliminar);
                    System.out.println("Eliminado si existía.");
                    break;
                case 4:
                    System.out.println("Recorrido Inorden:");
                    arbol.imprimirLista(arbol.recorridoInorden());
                    break;
                case 5:
                    System.out.println("Recorrido Preorden:");
                    arbol.imprimirLista(arbol.recorridoPreorden());
                    break;
                case 6:
                    System.out.println("Recorrido Postorden:");
                    arbol.imprimirLista(arbol.recorridoPostorden());
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);

        arbol.cerrarLog();
        sc.close();
    }
}
