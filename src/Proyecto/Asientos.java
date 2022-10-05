package Proyecto;

public class Asientos {

    private int numero;
    private boolean estado;

    @Override
    public String toString() {
        return "Asientos{" + "numero=" + numero + ", estado=" + estado + '}';
    }

    public Asientos() {
    }

    public Asientos(int numero, boolean estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
