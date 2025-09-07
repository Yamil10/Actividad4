package Actividad4;

public class Nodo {
	int dato;
	String nombre;
	Nodo hijoizquierdo, hijoderecho;
	public Nodo(int d, String nom){
		this.dato=d;
		this.nombre=nom;
		this.hijoizquierdo=null;
		this.hijoderecho=null;
	}
	public String toString() {
		return nombre+ "Su dato es" + dato;
	}
}
