package Proyecto;

public class NodoCola {

    private String nombre;
    private int cantidad;
    private NodoCola atras;

    public NodoCola(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "El cliente= " + nombre + " realizó la compra de : " + cantidad + " asientos.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }

}
