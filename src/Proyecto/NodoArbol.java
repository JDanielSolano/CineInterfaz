package Proyecto;

public class NodoArbol {

    private Persona dato;
    private NodoArbol hijoIzq;
    private NodoArbol hijoDer;

    public NodoArbol() {
    }

    public NodoArbol(Persona dato) {
        this.dato = dato;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }

    @Override
    public String toString() {
        return "NodoArbol{" + "dato=" + dato + '}';
    }
}
