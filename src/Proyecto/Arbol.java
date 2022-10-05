package Proyecto;

public class Arbol {

    private NodoArbol raiz;

    public void inserta(Persona p) {
        if (raiz == null) {
            raiz = new NodoArbol(p);
        } else {
            insertaRec(p, raiz);
        }
    }

    public void insertaRec(Persona p, NodoArbol n) {
        if (p.getId() < n.getDato().getId()) {
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new NodoArbol(p));
            } else {
                insertaRec(p, n.getHijoIzq());
            }
        } else {
            if (n.getHijoDer() == null) {
                n.setHijoDer(new NodoArbol(p));
            } else {
                insertaRec(p, n.getHijoDer());
            }
        }

    }

    public void inOrden() {
        if (raiz == null) {
            System.out.println("El árbol esta vacio");
        } else {
            inOrdenRec(raiz);
        }

    }

    public void inOrdenRec(NodoArbol n) {
        if (n != null) {
            inOrdenRec(n.getHijoIzq());
//            System.out.println(" " + n);

            inOrdenRec(n.getHijoDer());
        }
    }

    public boolean validar(String nombre, int pass) { //Este método valida que nombre de usuarios y las contraseña  se encuentren en el arbol.
        validar = false;
        if (raiz == null) {
            System.out.println("No existen clientes");
        } else {
            System.out.println(nombre + "  " + pass);
            validarRec(nombre, pass, raiz);
        }
        System.out.println(validar);
        return validar;
    }

    public void validarRec(String nombre, int pass, NodoArbol n) { //Este método es recursivo, compara el nombre y el id ingresado por el usuario con lo que se encuentra en el arbol.
        if (n != null) {
            if (n.getDato().getId() == pass && n.getDato().getNombre().equals(nombre)) {
                validar = true;
            }
            validarRec(nombre, pass, n.getHijoIzq());
            validarRec(nombre, pass, n.getHijoDer());
        }
    }
    boolean validar;
}
