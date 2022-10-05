package Proyecto;

public class Cola {

    private NodoCola frente;
    private NodoCola ultimo;

    public void Encola(NodoCola n) {
        if (frente == null) {
            frente = n;
//            ultimo = n; //lo puedo quitar de la sección y usarlo al final
        } else {
            ultimo.setAtras(n);
//            ultimo=n;
        }
        ultimo = n;
    }

    public NodoCola atiende() {
        NodoCola aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
            if (frente == null) {
                ultimo = null;
            }
        }
        return aux;
    }

    @Override
    public String toString() {

        NodoCola aux = frente;
        String msn = "";
        if (frente == null) {
            msn = "Cola está vacía";
        } else {
            while (aux != null) {
                msn += aux + "\n";
                aux = aux.getAtras();
            }
        }
        return msn;

    }
}
