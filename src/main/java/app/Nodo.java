package app;

public class Nodo<T> {
    private int llave;
    private T valor;
    private Nodo<T> siguiente;

    public Nodo(T valor, int llave) {
        this.valor = valor;
        this.siguiente = null;
        this.llave = llave;
    }

    public T obtenerValor() {
        return valor;
    }
    public void enlazarSiguiente(Nodo<T> n) {
        siguiente = n;
    }

    public Nodo<T> obtenerSiguiente() {
        return siguiente;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }


}