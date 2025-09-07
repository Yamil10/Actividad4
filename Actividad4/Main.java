package Actividad4;

import javax.swing.JOptionPane;

public class Main {
	public static void main (String[] args) {
		int opcion=0, elemento;
		String nombre;
		ArbolBinario arbolito =new ArbolBinario();
		do {
			try {
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
						"1. Agregar un Nodo\n"
						+ "2. Recorrer el árbol in order \n"
						+ "3. Salir \n"
								+ "Elige una opción. . .", "Árboles binarios", JOptionPane.QUESTION_MESSAGE));
				switch(opcion) {
				case 1:
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingresa el número del nodo. . .", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE ));
					nombre=JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
					arbolito.agregarNodo(elemento, nombre);
					break;
				case 2:
					if(!arbolito.estaVacio()) {
						arbolito.inorden(arbolito.raiz);
					} else {
						JOptionPane.showMessageDialog(null, "El árbol está vacío", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
					}
				case 3:
					JOptionPane.showMessageDialog(null, "Aplicación finalizada", "F I N", JOptionPane.INFORMATION_MESSAGE);
					break;
					default:
					JOptionPane.showMessageDialog(null, "Opción incorrecta", "Cuidado!!", JOptionPane.INFORMATION_MESSAGE);
				}
			}catch(NumberFormatException n){
				JOptionPane.showMessageDialog(null, "error" + n.getMessage() );
			}
			} while(opcion!=3);
		}
	}