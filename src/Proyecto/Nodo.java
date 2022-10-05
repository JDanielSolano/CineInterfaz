package Proyecto;

public class Nodo {

    private Asientos dato;
    private Nodo next;

    public Nodo(Asientos dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato;
    }

    public Asientos getDato() {
        return dato;
    }

    public void setDato(Asientos dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
