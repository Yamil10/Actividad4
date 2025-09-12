# 📂 Gestión de Empleados con Árbol Binario

Este proyecto es una aplicación de consola en **Java** que implementa un sistema básico de gestión de empleados utilizando un **árbol binario de búsqueda (BST)**. Permite almacenar, buscar, eliminar y visualizar la información de los empleados de una manera eficiente y organizada.

---

## ✨ Características Principales

* **Inserción Dinámica**: Los empleados se agregan al árbol basándose en su ID, manteniendo la estructura ordenada.
* **Búsqueda Rápida**: Puedes encontrar a un empleado específico de forma eficiente utilizando su ID.
* **Eliminación Segura**: Permite eliminar empleados del árbol y reajustar su estructura para mantener la integridad.
* **Recorridos de Árbol**: Muestra los datos de los empleados en tres formatos de recorrido estándar:
    * **Inorden**: Muestra los empleados en orden ascendente por ID.
    * **Preorden**: Útil para copiar la estructura del árbol.
    * **Postorden**: Útil para eliminar el árbol por completo de forma segura.
* **Datos Aleatorios Iniciales**: El programa inserta automáticamente 100 empleados al inicio para facilitar las pruebas.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje de Programación**: Java
* **Estructura de Datos**: Árbol Binario de Búsqueda (Binary Search Tree)

---

## 🚀 Cómo Ejecutar el Proyecto

1.  Asegúrate de tener instalado el **Java Development Kit (JDK)** en tu sistema.
2.  Clona este repositorio en tu máquina local.
3.  Abre el proyecto en tu **IDE** preferido (como **IntelliJ IDEA**, **Eclipse** o **Visual Studio Code**).
4.  Ejecuta la clase `Main.java`.
5.  Sigue las instrucciones del menú en la consola para interactuar con el sistema.

---

## 📖 Estructura del Código

El proyecto está organizado en varias clases, cada una con una responsabilidad específica:

* `Main.java`: Contiene el método principal (`main`) y el **bucle del menú** que maneja la interacción con el usuario.
* `Empleado.java`: Una clase simple que representa a un empleado con sus atributos: `id`, `nombre` y `puesto`.
* `NodoEmpleado.java`: Representa un **nodo** en el árbol. Cada nodo contiene un objeto `Empleado` y referencias a los nodos `izquierda` y `derecha`.
* `ArbolBinario.java`: La clase principal que implementa la lógica del árbol binario de búsqueda, incluyendo los métodos de `insertar`, `buscar`, `eliminar` y los tres tipos de `recorrido`.

---

## 📝 Ejemplos de Uso

1.  **Insertar un nuevo empleado**:
    ```
    Ingrese ID: 101
    Ingrese nombre: Juan Perez
    Ingrese puesto: Jefe de Proyecto
    Empleado insertado.
    ```
2.  **Buscar un empleado**:
    ```
    Ingrese ID a buscar: 55
    Empleado encontrado: [55 - Laura - Ventas]
    ```
3.  **Mostrar recorrido Inorden**:
    ```
    Recorrido Inorden: [1 - ...], [2 - ...], [3 - ...], ...
    ```

---

## 👨‍💻 Autor

* **Tu Nombre o Nombre de Usuario en GitHub** - [Enlace a tu perfil de GitHub]

---

## 📜 Licencia

Este proyecto está bajo la Licencia **MIT**. Consulta el archivo `LICENSE.md` para más detalles.
