#Actividad 4
Este proyecto de **Gestión de Empleados** implementa un _árbol binario de búsqueda (BST)_ en *Java*. Permite administrar la información de empleados de manera eficiente.

---

## Lista con bullets
* **Inserción Dinámica**: Agrega empleados al árbol, ordenándolos por ID.
* **Búsqueda Rápida**: Encuentra empleados de forma eficiente por su ID.
* **Eliminación Segura**: Elimina empleados y reajusta la estructura del árbol.
* **Recorridos de Árbol**:
    * Muestra los datos en orden ascendente (*Inorden*).
    * Útil para copiar la estructura del árbol (*Preorden*).
    * Útil para eliminar el árbol de forma segura (*Postorden*).
* **Datos Aleatorios Iniciales**: Inserta 100 empleados automáticamente para pruebas.

---

## Lista con numeros
1. **Clonar el repositorio**:
    * Asegúrate de tener **JDK** instalado.
    * Clona el proyecto en tu máquina.
2. **Abrir en el IDE**:
    * Utiliza tu IDE preferido (IntelliJ, Eclipse, VS Code).
    * Ejecuta la clase `Main.java`.
3. **Interactuar con el menú**:
    1. Elige una opción.
    2. Ingresa los datos solicitados.
    3. Confirma la acción.
4. **Estructura del Código**:
    * `Main.java` - Lógica del menú principal.
    * `Empleado.java` - Clase que define los atributos de un empleado.
    * `NodoEmpleado.java` - Representa cada nodo del árbol.
    * `ArbolBinario.java` - Contiene la lógica del árbol (inserción, búsqueda, etc.).

---

## Links
[Repositorio de GitHub](http://github.com)

---

## BLOCKQUOTES
> Este proyecto utiliza recursión para la mayoría de sus operaciones con el árbol, como la inserción y la eliminación.

---

## FENCED CODE BLOCKS
```java
// Ejemplo de inserción en el main
arbol.insertar(new Empleado(1, "Ana", "Gerente"));
