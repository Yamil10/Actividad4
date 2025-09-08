package Actividad4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, elemento;
        String nombre, trabajo;
        ArbolBinario arbolito = new ArbolBinario();
        Random rand = new Random();

        // Listas de nombres y trabajos para asignar aleatoriamente
        String[] nombres = {"Juan", "María", "Pedro", "Lucía", "Carlos", "Ana", "José", "Elena",
                "Luis", "Paula", "Diego", "Valeria", "Andrés", "Camila", "Mateo", "Isabella",
                "Daniel", "Sofía", "Jorge", "Fernanda"};
        String[] trabajos = {"Programador", "Diseñador", "Contador", "Administrador",
                "Ingeniero", "Doctor", "Abogado", "Profesor", "Arquitecto", "Vendedor"};

        // Precargar 100 empleados con nombres y trabajos aleatorios
        for (int i = 1; i <= 100; i++) {
            String nomAleatorio = nombres[rand.nextInt(nombres.length)] + "_" + i;
            String trabajoAleatorio = trabajos[rand.nextInt(trabajos.length)];
            arbolito.agregarNodo(i, nomAleatorio, trabajoAleatorio);
        }

        do {
            System.out.println("Menu");
            System.out.println("1. Agregar un Nodo");
            System.out.println("2. Recorrer el árbol Inorden");
            System.out.println("3. Buscar un Empleado por ID");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el número del nodo (ID): ");
                    elemento = sc.nextInt();
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Ingresa el nombre del empleado: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingresa el trabajo del empleado: ");
                    trabajo = sc.nextLine();
                    arbolito.agregarNodo(elemento, nombre, trabajo);
                    System.out.println("Empleado agregado correctamente.");
                    break;

                case 2:
                    if (!arbolito.estaVacio()) {
                        System.out.println("Recorrido Inorden");
                        arbolito.inorden(arbolito.raiz);
                    } else {
                        System.out.println("El árbol está vacío.");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el ID del empleado a buscar: ");
                    elemento = sc.nextInt();
                    Nodo encontrado = arbolito.buscarNodo(elemento);
                    if (encontrado != null) {
                        System.out.println("Empleado encontrado:");
                        System.out.println("ID: " + encontrado.dato);
                        System.out.println("Nombre: " + encontrado.nombre);
                        System.out.println("Trabajo: " + encontrado.trabajo);
                    } else {
                        System.out.println("Empleado no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Has salido del programa");
                    break;

                default:
                    System.out.println("Opción incorrecta, intenta de nuevo");
            }
        } while (opcion != 4);

        sc.close();
    }
}
