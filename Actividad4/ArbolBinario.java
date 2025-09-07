package Actividad4;
public class ArbolBinario {
	Nodo raiz;
	public ArbolBinario() {
		raiz=null;
	}
	//método para insertar nodo en árbol
	public void agregarNodo (int d, String nom) {
		Nodo nuevo= new Nodo(d,nom);
		if (raiz==null) {
			raiz=nuevo;
		} else {
			Nodo auxiliar=raiz;
			Nodo padre;
			while (true) {
				padre=auxiliar;
				if (d<auxiliar.dato) {
					auxiliar=auxiliar.hijoizquierdo;
					if (auxiliar==null) {
						padre.hijoizquierdo=nuevo;
						return;
					}
				}else {
					auxiliar=auxiliar.hijoderecho;
					if (auxiliar==null) {
						padre.hijoderecho=nuevo;
						return;
					}
				}
			}
		}
	}
	//método para saber si el árbol está vacío
	public boolean estaVacio() {
		return raiz == null;
			
	}
	//método para recorrer el árbol inorden
	public void inorden(Nodo r) {
		if (r!= null) {
			inorden(r.hijoizquierdo);
			System.out.println(r.dato);
			inorden(r.hijoderecho);
		}
	}
	
}
