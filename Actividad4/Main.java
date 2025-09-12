package Actividad4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        // Datos base
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro", "Sofía", "Carlos", "Lucía", "Miguel", "Laura", "Jorge",
                            "Elena", "Andrés", "Paula", "Fernando", "Carmen", "Raúl", "Isabel", "Diego", "Silvia", "Alberto"};
        String[] puestos = {"Gerente", "Analista", "Programador", "Diseñador", "Soporte", "Ventas", "Recursos Humanos", "Contador"};

        Random rand = new Random();

        // Insertar 100 empleados automáticos
        for (int i = 1; i <= 100; i++) {
            String nombre = nombres[rand.nextInt(nombres.length)];
            String puesto = puestos[rand.nextInt(puestos.length)];
            arbol.insertar(new Empleado(i, nombre, puesto));
        }

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
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese puesto: ");
                    String puesto = sc.nextLine();
                    arbol.insertar(new Empleado(id, nombre, puesto));
                    System.out.println("Empleado insertado.");
                    break;
                case 2:
                    System.out.print("Ingrese ID a buscar: ");
                    int idBuscar = sc.nextInt();
                    Empleado encontrado = arbol.buscar(idBuscar);
                    if (encontrado != null) {
                        System.out.println("Empleado encontrado: " + encontrado);
                    } else {
                        System.out.println("Empleado con ID " + idBuscar + " NO existe.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese ID a eliminar: ");
                    int idEliminar = sc.nextInt();
                    boolean eliminado = arbol.eliminar(idEliminar);
                    if (eliminado) {
                        System.out.println("Empleado con ID " + idEliminar + " eliminado.");
                    } else {
                        System.out.println("Empleado con ID " + idEliminar + " NO existe.");
                    }
                    break;
                case 4:
                    arbol.inorden();
                    break;
                case 5:
                    arbol.preorden();
                    break;
                case 6:
                    arbol.postorden();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);

        sc.close();
    }
}