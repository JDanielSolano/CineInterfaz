package Proyecto;

public class Listas {

    private Nodo cabeza;
    private Nodo ultimo;

    public void insertar() {
        int cont = 2;
        cabeza = new Nodo(new Asientos(1, true));
        ultimo = cabeza;
        while (cont <= 24) {
            Nodo aux = new Nodo(new Asientos(cont, true));
            ultimo.setNext(aux);
            ultimo = aux;
            cont++;
        }
        ultimo.setNext(cabeza);
    }

    public void cambiar(int Numero) { //Metodo que cambia el estado del asiento a ocupado
        Nodo aux = cabeza;
        if (aux.getDato().getNumero() == Numero) {
            aux.getDato().setEstado(false);
        }

        aux = aux.getNext();

        while (aux != cabeza) {

            if (aux.getDato().getNumero() == Numero) {
                aux.getDato().setEstado(false);
            }
            aux = aux.getNext();
        }
    }

    public void cambiarv(int Numero) { //Metodo que cambia el estado del asiento a desocupado
        Nodo aux = cabeza;
        if (aux.getDato().getNumero() == Numero) {
            aux.getDato().setEstado(true);
        }

        aux = aux.getNext();

        while (aux != cabeza) {

            if (aux.getDato().getNumero() == Numero) {
                aux.getDato().setEstado(true);
            }
            aux = aux.getNext();
        }
    }

    @Override
    public String toString() {
        String msj = "";
        Nodo aux = cabeza;
        if (cabeza != null) {
            msj += aux + "\n";
            aux = aux.getNext();
            while (aux != cabeza) {
                msj += aux + "\n";
                aux = aux.getNext();
            }
        }
        return msj;
    }

    public boolean existe(int Numero) { //Valida que los asientos existan.
        boolean esta = true;
        Nodo aux = cabeza;
        if (aux.getDato().getNumero() == Numero) {
            esta = aux.getDato().getEstado();
        }
        aux = aux.getNext();
        while (aux != cabeza) {
            if (aux.getDato().getNumero() == Numero) {
                esta = aux.getDato().getEstado();
            }
            aux = aux.getNext();
        }

        return esta;
    }
}
